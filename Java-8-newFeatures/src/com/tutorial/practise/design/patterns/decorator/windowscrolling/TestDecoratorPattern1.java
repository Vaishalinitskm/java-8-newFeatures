package com.tutorial.practise.design.patterns.decorator.windowscrolling;

public class TestDecoratorPattern1 {
	
	public static void main(String args[]) {
		
		
		Window windowToBeDecorated = new HorizontalScrollerWindowDecorator(
				new VerticalScrollerWindowDecorator(new SimpleWindow()));
		System.out.println(windowToBeDecorated.getDrawDesc());
	}
	
	

}
