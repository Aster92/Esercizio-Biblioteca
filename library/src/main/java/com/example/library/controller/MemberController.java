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

import com.example.library.model.Member;
import com.example.library.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
    private MemberService memberService;

    @PostMapping
    public Member save(@RequestBody Member member) {
        return memberService.save(member);
    }

    @GetMapping
    public List<Member> findAll() {
        return memberService.findAll();
    }

    @GetMapping("/{id}")
    public Member findById(@PathVariable Long id) {
        return memberService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        memberService.deleteById(id);
    }
}
