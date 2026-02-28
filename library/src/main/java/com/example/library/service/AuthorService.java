package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Author;
import com.example.library.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public Author save(Author author) {
		return authorRepository.save(author);
	}
	
	public List<Author> findAll(){
		return authorRepository.findAll();
	}
	
	public Author findById(Long id) {
		return authorRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Author not found"));
	}
	
	public void deleteById(Long id) {
		authorRepository.deleteById(id);
	}
	
}
