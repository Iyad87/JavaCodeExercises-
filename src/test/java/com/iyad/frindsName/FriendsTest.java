package com.iyad.frindsName;

import org.junit.Test;

import static org.junit.Assert.*;

public class FriendsTest {

	@Test
	public void myFriendTest() {
		String[] names = {"Sami", "AbdulRahman","Fadi", "Ramiaa"};
		String[] myFriends = Friends.myFriend(names);
		String[] expectedArray = {"Sami", "Fadi"};
		assertArrayEquals(expectedArray, myFriends );
	}
}