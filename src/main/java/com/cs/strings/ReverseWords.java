package com.cs.strings;

import java.util.Objects;
import java.util.Scanner;

public class ReverseWords {
	
	static String reverse(String str){
		
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("reversed text ="+rev);
		return rev;
	}
	
	static String bruteForce (String str) {
		Objects.requireNonNull(str);
		/*
		brute force reverse the string characters
		*/
		
		StringBuilder rev = new StringBuilder(); // let's not do String concatenation in a loop
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		
		return rev.toString();
		
		/*
		  Time complexity O(n)
		  Space complexity O(n)
		 */
	}
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while (true) {
			System.out.println("Enter word (or 'quit' to exit): ");
			input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
			}
			System.out.println("You entered :" + input);
			System.out.format("The entered word reversed is %s %n", reverse(input));
			System.out.format("The entered word reversed is %s %n", bruteForce(input));
		}
		
	}
}
