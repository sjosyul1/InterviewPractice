package com.linkedlist.practice;

public class Node {
	int data;
	Node next;
 Node head;
	public Node(int d)
	{
		data=d;
		next= null;
	}
	public static void middleElement()
	{
		Node slow=new LinkedList().head;
		Node Fast= new LinkedList().head;
		while(new LinkedList().head!=null)
		{
			slow= slow.next;
			Fast= Fast.next.next;
		}
		System.out.println("middle element is :"+ slow.data);
	}
	public static void main(String[] args)
	{
		

	}
}


