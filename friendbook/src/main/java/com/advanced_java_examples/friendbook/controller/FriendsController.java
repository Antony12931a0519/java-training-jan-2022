package com.advanced_java_examples.friendbook.controller;

import java.util.Arrays;
import java.util.List;

import com.advanced_java_examples.friendbook.models.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.advanced_java_examples.friendbook.service.FriendsService;

@RestController
@RequestMapping("/friends")
public class FriendsController {
	// when we go for final is during the time of initilization of the alues
	// autowired is for injecting the oject or for oject reatin of the clss
	@Autowired
	private FriendsService friendsService;

	@GetMapping("/friends")
	public List<String> getFriends() {
		return Arrays.asList("Abc", "DEF", "FNFJ");
	}


	@GetMapping(path = "/get")
	public List<Friends> getFriendsList() {

		return friendsService.getFriends();
	}

	@GetMapping(path = "/getFriends")
	public List<com.advanced_java_examples.friendbook.entities.Friends> getFriendsByLastName(@RequestParam("lastName") String lastName){

		return friendsService.getFriendByLastName(lastName);
	}

	@GetMapping(path = "/getFriendsByFirstNameAndLastName")
	public com.advanced_java_examples.friendbook.entities.Friends getFriendsByFirstNameAndLastName(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){

		return friendsService.getFriendsByFirstNameAndLastName(firstName, lastName);
	}

	/*
	* Hello
	* */
	@GetMapping(path = "/add")
	public List<String> addFriend() {
		return Arrays.asList("Abc", "DEF", "FNFJ");
	}

	@PostMapping(path = "/addFriends")
	public String addFriends(@RequestBody Friends friends){

		return friendsService.addFriends(friends);
	}

	//@PutMapping(path = "/update", consumes = {MediaType.APPLICATION_JSON_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE})
	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE} , produces = {MediaType.APPLICATION_JSON_VALUE} )
	public com.advanced_java_examples.friendbook.entities.Friends updateFriends(@RequestBody Friends friends){

		return friendsService.updateFriends(friends);
	}

	//@DeleteMapping(path = "/delete")
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE} )
	public String deleteFriends(@RequestBody Friends friends){

		return friendsService.deleteFriends(friends);
	}

	/*@DeleteMapping(path = "/deleteById/{id}")
	public String deleteFriendsById(@PathVariable("id") int id){
		return friendsService.deleteFriendsById(id);
	}*/

	@DeleteMapping(path = "/deleteById")
	public String deleteFriendById(@RequestParam("id") int id){
		return friendsService.deleteFriendById(id);
	}

	@DeleteMapping(path = "/deleteByParam")
	public String deleteFriendsByParam(@RequestParam("id") int id){
		return friendsService.deleteFriendsById(id);
	}

	@GetMapping(path = "/getAllFriends")
	public List<Object> getAllFriends(){
		return friendsService.getAllFriends();
	}


}
