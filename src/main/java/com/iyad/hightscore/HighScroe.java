package com.iyad.hightscore;

public class HighScroe {

	public static String high(String s) {
		int maxValue = 0;
		String hightesValueString = "";
		// Split the string word
		String[] words = s.split(" ");

		// go through each word and check max value
		for (String word : words) {
			int tempValue = wordValue(word);
			// check if value is greater than the one already stored
			if (tempValue > maxValue) {
				maxValue = tempValue;
				hightesValueString = word;
			}
		}
		return hightesValueString;
	}

	private static int wordValue(String word) {

		int value = 0;

		for (char c : word.toCharArray()) {
			value += (int) c - 96;
		}

		return value;
	}
}

