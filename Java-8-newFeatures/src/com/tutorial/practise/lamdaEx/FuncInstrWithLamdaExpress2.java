package com.tutorial.practise.lamdaEx;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate; 

public class FuncInstrWithLamdaExpress2 {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.out.println("Thread Main running...");
		
		// Using lamda expression to directly provide implementation
		Thread thread1 = new Thread(() -> System.out.println("Thread 1 running......."));
		Thread thread2 = new Thread(() -> System.out.println("Thread 2 running......."));
		
		thread1.start();
		thread2.start();
		
		Predicate<String> p = s -> s.startsWith("A");
		
		List<String> strList = Arrays.asList(new String[] {"AB", "AC", "CA", "CB"});
		
		for(String str : strList) {
			if(p.test(str)) {
				System.out.println(str);
			}
		}
	}
}
