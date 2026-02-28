package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
