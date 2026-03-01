package com.example.library.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "libraries")
public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String address;

	@Column(nullable = false)
	private String city;

	@Column(nullable = false)
	private String province;

	@Column(nullable = false)
	private String state;

	@ManyToMany
	@JoinTable(
			name = "library_books",
			joinColumns = @JoinColumn(name = "library_id"),
			inverseJoinColumns = @JoinColumn(name = "book_id"))
	@JsonIgnoreProperties("library")
	private List<Book> books;

	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
	@ToString.Exclude
	@JsonIgnoreProperties("library")
	private List<Librarian> librarians;

}