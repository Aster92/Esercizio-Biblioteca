package com.example.library.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Book;
import com.example.library.model.Loan;
import com.example.library.model.Member;
import com.example.library.repository.LoanRepository;
import com.example.library.repository.MemberRepository;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Loan save(Loan loan) {
		if(loan.isDamaged()) {
			loan.getMember().setWarnings((byte) (loan.getMember().getWarnings() +1));
			if(loan.getMember().getWarnings()==3) {
				loan.getMember().setBlocked(true);
			}
			memberRepository.save(loan.getMember());
		}
		return loanRepository.save(loan);
	}
	
	public List<Loan> findAll(){
		return loanRepository.findAll();
	}
	
	public Loan findById(Long id) {
		return loanRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Loan not found"));
	}
	
	public void deleteById(Long id) {
		loanRepository.deleteById(id);
	}
	
	public String addLoanToMember(Book book, Member member) {
		if(loanRepository.findByMemberIdAndLoanReturnedDateIsNull(member.getId()).size()<3 && !member.isBlocked()) {
			Loan loan= new Loan();
			loan.setBook(book);
			loan.setMember(member);
			loan.setLoanDate(LocalDateTime.now());
			save(loan);
			return "Approved";
		} else if(loanRepository.findByMemberIdAndLoanReturnedDateIsNull(member.getId()).size()>=3) {
			return "not Approved, the member has already 3 books out";
		} else {
			return "not Approved, the member has already 3 warnings";
		}
	}
}
