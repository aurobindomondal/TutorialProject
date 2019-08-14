package com.practice.array;

/*
 * https://leetcode.com/problems/rotate-array/
 * 189. Rotate Array
Easy
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

public class RotateArray {
	    public void rotate(int[] nums, int k) {
	    int n =nums.length;

	    if(nums.length==0|| nums.length==1){
	        return;
	    }else if(k>nums.length)
	        k=k%n;
	    else if(k==0)
	            return;
	        
	    int[] temp=new int[nums.length];
	    for(int m=0;m<nums.length;m++)
	      temp[m]=nums[m];

	    for(int i=0, j=n-k; j<n; i++, j++){
	        nums[i]=nums[j];
	    }

	    for(int j=k, l=0; l<n-k; j++,l++){
	      nums[j]=temp[l];
	    }
	}
	
}
