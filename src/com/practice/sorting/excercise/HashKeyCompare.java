package com.practice.sorting.excercise;

import java.util.HashSet;
import java.util.Hashtable;

/*
 * Given an array of integers, find a pair of integers that sums to a number X.
 * For e.g, if A = [6,3,5,2,1,7]. X = 4, Result= [3,1]
 */
		
public class HashKeyCompare {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 5, 2, 1, 7 };
		int sumTotal = 4;

		// Hashtable implementation
		Hashtable<Integer, Integer> hTab = new Hashtable<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hTab.containsValue(sumTotal - arr[i]))
				System.out.println("[Using HashTable] The pair is : " + (sumTotal - arr[i]) + " and " + arr[i]);
			else
				hTab.put((sumTotal - arr[i]), arr[i]);
		}

		// Sorting implementation
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (sumTotal == (arr[i] + arr[j])) {
					System.out.println("The pair is : " + arr[i] + " and " + arr[j]);
				}
			}
		}

		// using HashSet
		HashSet<Integer> hSet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hSet.contains(sumTotal - arr[i]))
				System.out.println("[Using HashSet] The pair is : " + (sumTotal - arr[i]) + " and " + arr[i]);
			else
				hSet.add((arr[i]));
		}
	}
}
