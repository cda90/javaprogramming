package com.cs.strings;

import java.util.Scanner;

/**
 * Palindrome - A word, phrase or sequence that reads the same backwards as forwards.
 * e.g.
 * madam
 * nurses run
 * A man, a plan, a canal: Panama
 */
public class Palindrome {
	
	static String response (boolean val) {
		return val ? "a Palindrome" : "NOT a Palindrome";
	}
	
	static boolean isPalindrome_using_two_pointers(String line){
		String textOnly = line.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		int left = 0;
		int right = textOnly.length() -1; // string indices start at 0
		
		while (left < right) {
			if(textOnly.charAt(left) != textOnly.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	static boolean bruteForce (String str) {
		/*
		brute force reverse the string characters and compare
		important to use ignore case when comparing as comparison uses ASCII (A not equal to a)
		ONLY single words will be accurate NOT phrases or sentences
		 */
		
		if (str == null) {
			return false;
		}
		// reverse the string and compare. if it is a palindrome then it will be same
		
		StringBuilder rev = new StringBuilder(); // lets not do String concatenation in a loop
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		
		return str.equalsIgnoreCase(rev.toString());
		
		/*
		  Time complexity O(n)
		  Space complexity O(n)
		 */
	}
	
	static boolean reverse(String str){
		// ONLY single words will be accurate NOT phrases or sentences
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("reversed text ="+rev);
		return (str.equals(rev));
	}
	
	static boolean isPalindrome(String line){
		String textOnly = line.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String rev = new StringBuilder(textOnly).reverse().toString();
		return textOnly.equals(rev);
	}
	

	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while (true) {
			System.out.println("Enter word or phrase (or 'quit' to exit): ");
			input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
			}
			System.out.println("You entered :" + input);
			//System.out.format("The entered word / phrase is %s %n", response(bruteForce(input)));
			//System.out.format("The entered word / phrase is %s %n", response(reverse(input)));
			//System.out.format("The entered word / phrase is %s %n", response(isPalindrome(input)));
			System.out.format("The entered word / phrase is %s %n", response(isPalindrome_using_two_pointers(input)));
			
			/**
			 * Palindrome Test strings :
			 * madam
			 * nurses run
			 * A man, a plan, a canal: Panama
			 * 767
			 *
			 * Not palindrom test strings :
			 * victory
			 * 769
			 */
		}
		
		
	}
}
