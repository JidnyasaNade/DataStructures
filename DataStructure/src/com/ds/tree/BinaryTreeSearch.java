package com.ds.tree;

public class BinaryTreeSearch {

	// Java program to find minimum value node in Binary Search Tree 
	
	    // Driver program to test above functions 
	    public static void main(String[] args) { 
	        BinaryTree tree = new BinaryTree(); 
	        Node root = null; 
	        root = tree.insert(root, 4); 
	        tree.insert(root, 2); 
	        tree.insert(root, 1); 
	        tree.insert(root, 3); 
	        tree.insert(root, 6); 
	        tree.insert(root, 5); 
	  
	        System.out.println("Minimum value of BST is " + tree.minvalue(root)); 
	    } 
	}
