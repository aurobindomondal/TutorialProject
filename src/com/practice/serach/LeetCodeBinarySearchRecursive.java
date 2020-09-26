package com.practice.serach;

public class LeetCodeBinarySearchRecursive {

	public static void main(String[] args) {
		LeetCodeBinarySearchRecursive s = new LeetCodeBinarySearchRecursive();
		
		int[] nums = new int[] {-1,0,3,5,9,12};
		System.out.println(s.search(nums, 9));
	}
	
	public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        if(nums.length ==1 && nums[0] == target) return 0;
        else if(nums.length ==1)
            return -1;
        
        return RBinarySearch(0,nums.length-1, nums, target);
    }
    
    private int RBinarySearch(int low, int high, int[] nums, int target){
        if(low==high){
            if(nums[low] == target)
                return low;
            else
                return -1;
        }else if(low>high){
            return -1;
        }
        int mid = (high+low)/2;
        //System.out.println(mid);
        if(nums[mid] == target){
            return mid;
        }else if(target >= nums[mid]){ 
            return RBinarySearch(mid+1, high, nums, target);
        }else{
            return RBinarySearch(low, mid-1, nums, target);
        }
    }
}
