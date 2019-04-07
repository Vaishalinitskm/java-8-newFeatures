package com.tutorial.practise.polymor;
/**
 * Complex example explaining important polymorphism concepts.
 * 
 * - Static Binding
 * - Dynamic Binding - Late Binding
 * - Dynamic Method Dispatch - Runtime polymorphism
 * 
 * @author Vaishali
 *
 */
public class ComplexTestPoly {
	
	public static void main(String args[]) {
		
		new ComplexTestPoly().callATypeOfAnimal(new BabyDog());//maps to the method 2 
		///bcz it is the most immediate parent
	}
	
	// method 1
	private void callATypeOfAnimal(Animal animal) {
		System.out.println(animal.animalStr);
		animal.animalVoice();
		
	}
	
	// method 2
	private void callATypeOfAnimal(Dog dog) {//Here, it does 'Static Binding',maps to immediate parent
		System.out.println(dog.dogStr);
		dog.animalVoice();// this part is doing 'Dynamic Method Dispatch'
	}

}


class Animal{
	
	String animalStr = "Parent - Animal";
	
	Animal(){
		System.out.println("I am an animal...");
	}
	
	public void animalVoice() {
		System.out.println("An animal voice...");
	}
}

class Dog extends Animal{
	
	String dogStr = "Dog - Animal";
	
	Dog(){
		System.out.println("I am a dog and also one of Animal...");
	}
	
	public void animalVoice() {
		System.out.println("A dog voice...");
	}
	
}

class BabyDog extends Dog{
	
	String babyDogStr = "BabyDog - Animal";
	
	BabyDog(){
		System.out.println("I am a baby dog and a dog and also an animal...");
	}
	
	public void animalVoice() {
		System.out.println("A babyDog voice...");
	}
	
}