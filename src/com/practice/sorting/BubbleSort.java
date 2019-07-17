package com.practice.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,1,4,2,8};
		boolean swapped;
		
		printAll(arr);

		//bubble sort
		for(int j=0;j<arr.length;j++) {
			swapped = false;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]=temp;
					swapped = true;
				}
			}
			//printAll(arr);
			if(swapped == false)
				break;
		}
		
		printAll(arr);
	}

	private static void printAll(int[] arr) {
		System.out.println();
		for(int a:arr)
			System.out.print(a+" ");
	}
	

}
