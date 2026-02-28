package com.esempio.biblioteca.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "loans")
public class Loan {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	@JoinColumn(nullable= false, name= "member_id")
	private Member member;
	
	@ManyToOne
	@JoinColumn(nullable= false, name= "book_id")
	private Book book;
	
	@Column(nullable= false)
	private Date loanDate;
	
	@Column(nullable= false)
	private Date loanReturnedDate;
	
	@Column(nullable=false)
	private boolean isDamaged= false;
}
