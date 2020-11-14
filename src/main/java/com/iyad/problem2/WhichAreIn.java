package com.iyad.problem2;

import java.util.*;

public class WhichAreIn {

	public static String[] inArray(String[] arr1, String[] arr2) {
		//Variables
		List<String> unsortedList = new ArrayList<String>();
		String[] sortedString;

		// Algorithms steps
		// 1. Search and check if arr1 contains arr2 strings with its String
		// build an list when a match is found
		for (int i = 0; i < arr1.length; i++) {

             // check if a string
			for (int j = 0; j < arr2.length; j++) {

				if (arr2[j].contains(arr1[i])) {
					if (!unsortedList.contains(arr1[i])) {
						unsortedList.add(arr1[i]);
					}
				}
			}
		}
		Collections.sort(unsortedList);
		sortedString = new String[unsortedList.size()];
		for (int i = 0; i < unsortedList.size(); i++) {
			sortedString[i] = unsortedList.get(i);
		}

		return sortedString;
	}
}
