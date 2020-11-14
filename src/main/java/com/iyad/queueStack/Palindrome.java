package com.iyad.queueStack;

import java.util.*;

public class Palindrome {

    private Stack<Character> stack = new Stack<>();
    private List<Character> queue = new LinkedList<>();


    public void pushCharacter(char c) {
        stack.push(c);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char popCharacter() {

        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove(0);
    }

    // Convert input String to an array of characters:
    public String convertStringToCharArray(String s) {
        char[] chars = s.toCharArray();


        Palindrome p = new Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : chars) {
           p.pushCharacter(c);
            p.enqueueCharacter(c);
        }
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length/ 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Finally, print whether string s is palindrome or not.
        return "The word, " + s + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome.");
    }
}




