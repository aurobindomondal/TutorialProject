package com.practice.searching.excercise;

public class LeetCode33 {

	public static void main(String[] args) {
		LeetCode33 lc = new LeetCode33();
		int[] nums = new int[] {0,1,2,4,5,6,7};
		int target = 5;
		lc.search(nums, target);
	}
	
	public int search(int[] nums, int target) {
		if(nums==null || nums.length ==0) return -1;
        int left=0;
        int right=nums.length-1;
        
        while(left<right) {
        	int midpoint = (left+(right-left))/2;
        	if(nums[midpoint] > nums[right])
        		left = midpoint+1;
        	else
        		right = midpoint;
        	
        }
		return right;
    }
}
