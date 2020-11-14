package com.iyad.problem3;

public class Kata {
	public static int mostFrequentItemCount(int[] collection) {
		int count;
		int currentDigit = 0;
		int highestCount = 0;
		for (int i = 0; i < collection.length; i++) {
			currentDigit = collection[i];
			count = 0;
			for (int j = 0; j < collection.length; j++) {
				if (collection[j] == currentDigit) {
					count++;
					if (count > highestCount) {
						highestCount = count;
					}
				}
			}
		}
		return highestCount;
	}
}
