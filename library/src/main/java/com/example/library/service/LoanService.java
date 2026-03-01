package com.example.library.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.library.model.Loan;
import com.example.library.repository.LoanRepository;
import com.example.library.repository.MemberRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private MemberRepository memberRepository;

	public ResponseEntity<String> saveLoanReturn(Loan loan) {
		// if the book is damaged
		if (loan.isDamaged()) {
			loan.setLoanReturnedDate(LocalDateTime.now());
			loan.getMember().setWarnings((byte) (loan.getMember().getWarnings() + 1));
			if (loan.getMember().getWarnings() == 3) {
				loan.getMember().setBlocked(true);
			}
			memberRepository.save(loan.getMember());
			loanRepository.save(loan);
			return ResponseEntity.ok("Approved with warning. Actual warnings:" + loan.getMember().getWarnings());
		}

		// normal Loan return
		loan.setLoanReturnedDate(LocalDateTime.now());
		loanRepository.save(loan);
		return ResponseEntity.ok("Approved with no warning");
	}

	public ResponseEntity<String> saveNewLoan(Loan loan) {
		// if it's a normal loan
		if (loanRepository.findByMemberIdAndLoanReturnedDateIsNull(loan.getMember().getId()).size() < 3
				&& !loan.getMember().isBlocked()) {
			loan.setLoanDate(LocalDateTime.now());
			loanRepository.save(loan);
			return ResponseEntity.ok("Approved with no warning");
		} else

		// if the member has too many books out
		if (loanRepository.findByMemberIdAndLoanReturnedDateIsNull(loan.getMember().getId()).size() >= 3) {
			return ResponseEntity.badRequest().body("Not Approved, the member has already 3 books out");
		} else

		// if the member has already 3 warnings
		{
			return ResponseEntity.badRequest().body("Not Approved, the member has already 3 warnings and is blocked");
		}
	}

	public List<Loan> findAll() {
		return loanRepository.findAll();
	}

	public Loan findById(Long id) {
		return loanRepository.findById(id).orElseThrow(() -> new RuntimeException("Loan not found"));
	}

	public void deleteById(Long id) {
		loanRepository.deleteById(id);
	}
}
