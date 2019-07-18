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
		int low=-1;
		int mid=-1;
		int high=A.length;
		
		while(mid+1<high) {
			if(A[mid+1]==0) {
				int temp = A[mid+1];
				A[mid+1]=A[high-1];
				A[high-1]=temp;
				high--;
			}
			mid++;
		}
		System.out.println("After: "+Arrays.toString(A));
	}

}
