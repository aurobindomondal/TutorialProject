package com.practice.sorting.excercise;

import java.util.Arrays;

/*Given an array of positive integers, 
 * find the contiguous subarray that sums to a given number X
 */
public class SubarraySum {

	public static void main(String[] args) {
		int[] A = {2,1,4,5,3,5,1,2,4};
		System.out.println("Before: "+ Arrays.toString(A));
		int sum=0;
		int desiredsum=13;
		int start=0,end=0;
		
		while(start<A.length) {
			if(sum==desiredsum) {
				break;
			}
			else if(sum>desiredsum) {
				end++;
				if(end<A.length)
					sum+=A[end];
			}else if(sum<desiredsum){
				start++;
				if(start<A.length) {
					sum+=A[start];
				}else {
					break;
				}
			}
		}
		
		System.out.println("Finally: "+ start +" and "+end);
	}

}
