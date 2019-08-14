package com.practice.array;

import java.util.Arrays;

/*to make [0,3,4,4,6,30,31]*/
public class MergeSortedArrays {

	private static int[] merge(int[] arr1, int[] arr2) {
		if(arr1.length==0 && arr2.length!=0) {
			return arr2;
		}else if(arr2.length==0 && arr1.length!=0) {
			return arr1;
		}
		int maxCount=arr1.length+arr2.length;
		int[] output = new int[arr1.length+arr2.length];
		
		int arr1Index=0, arr2Index=0;
		
		for(int i=0;i<maxCount;i++) {
			if(arr1Index<arr1.length && arr2Index<arr2.length) {
				if(arr1[arr1Index]==arr2[arr2Index]) {
					output[i]=arr1[arr1Index];
					output[++i]=arr2[arr2Index];
					arr1Index++;
					arr2Index++;
				}else if(arr1[arr1Index]>arr2[arr2Index]) {
					output[i]=arr2[arr2Index];
					arr2Index++;
				}else {
					output[i]=arr1[arr1Index];
					arr1Index++;
				}
			}else if(arr1Index<arr1.length) {
				output[i]=arr1[arr1Index];
				arr1Index++;
			}else {
				output[i]=arr2[arr2Index];
				arr2Index++;
			}
			//return output;
		}
		return output;
	}
	public static void main(String[] args) {
		int[] arr1 = {0,3,4,31};
		int[] arr2 = {4,6,30};
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

}
