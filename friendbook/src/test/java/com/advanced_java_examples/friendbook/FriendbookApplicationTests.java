package com.advanced_java_examples.friendbook;

import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.advanced_java_examples.friendbook.dao.TestDAO;
import com.advanced_java_examples.friendbook.models.Friends;
import com.advanced_java_examples.friendbook.service.FriendsServiceImpl;

//@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class FriendbookApplicationTests {

	@InjectMocks
	FriendsServiceImpl serv;

	@Mock
	private TestDAO testDAO;

	@Test
	public void contextLoads() {
	}

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetFriendsForSuccess() {

		/*
		 * List<Friends> friends = new ArrayList<Friends>();
		 * 
		 * Friends friend1 = new Friends(); friend1.setFriendId(101);
		 * friend1.setAddress("HYd"); friend1.setFirstName("Abc");
		 * friend1.setLastName("ffq");
		 * 
		 * friends.add(friend1);
		 * 
		 * Friends friend2 = new Friends(); friend2.setFriendId(102);
		 * friend2.setAddress("HYd"); friend2.setFirstName("Abc");
		 * friend2.setLastName("ffq"); friends.add(friend2);
		 */
		// when ever i call some x method you have to retun the expected output

		// @SuppressWarnings("unchecked")
		// List<Friends> mockedObject =
		// Mockito.when(serv.getFriends()).thenReturn(friends);
		/*
		 * List<Friends> mockedObject = Mockito.doReturn(friends).when(serv)
		 * .getFriends();
		 */

		/*
		 * List<Friends> mockedObject =
		 * Mockito.doThrow(toBeThrown)(friends).when(serv) .getFriends();
		 */

		// Assert.assertEquals(2, mockedObject.getClass());

		Mockito.when(testDAO.findById(Matchers.anyInt())).thenReturn(null);

		List<Friends> friends = serv.getFriends();

		Assert.assertEquals(2, friends.size());
		Assert.assertEquals(102, friends.get(1).getFriendId());
	}
}
