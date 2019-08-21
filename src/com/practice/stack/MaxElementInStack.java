package com.practice.stack;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.Stack;

import static org.junit.Assert.*;

/*
 * You want to be able to access the largest element in a stack. ↴
 * Use the built-in Stack class to implement a new class MaxStack with a method getMax() 
 * that returns the largest element in the stack. 
 * getMax() should not remove the item.
 * 
 */
public class MaxElementInStack {

	public static class MaxStack {

	    static Stack<Integer> max = new Stack<>();
	    static Stack<Integer> s = new Stack<>();
	    
	        public void push(int item) {
	            if(max.isEmpty() || item>=max.peek()){
	                max.push(item);
	                s.push(item);
	            }else{
	                max.push(max.peek());
	                s.push(item);
	            }
	        }

	        public int pop() {
	            int item = s.pop();
	            max.pop();
	            return item;
	        }

	        public int getMax() {
	            return max.peek();
	        }
	    }


















	    // tests

	    @Test
	    public void maxStackTest() {
	        final MaxStack s = new MaxStack();
	        s.push(5);
	        assertEquals("check max after 1st push", 5, s.getMax());
	        s.push(4);
	        s.push(7);
	        s.push(7);
	        s.push(8);
	        assertEquals("check before 1st pop", 8, s.getMax());
	        assertEquals("check pop #1", 8, s.pop());
	        assertEquals("check max after 1st pop", 7, s.getMax());
	        assertEquals("check pop #2", 7, s.pop());
	        assertEquals("check max after 2nd pop", 7, s.getMax());
	        assertEquals("check pop #3", 7, s.pop());
	        assertEquals("check max after 3rd pop", 5, s.getMax());
	        assertEquals("check pop #4", 4, s.pop());
	        assertEquals("check max after 4th pop", 5, s.getMax());
	    }

	    public static void main(String[] args) {
	        Result result = JUnitCore.runClasses(MaxElementInStack.class);
	        for (Failure failure : result.getFailures()) {
	            System.out.println(failure.toString());
	        }
	        if (result.wasSuccessful()) {
	            System.out.println("All tests passed.");
	        }
	    }

}
