package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
