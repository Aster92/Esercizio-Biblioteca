package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {

}
