package com.iyad.phoneBook;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneBookTest {

	@Test
	public void testFindName() {
		int phoneNum = 012345;
		int expected = PhoneBook.findName("Iyad");

		assertEquals(phoneNum, expected);
	}
}