package com.iyad.maxMinInt;

public class Difference {

    public static int maximumDifference;


    public static int computeDifference( int[] elements){
        int max = elements[0];
        int min = max;
        for (int i = 1; i<elements.length; i++){
            if (elements[i]> max){
                max = elements[i];
            }
            if (elements[i] < min){
                min = elements[i];
            }
        }
      return   maximumDifference = Math.abs(max-min);
    }
}
