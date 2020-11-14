package com.iyad.hightscore;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighScroeTest {

	@Test
	public  void test(){
		assertEquals("taxi",HighScroe.high("man i need a taxi up to ubud"));
		assertEquals("volcano",HighScroe.high("what time are we climbing up to volcano"));
	}
}