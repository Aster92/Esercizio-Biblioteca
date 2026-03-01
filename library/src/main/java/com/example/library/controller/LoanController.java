package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Loan;
import com.example.library.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
    private LoanService loanService;

    @PostMapping("/return")
    public ResponseEntity<String> saveLoanReturn(@RequestBody Loan loan) {
		return loanService.saveLoanReturn(loan);
    }
    
    @PostMapping
    public ResponseEntity<String> save(@RequestBody Loan loan) {
		return loanService.saveNewLoan(loan);
    }

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @GetMapping("/{id}")
    public Loan findById(@PathVariable Long id) {
        return loanService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        loanService.deleteById(id);
    }
}
