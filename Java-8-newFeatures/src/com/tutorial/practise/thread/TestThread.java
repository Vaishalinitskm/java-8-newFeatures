package com.tutorial.practise.thread;

/**
 * Revisiting multithreading concepts.
 * 
 * 
 * @author Vaishali
 *
 */
public class TestThread {
	
	
	public static void main(String args[]) {
		
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.getName());
	}

}
