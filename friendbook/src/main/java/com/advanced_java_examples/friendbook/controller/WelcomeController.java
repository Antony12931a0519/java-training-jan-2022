package com.advanced_java_examples.friendbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	// localhost:8080/welcome
	@GetMapping("/welcome")
	public String showWelcomeMessage() {
		return "Hello am working--------EEEEE";
	}

}
