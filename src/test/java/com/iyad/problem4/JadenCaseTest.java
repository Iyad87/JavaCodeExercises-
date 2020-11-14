package com.iyad.problem4;

import org.junit.Test;

import static org.junit.Assert.*;

public class JadenCaseTest {


	JadenCase jadenCase = new JadenCase();

	@Test
	public void testNullArg() {
		assertEquals("Iyad", jadenCase.toJadenCase("iyad"));
	}

	@Test
	public void testEmptyArg() {
		assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
	}

}
