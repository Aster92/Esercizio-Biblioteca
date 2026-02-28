package com.esempio.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esempio.biblioteca.model.Loan;
import com.esempio.biblioteca.service.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
    private LoanService loanService;

    @PostMapping
    public Loan save(@RequestBody Loan loan) {
        return loanService.save(loan);
    }

    @GetMapping
    public List<Loan> findAll() {
        return loanService.findAll();
    }

    @GetMapping("/{id}")
    public Loan findById(@PathVariable Long id) {
        return loanService.findById(id);
    }
}
