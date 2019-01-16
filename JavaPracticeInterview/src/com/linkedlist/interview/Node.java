package com.linkedlist.interview;

public class Node<T> implements Comparable<T>
{
	private T value;
	private Node<T> nextRed;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getNextRed() {
		return nextRed;
	}
	public void setNextRed(Node<T> nextRed) {
		this.nextRed = nextRed;
	}
	@Override
	public int compareTo(T arg)
	{
		if(arg== this.value)
		{
			return 0;
		}
		else 
		{
			return 1;
		}
		
	}

}
