package com.practice.array;

/*
 * https://leetcode.com/problems/move-zeroes/
	283. Move Zeroes
	Easy
	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

	Example:

	Input: [0,1,0,3,12]
	Output: [1,3,12,0,0]
	*/
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
        if(nums.length==0){
            return;
        }
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int c= count++;
				int temp=nums[c];
				nums[c]=nums[i];
				nums[i]=temp;
			}
		}
    }
}
