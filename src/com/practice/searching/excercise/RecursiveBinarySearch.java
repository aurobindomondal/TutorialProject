package com.practice.searching.excercise;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		RecursiveBinarySearch search = new RecursiveBinarySearch();
		int[] result = new int[] {0,1,2,4,5,6,7};
		int key = 5;
		System.out.println("Index: "+search.RBinarySearch(0, result.length,result, key));
	}
	
	private int RBinarySearch(int l, int r, int[] result, int key) {
		if(l==r) {
			if(result[l]==key) return l;
			else return 0;
		}else {
			int mid = l+(r-l)/2;
			if(key==result[mid]) {
				return mid;
			}
			if(key>result[mid]) {
				return RBinarySearch(mid+1,r,result, key);
			}else {
				return RBinarySearch(l,mid-1,result, key);
			}
		}
	}
}
