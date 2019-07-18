package com.practice.sorting.excercise;

import java.util.Arrays;

/*Given an array of numbers, replace each even number with two of the same number. 
 * e.g, [1,2,5,6,8] -> [1,2,2,5,6,6,8,8]. 
 * Assume that the array has enough space to accommodate the result.
 * By adding couple of -1 at the end to accommodate the duplicates
 */
public class CloneEvenNumbers {

	public static void main(String[] args) {
		int[] A = {1,2,5,6,8,-1,-1,-1};
		System.out.println("Before:"+ Arrays.toString(A));
		
		if (A != null || A.length != 0) {
			int end = A.length, i = getLastNumber(A);  
			while (i >= 0) { 
				if (A[i] % 2 == 0) {  
					A[--end] = A[i];    
					}        
				A[--end] = A[i];    
				i--;   
				}   
			System.out.println("After:"+ Arrays.toString(A));
		}
	}
	/* Helper Function: Ask interviewer if they want you to implement. */
	
	public static int getLastNumber(int[] a) {   
		int i = a.length - 1;    
		while (i >= 0 && a[i] == -1) {  
			i--;    
			}   
		return i;
		}
}
