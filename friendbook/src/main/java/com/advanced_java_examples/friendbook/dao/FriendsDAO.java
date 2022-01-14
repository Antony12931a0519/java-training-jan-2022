package com.advanced_java_examples.friendbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.advanced_java_examples.friendbook.entities.Friends;

public interface FriendsDAO extends CrudRepository<Friends, Integer> {

}
