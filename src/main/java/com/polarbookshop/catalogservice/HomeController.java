package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getGreeting() {
		return "Hello!";
	}
	
	@GetMapping("/info")
	public String getInfo() {
		return "Welcome to the book catalog!!!";
	}
}
