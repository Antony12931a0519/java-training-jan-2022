package com.advanced_java_examples.friendbook.dao;

import com.advanced_java_examples.friendbook.entities.Friends;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface FriendsDao extends CrudRepository<Friends, Integer>
{

    public List<Friends> getFriendsByLastName(String lsatName);

    @Query("select friends from Friends friends where friends.firstName = :firstName and friends.lastName = :lsatName")
    public Friends getFriends(@Param("firstName") String firstName, @Param("lsatName") String lastName);


    @Query("delete from Friends friends where friends.friendId = :friendId")
    @Transactional
    @Modifying
    public void deleteFriendUsingId(@Param("friendId") int friendId);

    @Query(value = "select friend.first_name, friend.lsat_name from friends friend", nativeQuery = true)
    public List<Object> getAllFriends();
}
