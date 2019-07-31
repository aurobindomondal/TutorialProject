package com.practice.algo.excercise;

import java.util.Arrays;
/*Print all permutations of length X.*/
public class PermutationUtility {

	public static void main(String[] args) {
		int x=3;
		int[] a = {1,2,3,4,5,6,7};
		int[] buffer = new int[x];
		permute(a, buffer, 0, new boolean[a.length]);
	}

	private static void permute(int[] a, int[] buffer, int buffIndex, boolean[] isInBuffer) {
		//termination case
		if(buffIndex==buffer.length) {
			System.out.println(Arrays.toString(buffer));
			return;
		}
		//find candidate
		for(int i=0;i<a.length;i++) {
			if(!isInBuffer[i]) {
				//place candidate
				buffer[buffIndex]=a[i];
				isInBuffer[i]=true;
				permute(a, buffer, buffIndex+1, isInBuffer);
				isInBuffer[i]=false;
			}
		}
		
		
		//recurse to next buffer index
	}
	

}
