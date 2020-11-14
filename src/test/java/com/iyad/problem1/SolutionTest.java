package com.iyad.problem1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {


	@Test
	public void testSomeUnderScoreLowerStart() {
		String input = "the_war_code";
		System.out.println("input is " + input);
		assertEquals("theWarCode", Solution.toCamelTest(input));
	}

	@Test
	public void testDashLowerStart() {
		String input = "The-War-Code";
		System.out.println("input is " + input);
		assertEquals("TheWarCode", Solution.toCamelTest(input));
	}
	@Test
	public void testSpicialCharLowerStart() {
		String input = "The&War*Code";
		System.out.println("input is " + input);
		assertEquals("TheWarCode", Solution.toCamelTest(input));
	}
}