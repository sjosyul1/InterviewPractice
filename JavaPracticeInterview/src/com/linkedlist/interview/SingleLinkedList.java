package com.linkedlist.interview;

public class SingleLinkedList<T> 
{
	private Node<T> head;
	
	public void add(T element)
	{
		Node<T> nd= new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: "+element);
		Node<T> tmp= head;
		while(true)
		{
			if(tmp==null)
			{
				head= nd;
				break;
			}
			else if(tmp.getNextRed()== null)
			{
				tmp.setNextRed(nd);
				break;
			}
			else
			{
				tmp= tmp.getNextRed();
			}
		}
	}
	
	public void traverse() 
	{
	 Node<T> tmp= head;
	 while(true)
	 {
		 if(tmp==null)
		 {
			 break;
		 }
		 System.out.println(tmp.getValue()+" ");
		 tmp= tmp.getNextRed();
	 }
	}
	
	public void reverse()
	{
		System.out.println("reversing the linked list");
		Node<T> prev= null;
		Node<T> current= head;
		Node<T> next=null;
		
		while(current!=null)
		{
			next=current.getNextRed();
			current.setNextRed(prev);
			prev= current;
			current=next;
			
		}
		head= prev;
	}
	
	

	public static void main(String[] args)
	{
	SingleLinkedList<Integer> sl= new SingleLinkedList<>();
	sl.add(5);
	sl.add(35);
	sl.add(54);
	sl.add(54);
	sl.add(89);
	System.out.println();
	sl.traverse();
	System.out.println();
	sl.reverse();
	sl.traverse();
	
	
		

	}

}
