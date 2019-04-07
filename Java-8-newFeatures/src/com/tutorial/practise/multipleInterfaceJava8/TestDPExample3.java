package com.tutorial.practise.multipleInterfaceJava8;

/**
 *  ->  Works if explicity call the a() method of a particular interface
 * 	  by calling using A.super.a() or B.super.a()
 * 
 * @author Vaishali
 *
 */
public class TestDPExample3 {

	public static void main(String args[]) {
		D d = new D();
		d.a();
	}
}


class D implements A, B{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		A.super.a(); // Gets the default imple of Interface A
	}
	
}