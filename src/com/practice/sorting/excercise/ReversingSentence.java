package com.practice.sorting.excercise;

/*
 * Given a sentence, reverse the words of the sentence. 
 * For example, "i live in a house" becomes "house a in live i"
 */

public class ReversingSentence {
	public static void main(String[] args) {
		String str = "i live in a house";
		System.out.println("Before: "+str);
		char[] chr=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			chr[i]=str.charAt(i);
		}
		
		for(int i=0,j=chr.length-1;i<=j;i++,j--) {
			char temp = chr[i];
			chr[i]=chr[j];
			chr[j]=temp;
		}
		System.out.println("After: "+str.copyValueOf(chr));	
	}
}
