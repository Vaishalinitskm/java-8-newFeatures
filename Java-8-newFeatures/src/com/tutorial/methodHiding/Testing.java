package com.tutorial.methodHiding;

class Base {
	void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

public class Testing {
	public static void main(String args[]) {
		Base obj = new Derived();
		Derived obj1 = new Derived();
//		obj.
		obj.display();
//		obj.print();
	}
}