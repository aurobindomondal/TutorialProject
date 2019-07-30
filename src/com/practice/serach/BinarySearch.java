package com.practice.serach;

import java.util.Arrays;

public class BinarySearch {

	static int searchFor=2;
	
	public static void main(String[] args) {
		int[] A = {1,2,4,7,8,9};
		
		
		System.out.println("Before: "+ Arrays.toString(A));
		int start=0;
		int end=A.length-1;
		int mid = (start+(end-start))/2;
		//binary search
		while(start<end) {
			if(A[mid]<searchFor) {
				start=mid;
				mid=(start+(end-start))/2;
			}else if(A[mid]>searchFor) {
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
			}else if(arr[mid]>searchFor) {
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
