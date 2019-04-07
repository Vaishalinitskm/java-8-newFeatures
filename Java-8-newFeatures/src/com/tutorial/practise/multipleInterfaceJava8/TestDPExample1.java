package com.tutorial.practise.multipleInterfaceJava8;

/**
 * -> Doesn't work for below situation
 * ------------------------------------------------------------
 * 
 * A -> a(){}   B -> a(){}
 * 
 * If C implements A, B and calls C.a() then 
 * gives 'Unresolved compilation error' bcz of ambiguity
 * 
 *
 * @author Vaishali
 *
 */
public class TestDPExample1 {
	
	public static void main(String args[]) {
//		C c = new C();
//		c.a();
	}
	

}


/**
 * Uncomment this class to test the problem
 * 
 */
//class C implements A, B{
//	
//	public void b() {
//		System.out.println("C - normal b() implementation");
//	}
//
//	
//}
