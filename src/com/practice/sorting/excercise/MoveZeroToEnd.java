package com.practice.sorting.excercise;

import java.util.Arrays;

/*
 * Move all zeroes to the end of the given integer array. 
 * For example, if A = [2,3,0,3,0,1,0], Output = [2,3,3,1,0,0,0]
*/
public class MoveZeroToEnd {
//not completed yet
	public static void main(String[] args) {
		int[] A = {2,3,0,3,0,1,0};
		System.out.println("Before: "+Arrays.toString(A));
		int count=0;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]!=0) {
				int c= count++;
				int temp=A[c];
				A[c]=A[i];
				A[i]=temp;
			}
		}
		System.out.println("After: "+Arrays.toString(A));
	}
}
