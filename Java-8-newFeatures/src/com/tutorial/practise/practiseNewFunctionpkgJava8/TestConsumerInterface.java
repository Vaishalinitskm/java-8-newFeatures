package com.tutorial.practise.practiseNewFunctionpkgJava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumerInterface {
	
	static List<String> s = Arrays.asList(new String[] {"hello", "hi"});
	
	public static void main(String args[]) {
		
		Consumer<List<String>> consumer = t -> t.iterator().next().toString();
		
		consumer.accept(s);
		consumer.toString();
	}
}




