package com.practice.sorting.excercise;

/*Find 2 numbers in a sorted array that sum to X. 
 * For example, if A = [1,2,3,4,5] and X = 9, 
 * the numbers are 4 and 5.
 */

public class Find_2_Num_Sorted_Arr_Sum {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int sum=9;
		
		int i=0,j=A.length-1;
		while(i<j){
			if(A[i]+A[j]<sum) 
				i++;
			else if(A[i]+A[j]>sum)
				j--;
			else {
				System.out.println("Match found for the sum: "+A[i] +" and "+A[j]);
				i++;
				j--;
			}
		}
	}
}
