package com.practice.searching.excercise;

import java.util.Arrays;


/*
 * Given a sorted array A that has been rotated in a cycle, find the smallest element of the array in O(log(n)) time. 
 * For example,
 * [1,2,4,5,7,8] rotated by 3 gives us A = [5,7,8,1,2,4] and the smallest number is 1. 
 * [1,2,4,5,7,8] rotated by 1 gives us A = [8,1,2,4,5,7] and the smallest number is 1.
*/

public class SearchSmallestCyclicSortedArray {

	public static void main(String[] args) {
       int[] A = {5,7,8,1,2,4};
		
		System.out.println("Before: "+ Arrays.toString(A));
		int low=0;
		int high=A.length-1;
		int right=A[A.length-1];
		int mid = 0;
		//binary search
		while(low<high) {
			mid = (low+high)/2;
			if(	A[mid]<=right &&(mid==0 || A[mid-1]>A[mid])) {
				break;
			}else if(A[mid]>right) {
				low=mid++;
			}else {
				high=mid--;
			}
		}
		System.out.println("Samllest element is at index: "+ mid +" and the elsement is "+A[mid]);
	}

}
