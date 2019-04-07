package com.tutorial.practise.lamdaEx;

public class FuncInstrWithoutLamdaExpress {
	
	public static void main(String args[]) {
		FuncInter func = new FuncInterImpl();
		func.m1();
	}
	

}

class FuncInterImpl implements FuncInter
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Normal Implm without lamda expression");
	}
	
}
