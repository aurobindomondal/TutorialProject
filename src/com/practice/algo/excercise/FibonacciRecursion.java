package com.practice.algo.excercise;

/*
 * find n-th element in a fibonacci series
 * using backtracking and recursion
*/
public class FibonacciRecursion {
	static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}else {
			return fibonacci(n-1)+fibonacci(n-2);	
		}
		
	}
	public static void main(String[] args) {
		int a=7;
		System.out.println("element in fibonacci series is: "+fibonacci(a));
	}
}
