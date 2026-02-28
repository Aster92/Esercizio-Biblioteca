package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Library;
import com.example.library.repository.LibraryRepository;

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
