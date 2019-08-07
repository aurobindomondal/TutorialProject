package com.practice.linkedlist;

//A simple Java program to introduce a linked list 
public class LinkedListImpl {
	
	Node head; // head of list 
	Node tail; // tail of list 
	  
    /* Linked list Node.  This inner class is made static so that 
       main() can access it */
    static class Node { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } // Constructor 
    } 
    
    /* This function prints contents of linked list starting from head */
    public void printList() 
    { 
        Node n = head; 
        while (n != null) { 
            System.out.print(n.data + " "); 
            n = n.next; 
        } 
    } 
    
    /* This function is in LinkedList class. Inserts a 
    new Node at front of the list. 
    Time complexity of push() is O(1) as it does constant amount of work. */
	 public void push(int new_data) 
	 { 
	     /* 1 & 2: Allocate the Node & 
	               Put in the data*/
	     Node new_node = new Node(new_data); 
	   
	     /* 3. Make next of new Node as head */
	     new_node.next = head; 
	   
	     /* 4. Move the head to point to new Node */
	     head = new_node; 
	 } 
	 
	 /* This function is in LinkedList class. 
	   Inserts a new node after the given prev_node. 
	   Time complexity of insertAfter() is O(1) as it does constant amount of work. */
		public void insertAfter(Node prev_node, int new_data) 
		{ 
		    /* 1. Check if the given Node is null */
		    if (prev_node == null) 
		    { 
		        System.out.println("The given previous node cannot be null"); 
		        return; 
		    } 
		  
		    /* 2. Allocate the Node & 
		       3. Put in the data*/
		    Node new_node = new Node(new_data); 
		  
		    /* 4. Make next of new Node as next of prev_node */
		    new_node.next = prev_node.next; 
		  
		    /* 5. make next of prev_node as new_node */
		    prev_node.next = new_node; 
		} 
		
		/* Appends a new node at the end. 
		 * Time complexity of append is O(n) */
		public void append(int new_data) 
		{ 
		    /* 1. Allocate the Node & 
		       2. Put in the data 
		       3. Set next as null */
		    Node new_node = new Node(new_data); 
		  
		    /* 4. If the Linked List is empty, then make the 
		           new node as head */
		    if (head == null) 
		    { 
		        head = new Node(new_data); 
		        return; 
		    } 
		  
		    /* 4. This new node is going to be the last node, so 
		         make next of it as null */
		    new_node.next = null; 
		  
		    /* 5. Else traverse till the last node */
		    Node last = head;  
		    while (last.next != null) 
		        last = last.next; 
		  
		    /* 6. Change the next of last node */
		    last.next = new_node; 
		    return; 
		} 
		
		/* Given a key, deletes the first occurrence of key in linked list */
	    void deleteNodeWithKey(int key) 
	    { 
	        // Store head node 
	        Node temp = head, prev = null; 
	  
	        // If head node itself holds the key to be deleted 
	        if (temp != null && temp.data == key) 
	        { 
	            head = temp.next; // Changed head 
	            return; 
	        } 
	  
	        // Search for the key to be deleted, keep track of the 
	        // previous node as we need to change temp.next 
	        while (temp != null && temp.data != key) 
	        { 
	            prev = temp; 
	            temp = temp.next; 
	        }     
	  
	        // If key was not present in linked list 
	        if (temp == null) return; 
	  
	        // Unlink the node from linked list 
	        prev.next = temp.next; 
	    } 
	    
	    /* Given a reference (pointer to pointer) to the head of a list 
	       and a position, deletes the node at the given position */
	    void deleteNodeAtPosition(int position) 
	    { 
	        // If linked list is empty 
	        if (head == null) 
	            return; 
	  
	        // Store head node 
	        Node temp = head; 
	  
	        // If head needs to be removed 
	        if (position == 0) 
	        { 
	            head = temp.next;   // Change head 
	            return; 
	        } 
	  
	        // Find previous node of the node to be deleted 
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	  
	        // If position is more than number of ndoes 
	        if (temp == null || temp.next == null) 
	            return; 
	  
	        // Node temp->next is the node to be deleted 
	        // Store pointer to the next of node to be deleted 
	        Node next = temp.next.next; 
	  
	        temp.next = next;  // Unlink the deleted node from list 
	    } 
	    
	    /* Function deletes the entire linked list */
	    void deleteList() 
	    { 
	        head = null; 
	    } 
	    
	    /* Returns count of nodes in linked list */
	    public int getCount() 
	    { 
	        Node temp = head; 
	        int count = 0; 
	        while (temp != null) 
	        { 
	            count++; 
	            temp = temp.next; 
	        } 
	        return count; 
	    }
	    
	    /* Returns count of nodes in linked list */
	    public int getCountRec(Node head) 
	    { 
	        // Base case 
	        if (head == null) 
	            return 0; 
	  
	        // Count is this node plus rest of the list 
	        return 1 + getCountRec(head.next); 
	    } 
	    
	  //Checks whether the value x is present in linked list 
	    public boolean search(Node head, int x) 
	    { 
	        Node current = head;    //Initialize current 
	        while (current != null) 
	        { 
	            if (current.data == x) 
	                return true;    //data found 
	            current = current.next; 
	        } 
	        return false;    //data not found 
	    } 
	    
	 // Checks whether the value x is present 
	    // in linked list 
	    public boolean searchRec(Node head, int x) 
	    { 
	        // Base case 
	        if (head == null) 
	            return false; 
	  
	        // If key is present in current node, 
	        // return true 
	        if (head.data == x) 
	            return true; 
	  
	        // Recur for remaining list 
	        return search(head.next, x); 
	    } 
	    
	    /* Function to reverse the linked list */
	    void reverse(Node node) 
	    { 
	        Node prev = null; 
	        Node current = node; 
	        Node next = null; 
	        while (current != null) { 
	            next = current.next; 
	            current.next = prev; 
	            prev = current; 
	            current = next; 
	        } 
	        node = prev; 
	    } 

    /* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) {
		/* Start with the empty list. */
		LinkedListImpl llist = new LinkedListImpl(); 
  
        llist.head = new Node(1); 
        Node second = new Node(2); 
        Node tail = new Node(4); 
  
        /* Three nodes have been allocated dynamically. 
          We have references to these three blocks as first,   
          second and third 
  
          llist.head        second              third 
             |                |                  | 
             |                |                  | 
         +----+------+     +----+------+     +----+------+ 
         | 1  | null |     | 2  | null |     |  3 | null | 
         +----+------+     +----+------+     +----+------+ */
  
        llist.head.next = second; // Link first node with the second node 
  
        /*  Now next of the first Node refers to the second.  So they 
            both are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  | null |     |  3 | null | 
        +----+------+     +----+------+     +----+------+ */
  
        second.next = tail; // Link second node with the third node 
  
        /*  Now next of the second Node refers to third.  So all three 
            nodes are linked. 
  
         llist.head        second              third 
            |                |                  | 
            |                |                  | 
        +----+------+     +----+------+     +----+------+ 
        | 1  |  o-------->| 2  |  o-------->|  3 | null | 
        +----+------+     +----+------+     +----+------+ */
        
        llist.printList(); 
        
        System.out.println();
        llist.push(0);
        llist.printList(); 
        System.out.println();
        System.out.println(llist.getCount());
        
        System.out.println();
        llist.insertAfter(second, 3);
        llist.printList();
        
        System.out.println();
        llist.append(5);
        llist.printList();
        
        System.out.println();
        llist.deleteNodeWithKey(4);
        llist.printList();
        
        System.out.println();
        llist.deleteNodeAtPosition(2);
        llist.printList();
        System.out.println();
        System.out.println(llist.getCountRec(llist.head));
        
        System.out.println();
        if (llist.search(llist.head, 2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
        
        System.out.println();
        if (llist.searchRec(llist.head, 3)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
        
        System.out.println();
        llist.reverse(llist.head);
        llist.printList();
    } 
}
