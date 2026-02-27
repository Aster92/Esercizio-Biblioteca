package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Prestiti;

public interface prestitiRepository extends JpaRepository<Prestiti, Long> {

}
