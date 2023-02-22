package com.polarbookshop.catalogservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.polarbookshop.catalogservice.config.PolarProperties;

@RestController
public class HomeController {
	private final PolarProperties polarProperties;
	
	@Value("${polar.info}")
	private String infoStr;

	public HomeController(PolarProperties polarProperties) { 
	    this.polarProperties = polarProperties; 
	} 
	
	@GetMapping("/")
	public String getGreeting() {
		return polarProperties.getGreeting();
	}
	
	@GetMapping("/info")
	public String getInfo() {
		return infoStr;
	}
}
