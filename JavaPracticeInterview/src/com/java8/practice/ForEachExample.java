package com.java8.practice;
import java.util.*;
public class ForEachExample {

	public static void main(String[] args) 
	{
		
	Map<String, Integer> items= new HashMap<String, Integer>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);
	
	items.entrySet().stream().filter(x-> x.getValue()%4==0).forEach(w-> System.out.println(w.getValue()+" "+w.getKey()));
	
	Set s= items.entrySet();
	Iterator itr = s.iterator();
	while(itr.hasNext())
	{
		Map.Entry<String, Integer> m= (Map.Entry<String, Integer>)(itr.next());
		if(m.getValue()%4==0)
		{
			System.out.println(m.getValue()+" "+m.getKey());
		}
	}
	
	for(Map.Entry<String, Integer> entry: items.entrySet())
	{
		System.out.println("Item: "+entry.getKey() + "count "+ +entry.getValue());;
		
		
	}
	//else
			items.forEach((k,v)-> {
				System.out.println("item: "+k +" count: "+ v);
				if("E".equals(k)) {
					System.out.println("Hello E");
				}
			});
	//for list		
		List<String> items1= new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");
		
		items1.forEach((k)->{
			if("C".equals(k))
			{
				System.out.println(k);
			}
		});
		
		items1.forEach(System.out::println);
		
//		items1.stream().filter(s->s.contains("B")).forEach(System.out::println);


	}

}
