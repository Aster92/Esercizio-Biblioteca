package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Bibliotecari;

public interface bibliotecariRepository extends JpaRepository<Bibliotecari, Long> {

}
