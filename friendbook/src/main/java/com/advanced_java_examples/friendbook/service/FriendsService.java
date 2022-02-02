package com.advanced_java_examples.friendbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.advanced_java_examples.friendbook.dao.FriendsDao;
import com.advanced_java_examples.friendbook.entities.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendsService
{

	@Autowired
	private FriendsDao friendsDao;

	public List<com.advanced_java_examples.friendbook.models.Friends> getFriends()
	{

		List<com.advanced_java_examples.friendbook.models.Friends> friendsFromModel = new ArrayList<>();


		List<com.advanced_java_examples.friendbook.entities.Friends> friends = new ArrayList<com.advanced_java_examples.friendbook.entities.Friends>();
		Iterable<com.advanced_java_examples.friendbook.entities.Friends> friendListFromDb = friendsDao.findAll();
		for(com.advanced_java_examples.friendbook.entities.Friends friend : friendListFromDb)
		{
			com.advanced_java_examples.friendbook.models.Friends friendListFromModel = new com.advanced_java_examples.friendbook.models.Friends();
			friendListFromModel.setFriendId(friend.getFriendId());
			friendListFromModel.setFirstName(friend.getFirstName());
			friendListFromModel.setLastName(friend.getLsatName());
			friendListFromModel.setAddress(friend.getAddress());
			friendListFromModel.setMobile(friend.getMobile());

			friendsFromModel.add(friendListFromModel);

		}




//
//		Friends friend1 = new Friends();
//		friend1.setFriendId(101);
//		friend1.setAddress("HYd");
//		friend1.setFirstName("Abc");
//		friend1.setLastName("ffq");
//
//		friends.add(friend1);
//
//		Friends friend2 = new Friends();
//		friend2.setFriendId(102);
//		friend2.setAddress("HYd");
//		friend2.setFirstName("Abc");
//		friend2.setLastName("ffq");
//
//		friends.add(friend2);

		return friendsFromModel;

	}

	public String addFriends(com.advanced_java_examples.friendbook.models.Friends friends)
	{

		Friends friend = new Friends();
		friend.setFriendId(friends.getFriendId());
		friend.setFirstName(friends.getFirstName());
		friend.setLsatName(friends.getLastName());
		friend.setAddress(friends.getAddress());
		friend.setMobile(friends.getMobile());

		friend = friendsDao.save(friend);

		if (friend.getFriendId() != 0)
			return "Data inserted successfully.";
		else
			return "Error, Data not inserted.";
	}

	public Friends updateFriends(com.advanced_java_examples.friendbook.models.Friends friends)
	{

		//update TABLE_NAME set COLUMN_NAME = NEW_NAME where TABLE_NAME.COLUMN_NAME = SOME_VALUE
		Optional<Friends> friend = friendsDao.findById(friends.getFriendId());

		if (friend.isPresent())
		{
			Friends updateFriend = friend.get();

			updateFriend.setFirstName(friends.getFirstName());
			updateFriend.setLsatName(friends.getLastName());
			updateFriend.setAddress(friends.getAddress());
			updateFriend.setMobile(friends.getMobile());

			updateFriend = friendsDao.save(updateFriend);
			return updateFriend;
		}

		return null;

	}

	public String deleteFriends(com.advanced_java_examples.friendbook.models.Friends friends){

		Optional<Friends> friend = friendsDao.findById(friends.getFriendId());
		//Friends friend = new Friends();

		if(!friend.isPresent())
		{
			return "Data not present";
		}
		else
		{
			friendsDao.delete(friend.get());
			return "Data deleted successfully.";
		}
	}

	public String deleteFriendsById(int id){
		Optional<Friends> friends = friendsDao.findById(id);

		if(!friends.isPresent())
		{
			return "Data not present";
		}
		else
		{
			friendsDao.delete(friends.get());
			return "Data deleted successfully.";
		}
	}

	public List<Friends> getFriendByLastName(String lastName){

		List<Friends> friends = friendsDao.getFriendsByLastName(lastName);
		System.out.println(friends.size());
		return friends;
	}

	public Friends getFriendsByFirstNameAndLastName(String firstName, String lastName){

		return friendsDao.getFriends(firstName, lastName);
	}

	public String deleteFriendById(int friendId){

		Optional<Friends> friends = friendsDao.findById(friendId);

		if(!friends.isPresent())
		{
			return "Data not present";
		}
		else
		{
			friendsDao.deleteFriendUsingId(friendId);
			return "Data deleted successfully.";
		}
	}

	public List<Object> getAllFriends(){
		return friendsDao.getAllFriends();
	}


}

