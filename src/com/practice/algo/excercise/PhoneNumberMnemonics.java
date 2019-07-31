package com.practice.algo.excercise;

/*
 * phone number Mnemonics - given a phone number and keypad, 
 * print all words that can be made from that phone number(ignore 0's and 1's)
 */
public class PhoneNumberMnemonics {

	public static void main(String[] args) {
		int[] a = {2,3,4};
		int[] buffer = new int[a.length];
		printWords(a,buffer,0,0);
	}
	
	static void printWords(int[] a, int[] buff, int nextIndex, int bufferIndex){
		//termination case
		if(bufferIndex==buff.length || nextIndex==a.length) {
			//System.out.println("[Array]"+Arrays.toString(buff));
			print(buff, bufferIndex);
			return;
		}
		//find candidates
		char[] letters = getLetters(a[nextIndex]);
		if(letters.length==0) {
			printWords(a,buff,nextIndex+1, bufferIndex);
		}
		//place candidates in buffer - recursion to next index
		for(char letter: letters) {
			buff[bufferIndex]=letter;
			printWords(a,buff,nextIndex+1, bufferIndex+1);
		}
	}

	private static char[] getLetters(int i) {
		char[] c = null;
		switch(i) {
		//case 0: break;
		//case 1: break;
		case 2: {String str = "abc"; c = str.toCharArray();}
		case 3: {String str = "def"; c = str.toCharArray();}
		case 4: {String str = "ghi"; c = str.toCharArray();}
		case 5: {String str = "jkl"; c = str.toCharArray();}
		case 6: {String str = "mno"; c = str.toCharArray();}
		case 7: {String str = "pqrs"; c = str.toCharArray();}
		case 8: {String str = "tuv"; c = str.toCharArray();}
		case 9: {String str = "wxyz"; c = str.toCharArray();}
		}
		return c;
	}
	static void print(int[] buffer, int bufferInex) {
		System.out.print("[");
		for(int j=0; j<bufferInex;j++)
		System.out.print((char)buffer[j]);
		System.out.print("]\n");
	}

}
