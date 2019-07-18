package com.practice.sorting;

import java.util.Arrays;

/*
 * Merge Sort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves and then 
 * merges the two sorted halves. The merge() function is used for merging two halves. 
 * The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r] 
 * are sorted and merges the two sorted sub-arrays into one.
 * 
 * Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.
 * 
 * Auxiliary Space: O(n)
 * 
 * Algorithmic Paradigm: Divide and Conquer
*/
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Before:"+ Arrays.toString(arr));

		// merge sort
		sort(arr, arr.length);
		
		System.out.println("After:"+ Arrays.toString(arr));

	}

	private static void sort(int arr[], int n) {
		//if the length of array is less than 2 then there is no reason for sorting
		if (n < 2)
			return;

		// Find the middle point 
		int mid = arr.length / 2;
		
		/* Create temp arrays */	
		int[] L = new int[mid];
		int[] R = new int[n-mid];

		/*Copy data to temp arrays*/
		for (int i = 0; i < mid; i++)
			L[i] = arr[i];
		for (int i = mid; i < n; i++)
			R[i-mid] = arr[i];
		
		// Sort first and second halves
		sort(L,mid);
		sort(R,n-mid);

		// Merge the sorted halves
		merge(arr, L, R, mid, n-mid);
	}
	// Merges two subarrays of arr[]
	private static void merge(int[] arr, int[] L, int[] R, int left, int right) {
		// Initial indexes
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (L[i] <= R[j]) 
	            arr[k++] = L[i++];
	        else 
	            arr[k++] = R[j++];
	    }
	    /* Copy remaining elements of L[] if any */
	    while (i < left) 
	        arr[k++] = L[i++];
	    /* Copy remaining elements of R[] if any */
	    while (j < right) 
	        arr[k++] = R[j++];
	}
}
