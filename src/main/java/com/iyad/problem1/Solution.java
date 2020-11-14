package com.iyad.problem1;

public class Solution {

	static String toCamelTest(String s) {

		String camelCaseString;
		StringBuilder sb = new StringBuilder();
		// Algorithms Start Here
		// 1. Separate Each word
		String[] worldList = s.split("[-_*&]");
		// 2. Make all words uppercase except first one

		for (int i = 0; i < worldList.length; i++) {
			if (i == 0) {
				sb.append(worldList[i]);
			}
			if (i >= 1) {
				if (Character.isUpperCase(worldList[i].charAt(0))) {
					// check if  is uppercase
					// add to sb if is already uppercase
					sb.append(worldList[i]);

				}
				// check if lowercase
				if (Character.isLowerCase(worldList[i].charAt(0))) {
					String tempString = worldList[i].substring(0, 1).toUpperCase() + worldList[i].substring(1);
					// append
					sb.append(tempString);
				}
			}
		}

		camelCaseString = sb.toString();

		return camelCaseString;
	}
}
