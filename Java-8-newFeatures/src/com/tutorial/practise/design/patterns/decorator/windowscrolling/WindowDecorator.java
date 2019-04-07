package com.tutorial.practise.design.patterns.decorator.windowscrolling;

public abstract class WindowDecorator implements Window{
	
	protected Window windowToBeDecorated;
	
	public WindowDecorator(Window windowToBeDecorated) {
		// TODO Auto-generated constructor stub
		this.windowToBeDecorated = windowToBeDecorated;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		windowToBeDecorated.draw();
	}
	
	@Override
	public String getDrawDesc() {
		// TODO Auto-generated method stub
		return windowToBeDecorated.getDrawDesc();
	}

}
