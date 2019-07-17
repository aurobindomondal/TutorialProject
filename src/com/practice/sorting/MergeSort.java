package com.practice.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		printAll(arr);

		// merge sort
		sort(arr, arr.length);

		printAll(arr);

	}

	private static void printAll(int[] arr) {
		System.out.println();
		for (int a : arr)
			System.out.print(a + " ");
	}

	private static void sort(int arr[], int n) {
		//if the length of array is less than 2 then there is no reason for sorting
		if (n < 2)
			return;

		int mid = arr.length / 2;
		int[] L = new int[mid];
		int[] R = new int[n-mid];

		for (int i = 0; i < mid; i++)
			L[i] = arr[i];
		for (int i = mid; i < n; i++)
			R[i-mid] = arr[i];
		
		sort(L,mid);
		sort(R,n-mid);

		merge(arr, L, R, mid, n-mid);
	}

	private static void merge(int[] arr, int[] L, int[] R, int left, int right) {
		int i = 0, j = 0, k = 0;
	    while (i < left && j < right) {
	        if (L[i] <= R[j]) 
	            arr[k++] = L[i++];
	        else 
	            arr[k++] = R[j++];
	    }
	    while (i < left) 
	        arr[k++] = L[i++];
	    while (j < right) 
	        arr[k++] = R[j++];
	}
}
