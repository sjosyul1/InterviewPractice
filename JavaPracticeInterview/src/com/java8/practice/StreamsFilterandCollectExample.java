package com.java8.practice;

import java.io.ObjectInputStream.GetField;
import java.util.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsFilterandCollectExample {

	public static void main(String[] args)
	{
		
		//before java 8
		List<String> lines= Arrays.asList("Spring", "Node","srinath");
		List<String> result= getFilterOutput(lines,"srinath");
		
		for(String temp: result)
		{
			System.out.println(temp);
		}
		
		//using java 8 stream and filter
	List<String> results=lines.stream().filter(x->!"srinath".equals(lines)).collect(Collectors.toList());
		
		results.forEach(System.out::println);
	
		
		//find any example
		List<Person> persons= Arrays.asList(
		new Person("Srinath",30),
		new Person("jack",30),
		new Person("Lawrence",30)		
				);
		
		Person result1= persons.stream().filter(x->"jack".equals(x.getName()))
				.findAny().orElse(null);
		System.out.println(result1);
		
		
		
	}
	
	private static List<String> getFilterOutput(List<String> lines, String filter)
	{
		List<String> result= new ArrayList<>();
		for(String line: lines)
		{
			if(!"srinath".equals(line))
			{
				result.add(line);
			}
		}
		return result;
	}
	
	
}
