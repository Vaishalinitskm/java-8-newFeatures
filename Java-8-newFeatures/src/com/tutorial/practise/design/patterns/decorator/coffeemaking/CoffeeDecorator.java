package com.tutorial.practise.design.patterns.decorator.coffeemaking;

public abstract class CoffeeDecorator implements Coffee{
	
	Coffee coffeeToBePrepared;
	
	public CoffeeDecorator(Coffee coffeeToBePrepared) {
		// TODO Auto-generated constructor stub
		this.coffeeToBePrepared = coffeeToBePrepared;
	}
	
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return coffeeToBePrepared.getCost();
	}
	
	@Override
	public String getIngredients() {
		// TODO Auto-generated method stub
		return coffeeToBePrepared.getIngredients();
	}

}
