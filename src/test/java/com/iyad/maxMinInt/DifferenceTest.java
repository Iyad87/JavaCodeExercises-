package com.iyad.maxMinInt;

import org.junit.Test;

import static org.junit.Assert.*;

public class DifferenceTest {

    @Test
    public void testComputeDifference(){

        int[] elements = {1,2,5 };
        int excepted = 4;

        assertEquals(excepted, Difference.computeDifference(elements));

    }
}