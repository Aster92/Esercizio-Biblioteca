package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Iscritti;

public interface iscrittiRepository extends JpaRepository<Iscritti, Long> {

}
