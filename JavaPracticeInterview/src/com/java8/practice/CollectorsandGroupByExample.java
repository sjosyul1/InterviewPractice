package com.java8.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.math.BigDecimal;

public class CollectorsandGroupByExample {

	public static void main(String[] args)
	{
	
		List<String> items= Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");
		
		Map<String, Long> result= items.stream().collect(
				Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(result);
		
		Map<String, Long> finalMap= new LinkedHashMap<>();
		
		
		
		result.entrySet().stream().sorted(
				Map.Entry.<String, Long>comparingByValue().reversed())
		.filter(x->x.getValue()!=1)
		.forEachOrdered(q-> finalMap.put(q.getKey(), q.getValue()));
		
		System.out.println(finalMap);

		
			
	}

}
