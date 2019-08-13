package com.practice.array;

import java.util.Arrays;

/*
*Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
*/

public class ArrayRotation {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int d = 2, n =7;

    System.out.println("Start with: "+Arrays.toString(arr));
    int[] temp = new int[d];
    for(int i=0; i<d; i++){
      temp[i] = arr[i]; 
    }
    System.out.println("Stored in temp: "+Arrays.toString(temp));

    for(int i=0, j=d; i<n-d; i++, j++){
        arr[i]=arr[j];
    }
    System.out.println("After reordering: "+Arrays.toString(arr));

    for(int k=n-d, l=0; k<n; k++,l++){
      arr[k]=temp[l];
    }
    System.out.println("Fianlly: "+Arrays.toString(arr));
  }
}
