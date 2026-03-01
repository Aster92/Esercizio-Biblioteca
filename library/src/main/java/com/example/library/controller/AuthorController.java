package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Author;
import com.example.library.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController {
	
	@Autowired
    private AuthorService authorService;

    @PostMapping
    public Author save(@RequestBody Author author) {
        return authorService.save(author);
    }

    @GetMapping
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable Long id) {
        return authorService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        authorService.deleteById(id);
    }
}
