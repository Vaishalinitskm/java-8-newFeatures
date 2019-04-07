package com.tutorial.practise.design.patterns.decorator.coffeemaking;

public class CoffeeDecorWithSprinkles extends CoffeeDecorator{

	public CoffeeDecorWithSprinkles(Coffee coffeeToBePrepared) {
		super(coffeeToBePrepared);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 4.0;
	}
	
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return super.getIngredients() + ", sprinkles";
	}

}
