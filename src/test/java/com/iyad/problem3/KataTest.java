package com.iyad.problem3;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

	@Test
	public void test(){
		assertEquals(2,Kata.mostFrequentItemCount(new int[]{3,-1,-1}));
		assertEquals(5,Kata.mostFrequentItemCount(new int[]{3,-1,-1,6,7,-1,5,6,-1,3,3,-1}));

	}

}