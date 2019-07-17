package com.practice.sorting;

/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element 
 * (considering ascending order) from unsorted part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.
 * 
 * Time Complexity: O(n2) as there are two nested loops.
 * Auxiliary Space: O(1)
 * 
 * The good thing about selection sort is it never makes more than O(n) 
 * swaps and can be useful when memory write is a costly operation.
*/

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 5, 2, 1, 7 };

		System.out.println("Before:");
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();

		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("After:");
		for (int i : arr)
			System.out.print(i + " ");
	}

}
