package com.tutorial.practise.design.patterns.singleton;

public class ASingleton {

	private static volatile ASingleton instance;
	
	
	private static Object mutex = new Object(); // creates a lock

	private ASingleton() {
	}

	public static ASingleton getInstance() {
		ASingleton result = instance;
		if (result == null) {
			synchronized (mutex) {
				result = instance;
				if (result == null)
					instance = result = new ASingleton();
			}
		}
		return result;
	}

}