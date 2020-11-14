package com.iyad.problem4;

public class JadenCase {

    public static String toJadenCase(String phrase) {

        StringBuilder sb = new StringBuilder();
        String[] arr = phrase.split("");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            char c =   Character.toUpperCase(s.charAt(0));
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = toJadenCase("iyad toba");
        System.out.println(s);
    }
}
