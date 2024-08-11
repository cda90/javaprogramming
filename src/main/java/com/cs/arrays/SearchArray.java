package com.cs.arrays;

import java.util.Arrays;

public class SearchArray {
	static int [] input = {2, 34, 72, 88, 91, 101, 55, 27};
	
	/*
	divide the range into half each iteration and adjust the low and high for each loop
	divide and conquer
	performance much better O(logN) than brute force search which is O(N)
	 */
	static boolean binarySearch(int [] arr, int key){
		boolean ret = false;
		int low = 0;
		int high = arr.length - 1;
		
		while (low <= high){
			int mid = low + (high - low)/2; // recompute mid in each iteration
			if(key < arr[mid]) {
				// the search key is lesser than the middle element in the sorted range
				// so lower the higher end of the range
				high = mid -1;
			}
			else if (key > arr[mid]) {
				// search key is greater than the middle element in the sorted range
				// so increase the lower end of the range
				low = mid + 1;
			}
			else {
				ret = true;
				break; // important to exit
			}
		}
		return ret;
	}
	
	public static void main (String[] args) {
		// to do a binary search sort the input array
		Arrays.sort(input);
		// lets say we want to seach if 88 is present in the array. it should return true
		boolean result = binarySearch(input, 88);
		System.out.println("Binary search result is :"+result);
		
		// searching with a non-existing element will return false
		result = binarySearch(input, 89);
		System.out.println("Binary search result is :"+result);
	}
}
