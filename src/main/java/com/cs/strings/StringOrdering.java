package com.cs.strings;

import java.util.Arrays;
import java.util.Objects;

/*
String ordering as below :
first, last, second, second-to-last, third, third-to-last ..., preserve middle if present
"wonder"  --> "wroend"
"wonders" --> "wsorned"
 */
public class StringOrdering {
	static void rearrange(String s){
		
		System.out.println("Input string is "+s + "--> "+ Arrays.toString(s.split("")));
		int i=0;
		int j=s.length() -1;
		StringBuilder sb = new StringBuilder();
		while (i<=j){
			sb.append(s.charAt(i));
			if(i!=j){
				// do not append the middle twice when the string length is odd
				sb.append(s.charAt(j));
			}
			i++;
			j--;
		}
		System.out.println("Re-arranged String is now = "+sb.toString() +" --> "+Arrays.toString(sb.toString().split(
		"")));
	}
	public static void main (String[] args) {
		rearrange("wonder");
		System.out.println("--------------");
		rearrange("wonders");
	}
}
