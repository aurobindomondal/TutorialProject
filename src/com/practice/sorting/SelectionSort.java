package com.practice.sorting;

import java.util.HashSet;
import java.util.Hashtable;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {6,3,5,2,1,7};
		int sumTotal = 4;
		
		System.out.println("Before:");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		//Hashtable implementation
		Hashtable<Integer,Integer> hTab = new Hashtable<Integer,Integer>();
		for(int i=0; i<arr.length; i++) {
			if(hTab.containsValue(sumTotal-arr[i]))
				System.out.println("[Using HashTable] The pair is : "+(sumTotal-arr[i]) +" and "+arr[i]);
			else
				hTab.put((sumTotal-arr[i]),arr[i]);
		}
		
		//Sorting implementation
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(sumTotal == (arr[i]+arr[j])) {
					System.out.println("The pair is : "+arr[i] +" and "+arr[j]);
				}
			}
		}
		
		//using HashSet
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(hSet.contains(sumTotal-arr[i]))
				System.out.println("[Using HashSet] The pair is : "+(sumTotal-arr[i]) +" and "+arr[i]);
			else
				hSet.add((arr[i]));
		}
	}

}
