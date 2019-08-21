package com.practice.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class FindClosingParen {

	public static int getClosingParen(String sentence, int openingParenIndex) {
		int openParenCount =0;
		
		for(int i = openingParenIndex+1; i< sentence.length(); i++) {
				char c = sentence.charAt(i);
				
				if(c=='('){
					openParenCount++;
				}else if(c==')') {
					if(openParenCount==0) {
						return i;
					}else {
						openParenCount--;
					}
				}
		}
		throw new IllegalArgumentException("No closing parenthesis :(");
    }


















    // tests

    @Test
    public void allOpenersThenClosersTest() {
        final int expected = 7;
        final int actual = getClosingParen("((((()))))", 2);
        assertEquals(expected, actual);
    }

    @Test
    public void mixedOpenersAndClosersTest() {
        final int expected = 10;
        final int actual = getClosingParen("()()((()()))", 5);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void noMatchingCloserTest() {
        getClosingParen("()(()", 2);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FindClosingParen.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
