package com.practice.sorting.excercise;

import java.util.Arrays;

/*Reverse the order of elements in an array. 
 * For example, A = [1,2,3,4,5,6], Output = [6,5,4,3,2,1]
 */
public class ReversingArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("Before:"+ Arrays.toString(arr));
		
		//traversing from both ends
		for(int i=0,j=arr.length-1; i<j; i++,j--) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("After:"+ Arrays.toString(arr));

	}
}
