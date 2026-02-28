package com.example.library.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "members")
public class Member extends Person {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable=false)
	private LocalDateTime registrationDate;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	@ToString.Exclude
	private List<Loan> loans;
	
	@Column(nullable=false)
	private byte warnings=0;
	
	@Column(nullable=false)
	private boolean blocked= false;
}
