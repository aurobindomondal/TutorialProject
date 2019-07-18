package com.practice.sorting.excercise;

import java.util.Arrays;

/*
 * Dutch National Flag Problem: Given an array of integers A and an index I, 
 * rearrange A in the following order: 
 * [Elements less than A[I], elements equal to A[I], 
 * elements greater than A[I]]
 * 
 * You​​ are ​​given​​ an​​ array ​​of​​ integers ​​and ​​an ​​index ​​X.​​
 * Rearrange ​​the ​​array ​​in​​ the following ​​order:[all ​​elements ​​less ​​than​ ​a[X], ​​elements ​​equal ​​to ​​a[X], 
 * ​​elements ​​greater ​​than ​​a[X]], Similar ​​to ​​the ​​Dutch ​​National ​​Flag​​(DNF).
 * For​​ example, a​​=​​[3,5,2,6,8,4,4,6,4,4,3]​ ​and ​​i​​=​​5​ ​--> ​​result​​=​​[3,2,3,4,4,4,4,5,6,8,6].
*/
public class DutchNationalFlagProblem {

	public static void main(String[] args) {
		int[] A = {3,5,2,6,8,4,4,6,4,4,3};
		int index=5;
		
		int scale=A[index];
		System.out.println(Arrays.toString(A));
		
		int low=-1;
		int mid=-1;
		int high=A.length;
		
		while(mid+1<high){
				if(A[mid+1]<scale) {
					int temp=A[low+1];
					A[mid+1]=A[low+1];
					A[low+1]=temp;
					 mid++; low++;
				}else if(A[mid+1]>scale) {
					int temp=A[high-1];
					A[high-1]=A[mid+1];
					A[mid+1]=temp;
					high--;
				}else {
					mid++;
				}
		}
		System.out.println(Arrays.toString(A));
	}

}
