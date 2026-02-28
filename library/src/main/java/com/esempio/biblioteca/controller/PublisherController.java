package com.esempio.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esempio.biblioteca.model.Publisher;
import com.esempio.biblioteca.service.PublisherService;

@RestController
@RequestMapping("/publisher")
public class PublisherController {
	
	@Autowired
    private PublisherService publisherService;

    @PostMapping
    public Publisher save(@RequestBody Publisher publisher) {
        return publisherService.save(publisher);
    }

    @GetMapping
    public List<Publisher> findAll() {
        return publisherService.findAll();
    }

    @GetMapping("/{id}")
    public Publisher findById(@PathVariable Long id) {
        return publisherService.findById(id);
    }
}
