package com.practice.searching.excercise;

import java.util.Arrays;

/*Given a sorted array that can contain duplicates, 
 * find the first occurrence of a target element T. 
 * For example, if A = [2,3,4,4,5,6] and T = 4, return index 2.
*/		
public class BinarySearchDuplicates {

	static int searchFor=4;
	
	public static void main(String[] args) {
		int[] A = {2,3,4,4,5,6};
		
		
		System.out.println("Before: "+ Arrays.toString(A));
		int start=0;
		int end=A.length-1;
		int mid = (start+(end-start))/2;
		//binary search
		while(start<end) {
			if(A[mid]<searchFor ){
				start=mid;
				mid=(start+(end-start))/2;
			}else if(A[mid]>searchFor||(A[mid]==searchFor && A[mid-1]==searchFor)) {
				end=mid;
				mid=(start+(end-start))/2;
			}else {
				System.out.println("Match found at index: "+mid);
				start=end;
			}
		}
		
		//recursive
		start=0;
		end=A.length-1;
		mid = (start+(end-start))/2;
		System.out.println("[Recursive]Match found at index: "+binarySearch(A,start,end,mid));
		
		
	}
	
	public static int binarySearch(int[] arr, int start, int end, int mid) {
		while(start<end) {
			if(arr[mid]<searchFor) {
				start=mid;
				mid=(start+(end-start))/2;
				binarySearch(arr,start,end,mid);
			}else if(arr[mid]>searchFor||(arr[mid]==searchFor && arr[mid-1]==searchFor)) {
				end=mid;
				mid=(start+(end-start))/2;
				binarySearch(arr,start,end,mid);
			}else {
				break;
			}
				
		}
		return mid;
	}

}
