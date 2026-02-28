package com.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.library.model.Member;
import com.example.library.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public Member save(Member member) {
		return memberRepository.save(member);
	}
	
	public List<Member> findAll(){
		return memberRepository.findAll();
	}
	
	public Member findById(Long id) {
		return memberRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Member not found"));
	}
	
	public void deleteById(Long id) {
		memberRepository.deleteById(id);
	}
	
}
