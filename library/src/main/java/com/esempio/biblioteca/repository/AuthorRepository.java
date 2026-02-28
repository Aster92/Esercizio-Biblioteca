package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
