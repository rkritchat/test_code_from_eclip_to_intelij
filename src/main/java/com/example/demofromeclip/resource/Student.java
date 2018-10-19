package com.example.demofromeclip.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Student {
	
	@GetMapping
	public String test() {
		return "Updated from intelij IDE";
	}
}
