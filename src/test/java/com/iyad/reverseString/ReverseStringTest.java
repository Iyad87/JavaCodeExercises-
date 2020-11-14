package com.iyad.reverseString;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

	@Test
	public void testReverse(){
	    String words = "the sky is blue";
	    String expected = "blue is sky the ";
	    assertEquals(expected, ReverseString.revers(words));
	}
}