package com.tutorial.practise.multipleInterfaceJava8;

/**
 *  ->  Works also for below diamond situation
 * ------------------------------------------------------------
 * 
 *      Diamond Problem/ Multiple Inheritance 
 *     
 * 		      P      - b(){} 
 * 		  /		  \
 * 	     /         \
 *      A  		    B  - b() is not redeclared in neither A nor B
 *       \  	   /
 *        \       /
 *            C      - C.b() will work since compiler knows its not redeclared
 *           			and declared only in parent interface
 *     
 * 
 * @author Vaishali
 *
 */
public class TestDPExample4 {

	public static void main(String args[]) {
		G g = new G();
		g.a();
	}
}

interface E extends P{
	
//	@Override
//	default void a() {
//		// TODO Auto-generated method stub
//		System.out.println("Interface E - default a() implementation");
//	}
	
} 

interface F extends P{}

//since not redeclared in E and F simultaneously so no ambiguity
class G implements E, F{}
