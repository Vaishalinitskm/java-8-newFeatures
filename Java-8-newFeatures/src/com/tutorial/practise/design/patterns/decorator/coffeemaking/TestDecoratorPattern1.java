package com.tutorial.practise.design.patterns.decorator.coffeemaking;

public class TestDecoratorPattern1 {
	
	public static void main(String args[]) {
		
		Coffee coffee = new SimpleCoffee();
		getInfo(coffee);
		
		coffee = new CoffeeDecorWithMilk(coffee);
		getInfo(coffee);
		
		coffee = new CoffeeDecorWithSprinkles(coffee);
		getInfo(coffee);
	}
	
	static void getInfo(Coffee coffee){
		System.out.println("Cost: "+coffee.getCost() + " | "+ "Ingredients: "+ coffee.getIngredients());
	}

}
