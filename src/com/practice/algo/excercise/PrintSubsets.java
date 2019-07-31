package com.practice.algo.excercise;

/*
Print all subsets of an array of integers.
*/

public class PrintSubsets {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int[] buffer = new int[3];
		
		printCombos(a, new int[3], 0, 0);
	}
	
	static void printCombos(int[] a, int[] buffer, int startIndex, int bufferIndex) {
		print(buffer, bufferIndex);
		//termination case - buffer full
		if(bufferIndex == buffer.length) {
			//System.out.println("[Aux Buffer]"+Arrays.toString(buffer));
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
	
	static void print(int[] buffer, int bufferInex) {
		System.out.print("[");
		for(int j=0; j<bufferInex;j++)
		System.out.print(buffer[j]);
		System.out.print("]\n");
	}

}
