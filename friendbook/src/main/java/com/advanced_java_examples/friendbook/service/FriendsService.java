package com.advanced_java_examples.friendbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advanced_java_examples.friendbook.dao.TestDAO;
import com.advanced_java_examples.friendbook.models.Friends;

@Service
public class FriendsService {
	@Autowired
	private  TestDAO testDAO;
	public List<Friends> getFriends() {
		List<Friends> friends = new ArrayList<Friends>();

		Friends friend1 = new Friends();
		friend1.setFriendId(101);
		friend1.setAddress("HYd");
		friend1.setFirstName("Abc");
		friend1.setLastName("ffq");

		friends.add(friend1);

		Friends friend2 = new Friends();
		friend2.setFriendId(102);
		friend2.setAddress("HYd");
		friend2.setFirstName("Abc");
		friend2.setLastName("ffq");

		friends.add(friend2);
		System.out.println("Test output:---->"+testDAO.findById( 1));

		return friends;

	}

}
