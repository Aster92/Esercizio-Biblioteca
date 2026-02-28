package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {

}
