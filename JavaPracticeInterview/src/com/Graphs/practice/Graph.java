package com.Graphs.practice;

import java.util.*;;

public class Graph
{
	private int V;
	private LinkedList<Integer> adj[];
	
	public Graph(int v)
	{
		this.V=v;
		adj= new LinkedList[v];
		for(int i=0; i<v;i++)
		{
			adj[i]= new LinkedList<>();
		}
		
	}
	
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	public void BFS(int s)
	{
		boolean visited[]= new boolean[V];
		LinkedList<Integer> queue= new LinkedList<Integer>();
		
	}

}
