package com.iyad.frindsName;

import java.util.ArrayList;
import java.util.List;

public class Friends {

	static String[] myFriend(String[] friends){
            // 1. a place to store a real friends
		List<String>  myFriends = new ArrayList<String>();
		String[] realFriends = new String[]{};

		   // 2. iterate over the friends
		for (int i =0; i < friends.length; i++){
			// a. if the friends length is 4
			if(friends[i].length() == 4){
				// 1.a push into the real friends
			        myFriends.add(friends[i]);
			}
		}
		   // return real friends
		return myFriends.toArray(realFriends);
	}
}
