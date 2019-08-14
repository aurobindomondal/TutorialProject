package com.practice.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		String str = "Hi! My name is Auro";
		reverse(str);

	}

	private static void reverse(String str) {
		char[] chr = str.toCharArray();
		for(int i=0,j=chr.length-1;i<chr.length;i++,j--) {
			if(i!=j) {
				char temp = chr[i];
				chr[i]=chr[j];
				chr[j]=temp;
			}else
				break;
		}
		str=Arrays.toString(chr);
		System.out.println(str);
	}

}
