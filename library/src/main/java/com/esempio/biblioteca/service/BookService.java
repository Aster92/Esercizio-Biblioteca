package com.esempio.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esempio.biblioteca.model.Book;
import com.esempio.biblioteca.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book save(Book book) {
		return bookRepository.save(book);
	}
	
	public List<Book> findAll(){
		return bookRepository.findAll();
	}
	
	public Book findById(Long id) {
		return bookRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Book not found"));
	}
	
	public void deleteById(Long id) {
		bookRepository.deleteById(id);
	}
	
}
