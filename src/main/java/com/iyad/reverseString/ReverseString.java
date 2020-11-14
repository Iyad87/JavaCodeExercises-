package com.iyad.reverseString;

public class ReverseString {

	public  static  String revers(String word){

		StringBuilder sb = new StringBuilder();

		String [] words = word.split(" ");
           for (int i = words.length -1; i>=0; i-- ){
           	     sb.append(words[i]+ " ");
            }

		return sb.toString();
	}
}
