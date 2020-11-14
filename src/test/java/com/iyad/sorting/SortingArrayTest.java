package com.iyad.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingArrayTest {


    @Test
    public void testArray(){
      int[] arr = new int[]{4,3,1};
      int[] sortedArr =   SortingArray.sort(arr);
      int[] expected = new int[]{1,3,4};
        assertEquals(Arrays.toString(expected), Arrays.toString(sortedArr));
    }
}