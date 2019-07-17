package com.practice.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 7,8,5,2,4,6,3 };

		printAll(arr);
		
		//insertion sort
		for(int i=0; i<arr.length;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
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
		
		printAll(arr);
	}

	private static void printAll(int[] arr) {
		System.out.println();
		for (int a : arr)
			System.out.print(a + " ");
	}
}
