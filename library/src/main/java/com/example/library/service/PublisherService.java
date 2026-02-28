package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Publisher;
import com.example.library.repository.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	private PublisherRepository publisherRepository;
	
	public Publisher save(Publisher publisher) {
		return publisherRepository.save(publisher);
	}
	
	public List<Publisher> findAll(){
		return publisherRepository.findAll();
	}
	
	public Publisher findById(Long id) {
		return publisherRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Publisher not found"));
	}
	
	public void deleteById(Long id) {
		publisherRepository.deleteById(id);
	}
	
}
