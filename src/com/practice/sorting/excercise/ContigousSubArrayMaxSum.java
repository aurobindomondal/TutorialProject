package com.practice.sorting.excercise;

/*
 * Given an array of integers, find the contiguous subarray with the maximum sum. 
 * The array can contain both negative and positive integers.
 */
import java.util.Arrays;

public class ContigousSubArrayMaxSum {
	public static void main(String[] args) {
		int[] A = {-2,-3,4,-1,-2,1,5,-3};
		
		System.out.println("Before: "+ Arrays.toString(A));
		
		if(A.length==0){
            return;
        }else if(A.length==1){
            return;
        }
		int max_so_far=0,max_ending_here=0;
		for(int i=0;i<A.length;i++) {
			max_ending_here=max_ending_here+A[i];
			if(max_ending_here<0)
				max_ending_here=0;
			else if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
			System.out.println("Max: "+ max_so_far);
		}
		
		System.out.println("Finally: "+ Arrays.toString(A));
	}
}
