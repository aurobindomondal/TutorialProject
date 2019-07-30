package com.practice.sorting.excercise;

import java.util.Arrays;

/*
 * Given an array with n objects colored Red, White or Blue, 
 * sort them so that objects of the same color are adjacent, 
 * with the colors in the order Red, White and Blue. 
 * 
 * Assume the colors are given as numbers - 0 (Red), 1 (White) and 2 (Blue). For example, 
 * if A = [1,0,1,2,1,0,1,2], Output = [0,0,1,1,1,1,2,2].
*/
public class ThreeWayPartitioning {
public static void main(String[] args) {
	int[] A = {1,0,1,2,1,0,1,2};
	
	System.out.println("Before: "+ Arrays.toString(A));
	int low=-0,mid=-0;
	int high=A.length-1;
	while(mid<=high){
		switch (A[mid]) 
        { 
		//Red
        case 0: 
        { 
            int temp   =  A[low]; 
            A[low]  = A[mid]; 
            A[mid] = temp; 
            low++; 
            mid++; 
            break; 
        } 
        //white
        case 1: 
            mid++; 
            break; 
            
         //Blue
        case 2: 
        { 
            int temp = A[mid]; 
            A[mid] = A[high]; 
            A[high] = temp; 
            high--; 
            break; 
        } 
        } 
		System.out.println("After: "+ Arrays.toString(A));
	}
	System.out.println("Finally: "+ Arrays.toString(A));
}
}
