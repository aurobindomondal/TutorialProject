package com.practice.linkedlist;

/*
 * Intersection of Linked Lists
Asked in:  
Amazon
Microsoft
NetApp
Apache Design
*/

/*Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3

begin to intersect at node c1.
*/

/*
 * Notes:
If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
*/

/**
 * Definition for singly-linked list.
 */
class ListNode {
	    public int val;
	     public ListNode next;
	     ListNode(int x) { val = x; next = null; }
	 }

public class LinkedListIntersect {

	public static ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode aHead = a;
        ListNode bHead = b;
        
        int aCount = 0;
        int bCount = 0;
        
        while(aHead!=null){
            aCount++;
            aHead = aHead.next;
        }
        
        while(bHead!=null){
            bCount++;
            bHead = bHead.next;
        }
        
        aHead = a;
        bHead = b;
        
        int diff = Math.abs(aCount - bCount);
        
        if(aCount > bCount){
            //skip diff nodes pf a
            while(diff > 0){
                aHead = aHead.next;
                diff--;
            }
        }
        else{
              while(diff > 0){
                bHead = bHead.next;
                diff--;
            }
        }
      
        while(aHead!=null && bHead!=null)
        {
            if(aHead == bHead){
                return aHead;
            }
             aHead = aHead.next;
             bHead = bHead.next;
        }
        
        return null;
    }
	
	public static void main(String[] args) {
		// list 1 
		ListNode n1 = new ListNode(1); 
        n1.next = new ListNode(2); 
        n1.next.next = new ListNode(3); 
        n1.next.next.next = new ListNode(4); 
        n1.next.next.next.next = new ListNode(5); 
        n1.next.next.next.next.next = new ListNode(6); 
        n1.next.next.next.next.next.next = new ListNode(7); 
        // list 2 
        ListNode n2 = new ListNode(10); 
        n2.next = new ListNode(9); 
        n2.next.next = new ListNode(8); 
        n2.next.next.next = n1.next.next.next; 
        Print(n1); 
        Print(n2); 
        System.out.println(getIntersectionNode(n1, n2).val);
	}
	
	public static void Print(ListNode n) 
    { 
		ListNode cur = n; 
        while (cur != null) { 
            System.out.print(cur.val + "  "); 
            cur = cur.next; 
        } 
        System.out.println(); 
    } 

}
