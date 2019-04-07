package com.tutorial.practise.reflection;

public class Test{
	
	private String str;
	private String str2;
	
	public Test() {
		str = "Geeks";
	}
	
	public void testMethod3() {
		System.out.println("Calling testMethod1 -> The input string is "+ str);
	}
	
	public void testMethod1(String s) {
		System.out.println("Calling testMethod2 -> The input string is "+s);
	}
	
	private void testMethod2(String s) {
		System.out.println("Calling private testMethod3 -> The input string is "+s);
	}
	
	
	class TestSub{
		private int a;
		
		TestSub(int a){
			this.a = a;
		}
	}
}
