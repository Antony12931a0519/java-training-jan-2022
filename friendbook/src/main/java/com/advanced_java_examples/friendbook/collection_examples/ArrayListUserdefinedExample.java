package com.advanced_java_examples.friendbook.collection_examples;

import java.util.ArrayList;
import java.util.List;

import com.advanced_java_examples.friendbook.models.Friends;

public class ArrayListUserdefinedExample {

	public static void main(String[] args) {

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
		Friends friend3 = new Friends();
		friend3.setFriendId(101);
		friend3.setAddress("HYd");
		friend3.setFirstName("Abc");
		friend3.setLastName("ffq");

		friends.add(friend3);

		Friends friend4 = new Friends();
		friend4.setFriendId(102);
		friend4.setAddress("HYd");
		friend4.setFirstName("Abc");
		friend4.setLastName("ffq");

		friends.add(friend4);
		
		if(friends != null && !friends.isEmpty() && friends.size()>0){
			
			for(Friends friend:friends){
				System.out.println(friend);
				
			}
			
		}
		
		System.out.println(friends);

	}

}
