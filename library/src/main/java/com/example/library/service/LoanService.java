package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Loan;
import com.example.library.repository.LoanRepository;

@Service
public class LoanService {
	
	@Autowired
	private LoanRepository loanRepository;
	
	public Loan save(Loan loan) {
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
	
}
