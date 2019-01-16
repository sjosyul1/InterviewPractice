package com.java8.practice;
import java.util.*;
import java.util.stream.*;

public class ArraysToStream
{

	public static void main(String[] args) 
	{
		String[] array= {"a", "b", "c", "d", "e"};
		
		Stream<String> stream1= Arrays.stream(array);
		stream1.forEach(x-> System.out.println(x));
		//another way
		
		Stream<String> stream2= Stream.of(array);
		stream2.forEach(x->System.out.println(x));
		
		
		
		
	}

}
