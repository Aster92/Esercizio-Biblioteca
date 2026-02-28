package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Library;
import com.example.library.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
    private LibraryService libraryService;

    @PostMapping
    public Library save(@RequestBody Library library) {
        return libraryService.save(library);
    }

    @GetMapping
    public List<Library> findAll() {
        return libraryService.findAll();
    }

    @GetMapping("/{id}")
    public Library findById(@PathVariable Long id) {
        return libraryService.findById(id);
    }
}
