package com.iyad.phoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	public static int findName(String name) {
		Map<String, Integer> book = new HashMap<String, Integer>();
		book.put("iyad", 012345);
		int phoneNum = book.get("iyad");

		return phoneNum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		System.out.println("===== How many names do you want to put");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			hmap.put(name, phone);
			// Write code here
		}
		while (in.hasNext()) {
			String s = in.next();

			if (hmap.containsKey(s)) {
				System.out.println(s + "=" + hmap.get(s));

			} else {
				System.out.println("Not found");
			}

			// Write code here
		}
		in.close();
	}
}

