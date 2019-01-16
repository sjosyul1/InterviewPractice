package com.practice.interview;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.offer(100);
		pq.offer(1);
		pq.offer(3);
		pq.offer(1555);
		Iterator<Integer> itr= pq.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());

	}

}
