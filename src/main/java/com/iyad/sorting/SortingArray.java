package com.iyad.sorting;

import java.util.Arrays;

public class SortingArray {

    public static int[] sort(int[] arr) {
        // {4,3,1}

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
         int[]s =  sort(new int[]{5, 3, 4});
         System.out.println(Arrays.toString(s));
    }
}
