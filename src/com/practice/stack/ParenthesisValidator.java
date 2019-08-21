package com.practice.stack;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisValidator {

	public static boolean isValid(String code) {

		Map<Character, Character> openersToClosers = new HashMap<>();
	    openersToClosers.put('(', ')');
	    openersToClosers.put('[', ']');
	    openersToClosers.put('{', '}');
	    
		Stack<Character> s = new Stack<>();
        for(char c: code.toCharArray()) {
        	if(isOpening(c)) {
        		s.push(c);
        	}else if(isClosing(c)) {
        		if(s.empty())
        			return false;
        		else if(c == openersToClosers.get(s.peek()))
        			s.pop();
        		else
        			return false;
        	}
        }
        if(s.empty())
        	return true;
        else
        	return false;
    }
	public static boolean isOpening(char c) {
		if(c=='(' || c=='{'  || c=='[' ) {
			return true;
		}
		return false;
	}
	public static boolean isClosing(char c) {
		if(c==')' || c=='}'  || c==']' ) {
			return true;
		}
		return false;
	}

















    // tests

    @Test
    public void validShortCodeTest() {
        final boolean result = isValid("()");
        assertTrue(result);
    }

    @Test
    public void validLongerCodeTest() {
        final boolean result = isValid("([]{[]})[]{{}()}");
        assertTrue(result);
    }

    @Test
    public void mismatchedOpenerAndCloserTest() {
        final boolean result = isValid("([][]}");
        assertFalse(result);
    }

    @Test
    public void interleavedOpenersAndClosersTest() {
        final boolean result = isValid("([)]");
        assertFalse(result);
    }

    @Test
    public void missingCloserTest() {
        final boolean result = isValid("[[]()");
        assertFalse(result);
    }

    @Test
    public void extraCloserTest() {
        final boolean result = isValid("[[]]())");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = isValid("");
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ParenthesisValidator.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
    
}
