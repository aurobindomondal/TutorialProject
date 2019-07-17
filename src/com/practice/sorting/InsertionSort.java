package com.practice.sorting;

/*
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * 
 * Time Complexity: O(n*2)
 * Auxiliary Space: O(1)
 * Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
 * And it takes minimum time (Order of n) when elements are already sorted.
 * 
 * Algorithmic Paradigm: Incremental Approach
 */

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 7,8,5,2,4,6,3 };

		System.out.println("Before:");
		printAll(arr);
		
		//insertion sort
		for(int i=0; i<arr.length;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					/* Move elements of arr[0..i-1], that are 
		               greater than key, to one position ahead 
		               of their current position */
					for(int z=j;z>index;z--) {
						if(arr[z]<arr[z-1]) {
							int temp = arr[z-1];
							arr[z-1]=arr[z];
							arr[z]=temp;
						}
					}
				}
			}
		}
		
		System.out.println("After:");
		printAll(arr);
	}

	private static void printAll(int[] arr) {
		System.out.println();
		for (int a : arr)
			System.out.print(a + " ");
	}
}
