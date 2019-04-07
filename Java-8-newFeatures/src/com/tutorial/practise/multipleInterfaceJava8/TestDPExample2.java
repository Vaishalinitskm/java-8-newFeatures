package com.tutorial.practise.multipleInterfaceJava8;

/**
 * ->  Works if method a() is explicitly overriden by C Interface
 * ------------------------------------------------------------
 * 
 * @author Vaishali
 *
 */
public class TestDPExample2 {

	public static void main(String args[]) {
		C c = new C();
		c.a();
	}
}


class C implements A, B{
	
	public void a() {
		System.out.println("C - normal a() overriden implementation");
	}
	
}

