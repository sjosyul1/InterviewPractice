package com.binarytreee.interview;

import java.util.Stack;

public class BinaryTree
{
	Node root;
	public BinaryTree()
	{
		root= null;
	}
		public void preorder(Node node)
		{
			if(node==null)
			{
				return;
			}
			Stack<Node> ns= new Stack<Node>();
			ns.push(root);
		while(ns.empty()==false)
		{
			Node mynode=ns.peek();
			System.out.print(mynode.data + " "); 
            ns.pop(); 
  
            // Push right and left children of the popped node to stack 
            if (mynode.right != null) { 
                ns.push(mynode.right); 
            } 
            if (mynode.left != null) { 
                ns.push(mynode.left); 
            } 
		}
		}
		
		 public static void main(String args[]) { 
		        BinaryTree tree = new BinaryTree(); 
		        tree.root = new Node(10); 
		        tree.root.left = new Node(8); 
		        tree.root.right = new Node(2); 
		        tree.root.left.left = new Node(3); 
		        tree.root.left.right = new Node(5); 
		        tree.root.right.left = new Node(2); 
		        tree.preorder(new Node(5)); 
		  
		    } 
}
