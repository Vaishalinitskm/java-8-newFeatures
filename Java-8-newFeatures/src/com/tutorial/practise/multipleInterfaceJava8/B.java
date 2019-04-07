package com.tutorial.practise.multipleInterfaceJava8;

public interface B {
	
	default void a() {
		System.out.println("Interface B - default a() implementation");
	}

}
