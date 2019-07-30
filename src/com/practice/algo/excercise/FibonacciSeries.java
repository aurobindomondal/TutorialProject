package com.practice.algo.excercise;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.println("Fibonacci Series : ");
		System.out.print(a+" "+b+" ");
		for(int i=0;i<10;i++) {
			a=a+b;
			b=a+b;
			System.out.print(a+" "+b+" ");
		}
	}

}
