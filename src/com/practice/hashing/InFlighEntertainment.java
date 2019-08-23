package com.practice.hashing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * You've built an inflight entertainment system with on-demand movie streaming.
 * Users on longer flights like to start a second movie right when their first one ends, 
 * but they complain that the plane usually lands before they can see the ending. 
 * So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.
 * 
 * Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths 
 * (in minutes) and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals 
 * flightLength.
 * 
 * When building your method:
 * 
 * Assume your users will watch exactly two movies Don't make your users watch the same movie twice
 * Optimize for runtime over memory
*/
public class InFlighEntertainment {

	public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {
        //Using HashMap
		//Map<Integer, Integer> trial = new HashMap<Integer, Integer>();
		//using HashSet
		Set<Integer> trial = new HashSet<Integer>();
        // determine if two movies add up to the flight length
        for(int i=0; i<movieLengths.length; i++){
            if(trial.contains(flightLength-movieLengths[i])){
                return true;
            }else{
            	//using HashMap
                //trial.put(movieLengths[i],i);
            	//using HashSet
            	trial.add(movieLengths[i]);
            }
        }
        return false;
    }
	
	// tests

    @Test
    public void shortFlightTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {2, 4}, 1);
        assertFalse(result);
    }

    @Test
    public void longFlightTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {2, 4}, 6);
        assertTrue(result);
    }

    @Test
    public void onlyOneMovieHalfFlightLenghtTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {3, 8}, 6);
        assertFalse(result);
    }

    @Test
    public void twoMoviesHalfFlightLengthTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {3, 8, 3}, 6);
        assertTrue(result);
    }

    @Test
    public void lotsOfPossiblePairsTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {1, 2, 3, 4, 5, 6}, 7);
        assertTrue(result);
    }

    @Test
    public void notUsingFirstMovieTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {4, 3, 2}, 5);
        assertTrue(result);
    }

    @Test
    public void oneMovieTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {6}, 6);
        assertFalse(result);
    }

    @Test
    public void noMoviesTest() {
        final boolean result = canTwoMoviesFillFlight(new int[] {}, 6);
        assertFalse(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(InFlighEntertainment.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
