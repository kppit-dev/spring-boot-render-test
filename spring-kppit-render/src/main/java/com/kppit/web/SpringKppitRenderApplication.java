package com.kppit.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringKppitRenderApplication {
	
	@GetMapping
	public String getMessage() {
		return "Welcome to KPPIT !!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringKppitRenderApplication.class, args);
	}

}
