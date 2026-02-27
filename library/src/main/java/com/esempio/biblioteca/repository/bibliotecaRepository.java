package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Biblioteca;

public interface bibliotecaRepository extends JpaRepository<Biblioteca, Long> {

}
