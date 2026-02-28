package com.esempio.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esempio.biblioteca.model.Library;
import com.esempio.biblioteca.repository.LibraryRepository;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	public Library save(Library library) {
		return libraryRepository.save(library);
	}
	
	public List<Library> findAll(){
		return libraryRepository.findAll();
	}
	
	public Library findById(Long id) {
		return libraryRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Library not found"));
	}
	
	public void deleteById(Long id) {
		libraryRepository.deleteById(id);
	}

}
