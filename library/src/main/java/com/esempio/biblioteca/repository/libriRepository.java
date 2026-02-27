package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Libri;

public interface libriRepository extends JpaRepository<Libri, Long> {

}
