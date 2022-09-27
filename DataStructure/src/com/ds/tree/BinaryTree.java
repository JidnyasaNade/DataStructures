package com.ds.tree;

public class BinaryTree {

	    static Node head; 
	      
	    /* Given a binary search tree and a number,  
	     inserts a new node with the given number in  
	     the correct place in the tree. Returns the new  
	     root pointer which the caller should then use  
	     (the standard trick to avoid using reference  
	     parameters). */
	    public Node insert(Node node, int data) { 
	          
	        /* 1. If the tree is empty, return a new,      
	         single node */
	        if (node == null) { 
	            return (new Node(data)); 
	        } else { 
	              
	            /* 2. Otherwise, recur down the tree */
	            if (data <= node.data) { 
	                node.left = insert(node.left, data); 
	            } else { 
	                node.right = insert(node.right, data); 
	            } 
	  
	            /* return the (unchanged) node pointer */
	            return node; 
	        } 
	    } 
	  
	    /* Given a non-empty binary search tree,   
	     return the minimum data value found in that  
	     tree. Note that the entire tree does not need  
	     to be searched. */
	  public int minvalue(Node node) { 
	        Node current = node; 
	  
	        /* loop down to find the leftmost leaf */
	        while (current.left != null) { 
	            current = current.left; 
	        } 
	        return (current.data); 
	    } 
	      
}
