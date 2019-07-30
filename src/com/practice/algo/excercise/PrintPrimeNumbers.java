package com.practice.algo.excercise;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		boolean isPrime=false;
		System.out.print("Prime Numbers : 2 3 ");
		for(int i=4;i<20;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					isPrime=true;
				}
					
			}
			if(!isPrime)
				System.out.print(i+" ");
			
			isPrime=false;
		}

	}

}
