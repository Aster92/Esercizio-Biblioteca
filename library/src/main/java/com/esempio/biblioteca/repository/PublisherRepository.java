package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
