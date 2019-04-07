package com.tutorial.practise.design.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ASingleton singleton1 = ASingleton.getInstance();
		System.out.println(singleton1);

		ASingleton singleton2 = ASingleton.getInstance();
		System.out.println(singleton2);

		Constructor c = ASingleton.class.getDeclaredConstructor((Class[]) null);
		c.setAccessible(true);
		System.out.println(c);

		ASingleton singleton3 = (ASingleton) c.newInstance((Object[]) null);
		System.out.println(singleton3);

		if (singleton1 == singleton2) {
			System.out.println("Variable 1 and 2 referes same instance");
		} else {
			System.out.println("Variable 1 and 2 referes different instances");
		}
		if (singleton1 == singleton3) {
			System.out.println("Variable 1 and 3 referes same instance");
		} else {
			System.out.println("Variable 1 and 3 referes different instances");
		}
	}

}
