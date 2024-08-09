package com.cs.strings;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	
	static void sort_using_comparator(){
		String[] fruits = {"orange", "banana", "grape", "apple"};
		System.out.println("Sorting using comparator (lexicographical ..");
		System.out.println("===========================");
		System.out.println("Before sorting :"+Arrays.toString(fruits));
		Arrays.sort(fruits, Comparator.comparing(String::toString));
		System.out.println("After sorting  :"+Arrays.toString(fruits));
	}
	
	static void sort_using_custom_comparator(){
		String[] fruits = {"orange", "banana", "grape", "apple"};
		System.out.println("Sorting using custom comparator (Length)");
		System.out.println("===========================");
		System.out.println("Before sorting :"+Arrays.toString(fruits));
		Arrays.sort(fruits, Comparator.comparing(String::length));
		System.out.println("After sorting  :"+Arrays.toString(fruits));
	}
	
	static void sort_using_streams(){
		String[] fruits = {"orange", "banana", "grape", "apple"};
		System.out.println("Sorting using Java Streams");
		System.out.println("===========================");
		System.out.println("Before sorting :"+Arrays.toString(fruits));
		
		fruits = Arrays.stream(fruits) // create a stream from the array
		.sorted()
		.toArray(String [] :: new); // toArray() returns Object [] hence toArray(String [] :: new)
		System.out.println("After sorting  :"+Arrays.toString(fruits));
	}
	public static void main (String[] args) {
		
		/*
		1) custom comparator (can be default lexicographical or custom ordering)
		2) java streams leveraging functional programming features in Java 8 and Stream API
		3) Arrays.sort
		 */
		
		sort_using_comparator();
		System.out.println();
		sort_using_custom_comparator();
		System.out.println();
		sort_using_streams();
	}
	
	
}
