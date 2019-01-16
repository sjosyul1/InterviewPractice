package com.java8.practice;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.*;

public class StreamisClosed {

	public static void main(String[] args)
	{
		String[] array = {"a", "b", "c", "d", "e"};
		Supplier<Stream<String>> streamsupplier=()-> Stream.of(array);
		
		Stream<String> stream1= Arrays.stream(array);
		stream1.forEach(x->System.out.println(x));
		//stream1.close();
		
		long count= stream1.filter(x->"b".equals(x)).count();
		System.out.println(count);
		

	}

}
