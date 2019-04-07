package com.tutorial.practise.design.patterns.decorator.windowscrolling;

public class VerticalScrollerWindowDecorator extends WindowDecorator{

	public VerticalScrollerWindowDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawVerticalScrollBar();
	}
	
	private void drawVerticalScrollBar() {
		// TODO Auto-generated method stub
		//draw vertical scroll bar
	}

	@Override
	public String getDrawDesc() {
		// TODO Auto-generated method stub
		return super.getDrawDesc() + " with vertical scroll bar";
	}
	
}
