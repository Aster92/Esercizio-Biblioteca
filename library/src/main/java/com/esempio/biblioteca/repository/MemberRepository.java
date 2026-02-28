package com.esempio.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esempio.biblioteca.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
