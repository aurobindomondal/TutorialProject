package com.practice.string;

import java.util.Arrays;

/*
 * Write a Java Program to Swap first and last character of words in a Sentence as mentioned in the example?

Examples:

Input : geeks for geeks
Output :seekg rof seekg
*/

public class SwapFirstLastCharacters {

	public static void main(String[] args) {
		String str = "Impossible is nothing"; 
        System.out.println(count(str));
	}
	
	static String count(String str) {
		char[] ch = str.toCharArray(); 
		
		System.out.println("Starting with: "+Arrays.toString(ch));
		
		int start = 0;
		int end = ch.length-1;
		
		char temp = ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
		
		str = Arrays.toString(ch);
		
		
		return str;
	}

}
