package com.practice.algo.excercise;

import java.util.Arrays;

/*
 * print all combination of length 3 
 * using Auxiliary buffer
 * */
public class PrintCombination {

	 
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		
		int[] buffer = new int[3];
		
		buffer[0]=a[0];
		for(int i=1; i<a.length;i++) {
			buffer[1]=a[i];
			for(int j=i+1;j<a.length;j++) {
				buffer[2]=a[j];
				System.out.println("[Traditional Way]"+Arrays.toString(buffer));
			}
		}
		
		
		printCombos(a, new int[3], 0, 0);
	}
	
	static void printCombos(int[] a, int[] buffer, int startIndex, int bufferIndex) {
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
