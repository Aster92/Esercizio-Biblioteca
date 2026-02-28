package com.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.model.Librarian;

public interface LibrarianRepository extends JpaRepository<Librarian, Long> {

}
