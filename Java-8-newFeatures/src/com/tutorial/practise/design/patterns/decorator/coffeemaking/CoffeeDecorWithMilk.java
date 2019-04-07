package com.tutorial.practise.design.patterns.decorator.coffeemaking;

public class CoffeeDecorWithMilk extends CoffeeDecorator{

	public CoffeeDecorWithMilk(Coffee coffeeToBePrepared) {
		super(coffeeToBePrepared);
		// TODO Auto-generated constructor stub
	}
	
	 @Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 5.0;
	}
	 
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients()+ ", milk";
	}
	

}
