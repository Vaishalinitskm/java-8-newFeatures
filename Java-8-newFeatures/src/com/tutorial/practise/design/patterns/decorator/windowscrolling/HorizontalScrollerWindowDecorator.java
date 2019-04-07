package com.tutorial.practise.design.patterns.decorator.windowscrolling;

public class HorizontalScrollerWindowDecorator extends WindowDecorator{

	public HorizontalScrollerWindowDecorator(Window windowToBeDecorated) {
		super(windowToBeDecorated);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawHorizontalScrollBar();
	}
	
	private void drawHorizontalScrollBar() {
		// TODO Auto-generated method stub
		// draw horizontal scroll bar
	}

	@Override
	public String getDrawDesc() {
		// TODO Auto-generated method stub
		return super.getDrawDesc() + " with horizontal scroll bar";
	}

}
