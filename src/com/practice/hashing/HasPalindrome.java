package com.practice.hashing;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Set;
import java.util.HashSet;

import static org.junit.Assert.*;


/*
 * Write an efficient method that checks whether any permutation ↴ of an input string is a palindrome. ↴
 * You can assume the input string only contains lowercase letters.
 * Examples:
 * "civic" should return true
 * "ivicc" should return true
 * "civil" should return false
 * "livci" should return false
 * "But 'ivicc' isn't a palindrome!"
 * 
 * If you had this thought, read the question again carefully. We're asking if any permutation of the 
 * string is a palindrome. Spend some extra time ensuring you fully understand the question before starting. 
 * Jumping in with a flawed understanding of the problem doesn't look good in an interview.

*/
public class HasPalindrome {

	public static boolean hasPalindromePermutation(String theString) {
        Set<Character> trial = new HashSet<Character>();
        int counter=0;
        if(theString.length()==0)
        	return true;
        
        int mid = theString.length()/2;

        // check if any permutation of the input is a palindrome
        for(int i=0; i<theString.length(); i++){
            if(trial.contains(theString.charAt(i))){
            	counter++;
            }else{
                trial.add(theString.charAt(i));
            }
        }
        if(counter==mid)
        	return true;
        else
        	return false;
    }


















    // tests

    @Test
    public void permutationWithOddNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabcbcd");
        assertTrue(result);
    }

    @Test
    public void permutationWithEvenNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabccbdd");
        assertTrue(result);
    }

    @Test
    public void noPermutationWithOddNumberOfChars() {
        final boolean result = hasPalindromePermutation("aabcd");
        assertFalse(result);
    }

    @Test
    public void noPermutationWithEvenNumberOfCharsTest() {
        final boolean result = hasPalindromePermutation("aabbcd");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final boolean result = hasPalindromePermutation("");
        assertTrue(result);
    }

    @Test
    public void oneCharacterStringTest() {
        final boolean result = hasPalindromePermutation("a");
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(HasPalindrome.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
