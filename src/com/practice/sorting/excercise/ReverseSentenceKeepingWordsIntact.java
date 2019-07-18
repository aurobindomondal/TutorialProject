package com.practice.sorting.excercise;

/*
 * Given a sentence, reverse the words of the sentence. 
 * For example, "i live in a house" becomes "house a in live i"
 */
public class ReverseSentenceKeepingWordsIntact {

	public static void main(String[] args) {
		String str="i live in a house";
		System.out.println("Before :"+str);
		StringBuilder sb = new StringBuilder();
		int end = str.length();
		
		//reverse traversal in the string
		for(int i=str.length()-1;i>=0;i--) {
			//finding spaces in actual string
			if(str.charAt(i)==' ') {
				//putting spaces in result at start
				if(sb.length()>0)
					sb.append(' ');
				sb.append(str.substring(i+1, end));
				//moving the pointer
				end=i;
			}
		}
		//special treatment for the word before the first space
		String first = str.substring(0, end);
		//appending a space
		sb.append(' ');
		sb.append(first);
		
		System.out.println("After :"+sb.toString());
	}

}
