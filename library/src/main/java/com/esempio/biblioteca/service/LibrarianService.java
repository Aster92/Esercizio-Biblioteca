package com.esempio.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esempio.biblioteca.model.Librarian;
import com.esempio.biblioteca.repository.LibrarianRepository;

@Service
public class LibrarianService {

	@Autowired
	private LibrarianRepository librarianRepository;
	
	public Librarian save(Librarian librarian) {
		return librarianRepository.save(librarian);
	}
	
	public List<Librarian> findAll(){
		return librarianRepository.findAll();
	}
	
	public Librarian findById(Long id) {
		return librarianRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Librarian not found"));
	}
	
	public void deleteById(Long id) {
		librarianRepository.deleteById(id);
	}
	
}
