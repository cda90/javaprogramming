package com.cs.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnionIntersection {
	static int[] arr1 = { 12, 17, 22, 23, 29, 22, 11, 3 }; // m elements = 8
	static int[] arr2 = { 3, 5, 7, 10, 8, 5, 1, 17, 22 }; // n elements = 9
	
	/*
	We need to
	1) create an array which is an union of the above two arrays and removing duplicates
	2) create an array which is an intersection or common elements
	 */
	
	static void intersection () {
		Set<Integer> intersection = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					// we have a common element
					intersection.add(arr1[i]);
				}
			}
		}
		System.out.println("New Intersection array = " + Arrays.toString(intersection.stream().toArray()));
	}
	
	static void union () {
		/* use Set to filter out duplicates */
		Set<Integer> union = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				union.add(arr1[i]);
				union.add(arr2[j]);
			}
		}
		System.out.println("New Union array = " + Arrays.toString(union.stream().toArray()));
	}
	
	public static void main (String[] args) {
		System.out.println("Input arrays are : ");
		System.out.println("arr1[] = "+ Arrays.toString(arr1));
		System.out.println("arr2[] = "+ Arrays.toString(arr2));
		System.out.println("----------------------------------");
		intersection();
		union();
	}
}



