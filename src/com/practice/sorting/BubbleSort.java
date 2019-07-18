package com.practice.sorting;
/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly 
 * swapping the adjacent elements if they are in wrong order.
 * 
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 * Auxiliary Space: O(1)
 * Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
 * Sorting In Place: Yes
 * Stable: Yes
 */

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,4,2,8};
		boolean swapped;
		
		System.out.println("Before:"+ Arrays.toString(arr));

		//bubble sort
		for(int j=0;j<arr.length;j++) {
			swapped = false;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					// swap
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]=temp;
					swapped = true;
				}
			}
			// IF no two elements were  
            // swapped by inner loop, then break 
			if(swapped == false)
				break;
		}
		
		System.out.println("After"+ Arrays.toString(arr));
	}
}
