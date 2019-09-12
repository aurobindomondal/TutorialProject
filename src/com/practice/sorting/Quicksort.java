package com.practice.sorting;

import java.util.Arrays;

//Java program for implementation of QuickSort 

public class Quicksort {

	public static void main(String[] args) {
		int arr[] = { 10, 7, 8, 9, 1, 5 };

		Quicksort ob = new Quicksort();
		ob.sort(arr, 0, arr.length-1);

		System.out.println("sorted array" + Arrays.toString(arr));
	}

	private void sort(int[] arr, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(arr, low, high);
			sort(arr, low, partitionIndex - 1); //before 
			sort(arr, partitionIndex + 1, high); //after
		}

	}
	/*This function takes last element as pivot, 
    places the pivot element at its correct 
    position in sorted array*/

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // pivot (Element to be placed at right position)
		int i = low-1; // Index of smaller element

		for (int j=low;j<high; j++) {
			// If current element is smaller than the pivot
			if (arr[j]<pivot) {
				i++; // increment index of smaller element
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
