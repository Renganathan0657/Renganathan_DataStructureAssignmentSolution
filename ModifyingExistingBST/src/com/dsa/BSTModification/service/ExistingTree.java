package com.dsa.BSTModification.service;

	public class ExistingTree {

	 class Node {
			int key;
			Node left, right;
			public Node (int data) {
				key = data;
				left = right = null;
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
		            root.left = insertRec(root.left, key);
		        else if (key > root.key)
		            root.right = insertRec(root.right, key);
		        return root;
	 }
	 public void preOrder() { 
		 preOrderRec(root);
	 }
	 void preOrderRec(Node root){
		        if (root != null){
		            System.out.print(root.key + " ");
		            preOrderRec(root.left);
		            preOrderRec(root.right);
		            } 
	}
}
