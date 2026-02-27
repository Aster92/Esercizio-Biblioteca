package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Autori;

public interface autoriRepository extends JpaRepository<Autori, Long> {

}
