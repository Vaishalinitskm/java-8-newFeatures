package com.tutorial.practise.lamdaEx;

public class FuncInstrWithLamdaExpress {
	
	public static void main(String args[]) {
		
		// Using lamda expression to directly provide implementation
		FuncInter func = () -> System.out.println("LamdaExpression Implementation");
		func.m1();
	}
}
