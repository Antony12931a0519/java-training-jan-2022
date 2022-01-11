package com.advanced_java_examples.friendbook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FriendsController {
	
	@GetMapping("/friends")
	public List<String> getFriends(){
		return Arrays.asList("Abc","DEF","FNFJ");
	}

}
