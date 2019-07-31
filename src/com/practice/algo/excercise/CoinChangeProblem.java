package com.practice.algo.excercise;

import java.util.Arrays;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int x=5;
		int[] a = {1,2,5};
		int[] buffer = new int[x];
		combination(a, buffer, 0, 0);
	}

	private static void combination(int[] a, int[] buffer, intstartIndexi, int bufferIndex) {
		//termination case - buffer full
		if(bufferIndex == buffer.length) {
			System.out.println("[Aux Buffer]"+Arrays.toString(buffer));
			return;
		} 
		if(startIndex == a.length) {
			return;
		}
		
		for (int i = startIndex; i<a.length; i++) {
			//item inside buffer
			buffer[bufferIndex]=a[i];
			//recursion to next buffer index
			printCombos(a, buffer, i+1, bufferIndex+1);
		}
		
	}

}
