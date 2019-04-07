package com.tutorial.practise.multipleInterfaceJava8;

/**
 *  ->  Works also for below diamond situation
 * ------------------------------------------------------------
 * 
 *      Diamond Problem/ Multiple Inheritance 
 *     
 * 		      P      - b(){} 
 * 		  /		  \
 * 	     / 
 *         
 *      A  		    B  - b() is redeclared in A but not in B 
 *      					so latest impl of b is what declared in A 
 *       \  	   /
 *        \       /
 *            C      - C.b() will work since compiler knows its redeclared in only one
 *     
 * 
 * @author Vaishali
 *
 */
public class TestDPExample5 {

	public static void main(String args[]) {
		K k = new K();
		k.a();
		
		I i = new K();
		i.a();
		
		J j = new K();
		j.a();
	}
}

interface H {
	
	default void a() {
		System.out.println("Interface H - default a() implementation");
	}

}

interface I extends H{ // both extending from H
	
	default void a() {
		System.out.println("Interface I - default a() implementation");
	}

}

interface J extends H{ // both extending from H
 
}

//since not redeclared in I and J simultaneously and 
// both taking from H so no ambiguity
class K implements I, J{}
