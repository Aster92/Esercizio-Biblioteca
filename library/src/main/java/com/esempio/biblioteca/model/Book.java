package com.esempio.biblioteca.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name= "books")
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable= false)
	private String title;
	
	@Column(nullable= false)
    private Date publicationDate;
	
	@ManyToMany
    @JoinTable(
    		name= "book_authors", 
    		joinColumns= @JoinColumn(name="book_id"), 
    		inverseJoinColumns= @JoinColumn(name= "author_id"))
	private List<Author> authors;
	
	@ManyToOne
    @JoinColumn(nullable= false, name= "publisher_id")
    private Publisher publisher;
	
	@Column(nullable=false, unique = true)
	private String ISBN;
	
	@ManyToMany(mappedBy="books", cascade = CascadeType.ALL)
	private List<Library> library;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	private List<Loan> loans;
	
}
