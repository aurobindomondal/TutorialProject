package com.practice.serach;

public class LeetCodeBinarySeachIterative707 {

	public static void main(String[] args) {
		LeetCodeBinarySeachIterative707 s = new LeetCodeBinarySeachIterative707();
		
		int[] nums = new int[] {-1,0,3,5,9,12};
		System.out.println(s.search(nums, 9));
	}

	public int search(int[] nums, int target) {
		if (nums.length == 0)
			return -1;
		if (nums.length == 1 && nums[0] == target)
			return 0;

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (high + low) / 2;

			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > target) {// lower
				high = mid - 1;
			} else {// higher
				low = mid + 1;
			}
		}
		return -1;
	}
}
