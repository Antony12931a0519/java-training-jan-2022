package com.advanced_java_examples.friendbook.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanced_java_examples.friendbook.models.Friends;
import com.advanced_java_examples.friendbook.service.FriendsService;

@RestController
@RequestMapping("/friends")
public class FriendsController {
	// when we go for final is during the time of initilization of the alues
	// autowired is for injecting the oject or for oject reatin of the clss
	@Autowired
	private FriendsService friendsService;
//test commit
	@GetMapping("/friends")
	public List<String> getFriends() {
		return Arrays.asList("Abc", "DEF", "FNFJ");
	}

	@GetMapping(path = "/list")
	public List<Friends> getFriendsList() {

		return friendsService.getFriends();
	}

	@GetMapping(path = "/add")
	public List<String> addFriend() {
		return Arrays.asList("Abc", "DEF", "FNFJ");
	}

}
