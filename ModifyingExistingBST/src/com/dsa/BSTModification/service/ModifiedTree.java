package com.dsa.BSTModification.service;
public class ModifiedTree {
	 class Node{
		 int key;
		 Node prevNode;
		 Node nextNode;
		 public Node (int data) {
			 key= data;
			 prevNode = nextNode = null;
		     }
	 }
	 Node root;
	 public void insert (int key) {
		root = insertRec( root, key);
	 }
	 Node insertRec(Node root, int key){
		        if (root == null) {
		            root = new Node(key);
		            return root;
		        }
		        if (key < root.key)
		            root.prevNode = insertRec(root.prevNode, key);
		        else if (key > root.key)
		            root.nextNode = insertRec(root.nextNode, key);
		        return root;
	 }
	 public void inAscend() { 
			  inAscendRec(root); 
	 }
	 void inAscendRec(Node root){
		        if (root != null) {
		            inAscendRec(root.prevNode);
		            System.out.print(root.key + " ");
		            inAscendRec(root.nextNode);
		            }
	 }
	
}
