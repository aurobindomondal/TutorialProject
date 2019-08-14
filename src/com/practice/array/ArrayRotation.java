package com.practice.array;

import java.util.Arrays;

/*
*Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
*/

public class ArrayRotation {
  public static void main(String[] args) {
    int[] nums = {1,2,3};//{1, 2, 3, 4, 5, 6};
    int k = 4, n =nums.length;

    if(nums.length==0|| nums.length==1){
        return;
    }else if(k>nums.length)
        k=k%n;
    else if(k==0)
        return;
    
    System.out.println("Start with: "+Arrays.toString(nums));
    int[] temp=new int[nums.length];
    for(int m=0;m<nums.length;m++)
      temp[m]=nums[m];
    
    System.out.println("Temp : "+Arrays.toString(temp));

    for(int i=0, j=n-k; j<n; i++, j++){
        nums[i]=nums[j];
    }
    System.out.println("After reordering: "+Arrays.toString(nums));

    for(int j=k, l=0; l<n-k; j++,l++){
      nums[j]=temp[l];
    }
    System.out.println("Fianlly: "+Arrays.toString(nums));
  }
}
