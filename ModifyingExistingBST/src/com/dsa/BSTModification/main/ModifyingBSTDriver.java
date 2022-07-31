package com.dsa.BSTModification.main;
import com.dsa.BSTModification.service.ExistingTree;
import com.dsa.BSTModification.service.ModifiedTree;
public class ModifyingBSTDriver {
	public static void main(String[] args) {
		ExistingTree tree = new ExistingTree ();
		ModifiedTree treeModified = new ModifiedTree ();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(10);
		tree.insert(55);
		System.out.println("The preorder of Existing Binary Search tree is");
		tree.preOrder();
		treeModified.insert(50);
		treeModified.insert(30);
		treeModified.insert(60);
		treeModified.insert(10);
		treeModified.insert(55);
		System.out.println("\n"+"The node values present in modified tree in ascending order is");
		treeModified.inAscend();
	}
}
