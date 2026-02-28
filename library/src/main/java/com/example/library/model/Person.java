package com.example.library.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Person {
	
	@Column(nullable=false)
    private String name;
	
	@Column(nullable=false)
	private String surname;
	
	@Column(nullable=false)
    private String address;
	
	@Column(nullable=false)
    private String city;
	
	@Column(nullable=false)
    private String province;
	
	@Email
	@Column(nullable = false, unique = true)
    private String email;
}