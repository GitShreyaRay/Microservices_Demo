package com.nice.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/helloservice")
	public String helloRestGetService() {
		return "This is my first Rest Get Service.";
	}
	
	@PostMapping("/helloservice")
	public String helloRestPostService() {
		return "This is my first Rest Post Service.";
	}
	
	@DeleteMapping("/helloservice")
	public String helloRestDeleteService() {
		return "This is my first Rest Delete Service.";
	}
	
	@PutMapping("/helloservice")
	public String helloRestPutService() {
		return "This is my first Rest Put Service.";
	}

}
