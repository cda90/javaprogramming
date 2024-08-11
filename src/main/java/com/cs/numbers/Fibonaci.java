package com.cs.numbers;

public class Fibonaci {
	static long F(int N){
		if (N == 0) return 0;
		if (N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	
	public static void main (String[] args) {
		for(int N =0; N < 15; N++){
			System.out.println(N + " " + F(N));
			/*
			Output
			0 0
			1 1
			2 1
			3 2
			4 3
			5 5
			6 8
			7 13
			8 21
			9 34
			10 55
			11 89
			12 144
			13 233
			14 377

			 */
		}
	}
}
