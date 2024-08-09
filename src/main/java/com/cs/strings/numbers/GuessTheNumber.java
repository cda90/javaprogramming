package com.cs.strings.numbers;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		
		// Generate a number and answer questions
		// while the user tries to guess the value.
		int secret = 1 + (int) (Math.random() * 100);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("I'm thinking of a number ");
		System.out.println("between 1 and 100");
		
		int guess = 0;
		while (guess != secret) {
			
			// Solicit one guess and provide one answer
			System.out.print("What's your guess? ");
			guess = scanner.nextInt();
			if      (guess < secret) System.out.println("Too low");
			else if (guess > secret) System.out.println("Too high");
			else                     System.out.println("You win!");
		}
	}

}
