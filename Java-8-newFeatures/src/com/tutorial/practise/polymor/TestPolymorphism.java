package com.tutorial.practise.polymor;
/**
 * Runtime Polymorphism(or Dynamic Method Dispatch) Test.
 * 
 * 
 * Upcasting
 * 		Do only when you want to expose all functionality of the class and restrict by using the 
 * 		supertype class but use the implmentation (overriden)by the subtype.
 * 
 * @author Vaishali
 *
 */
public class TestPolymorphism {
	
	
	public static void main(String args[]) {
		
		A a1 = new A();
		a1.aA();
		
		System.out.println();
		//upcasting test--------------------------
		A a2 = new B();
		System.out.println(a2.aStr);  // Runtime Polymorphism - not possible for data members
		a2.aA();  /// this is amazing.... AF bcz at
		//runtime he understood that it was already overriden
		
		//downcasting test------------------------
		//B b = (B) new A(); //this wont, bcz clearly the object in reality  i.e A
		//is not of type B so a class cast exception is thrown
		
		System.out.println();
		B b = (B) a2;//this will work, bcz a2 is in reality of type B so downcasting works
		b.aA();
		b.bB();
		
		A.staticMethod();
		B.staticMethod();
	}

}


class A{

	private String nestedString = "Private String from Nested Class of A";
    String aStr = "helloFromA";
	
	A(){
		System.out.println("A const called.." + aStr);
	}
	
	void aA() {
		System.out.println("aA method called from A.."+ aStr);
	}
	
	static void staticMethod() {
		System.out.println("Static method from A called ----");
	}
	
	//Nested Class A having access to enclosing class's private string and methods
	class NestedClassA{
		
		private String getNestedSuperClassString() {
			return nestedString; //private member variable from class A
		}
		
	}
}


class B extends A{
	
	String bStr = "helloFromB";
	String aStr = "helloModifiedAFromB";
	
	B(){
		System.out.println("B const called.."+ bStr+"  "+aStr);
	}
	
	void aA() {
		System.out.println("aA method called from B.."+ bStr+"  "+aStr);//overrriden at runtime 
	}
	
	public void bB() {
		System.out.println("aB method called from B.."+ bStr+"  "+aStr);
	}
	
	static void staticMethod() {
		System.out.println("Static method from B called ----");
	}
	
//	public void testNestedString() {
//		new 
//	}
}
