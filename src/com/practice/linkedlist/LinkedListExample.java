package com.practice.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		//added to the head
		li.addFirst(1);
		System.out.println("added to the head "+li.toString());
		li.add(2);
		System.out.println("added "+li.toString());
		
		//added to the tail
		li.addLast(3);
		System.out.println("added to the tail "+li.toString());
		
		//retrieved the head, but not removed
		System.out.println("retrieved the head, but not removed "+li.element());
		System.out.println(li.toString());
		
		//check if contains
		System.out.println("check if contains "+li.contains(2));
		//index of
		System.out.println("index of "+li.indexOf(1));
		//is empty
		System.out.println("is empty "+li.isEmpty());
		//last index of
		System.out.println("last index of "+li.lastIndexOf(2));
		//adds to the tail
		System.out.println("adds to the tail "+li.offer(4));
		System.out.println(li.toString());
		//adds to the head
		System.out.println("adds to the head "+li.offerFirst(0));
		System.out.println(li.toString());
		//adds to the tail
		System.out.println("adds to the tail"+li.offerLast(5));
		System.out.println(li.toString());
		//removes element
		System.out.println("reoves and element "+li.remove(3));
		System.out.println(li.toString());
		//get first
		System.out.println("gets first "+li.getFirst());
		System.out.println(li.toString());
		//get last
		System.out.println("get last "+li.getLast());
		System.out.println(li.toString());
		
		//get the head, but doesn't remove
		System.out.println("gets head, but not removes "+li.peek());
		System.out.println(li.toString());
		
		//get the head, but doesn't remove
		System.out.println("get head, no removal "+li.peekFirst());
		System.out.println(li.toString());
				
		//get the tail, but doesn't remove
		System.out.println("get the tail, doesn;t remove "+li.peekLast());
		System.out.println(li.toString());
		
		//gets and removed the head
		System.out.println("gets and removed the head "+li.poll());
		System.out.println(li.toString());
		
		//gets and removed the head
		System.out.println("gets and removes head "+li.pollFirst());
		System.out.println(li.toString());
		
		//gets and removed the tail
		System.out.println("gets and removed tail "+li.pollLast());
		System.out.println(li.toString());
		
		//removes the head
		System.out.println("removed the head "+li.pop());
		System.out.println(li.toString());
		
		//removes the head
		System.out.println("removes the head "+li.pollFirst());
		System.out.println(li.toString());
		
		//removes the tail
		System.out.println("removes tail "+li.pollLast());
		System.out.println(li.toString());
		
		
		System.out.println("added to the head "+li.toString());
	}
}
