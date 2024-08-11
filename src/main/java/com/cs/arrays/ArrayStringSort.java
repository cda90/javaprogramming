package com.cs.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayStringSort {
	
	/**
	 * using Arrays.sort API
	 */
	static void sortStringArray(){
		String[] unsorted = {"planet", "Earth", "my", "is"};
		System.out.println("Unsorted String array is : "+ Arrays.toString(unsorted));
		Arrays.sort(unsorted); // sorts by default in ascending order
		System.out.println("Sorted String array is : "+ Arrays.toString(unsorted));
		
		// to sort in descending order
		Arrays.sort(unsorted, Collections.reverseOrder());
		System.out.println("Sorted String array in reverse order : "+ Arrays.toString(unsorted));
	}
	
	/**
	 * Sort using comparision and for loop
	 */
	static void sortUsingComparing(){
		String[] unsorted = {"planet", "Earth", "my", "is"};
		System.out.println("Unsorted String array is : "+ Arrays.toString(unsorted));
		String temp;
		int size = unsorted.length;
		for(int i=0; i<size; i++){
			for(int j=i+1; j<size;j++){
				if(unsorted[i].compareTo(unsorted[j])> 0) {
					//swap
					temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted String array is : "+ Arrays.toString(unsorted));
	}
	
	public static void main (String[] args) {
		
		sortStringArray();
		System.out.println("------------------------------");
		sortUsingComparing();
		
	}
}
