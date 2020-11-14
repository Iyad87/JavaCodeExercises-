package com.iyad.queueStack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {


    Palindrome palindrome = new Palindrome();

    @Test
    public void testConvertStringToChar() {
         String s = "racecar";
         String excepted =  palindrome.convertStringToCharArray(s);
         assertEquals("The word, racecar, is a palindrome.",excepted);

    }

    @Test
    public void testFault(){
        String s1 = "topcar";
        String excepted1 =  palindrome.convertStringToCharArray(s1);
        assertEquals("The word, topcar, is not a palindrome.",excepted1);


    }
}