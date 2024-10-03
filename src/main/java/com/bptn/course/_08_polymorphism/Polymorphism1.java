package com.bptn.course._08_polymorphism;


	//parent class 1.
	class Animal {
	
		//create a method 2.
		void makeSound() {
			System.out.println("Animal makes a sound");
		}
	}
	
	//create a subclass using extend 3.
	class Dog extends Animal{
		
	//has its own methods	6.
		//method override
		@Override
		void makeSound() {
			System.out.println("Dog barks");
		}
		
		
		
		
	}
	public class Polymorphism1 {

	public static void main(String[] args) {
	//instantiate the animal class by creating an object of Animal class 4.
		Animal a1= new Animal();
		a1.makeSound();
		
		//create an object from Dog class (inheritance) 5.
		Dog d1= new Dog();
		d1.makeSound();

	}

}
//Major key takeaways
//method overriding- these are the scenarios
//1.for overriding to happen, when subclass decides to override 
//an existing method in the parent class
//2.inheritance must happen
//3.the name of the method, return type of the method which is void 
//and number of parameters in the overridden method must be the same
//by convention, overridden method has @override annotation above its method signature
//4.static method cannot be overridden by the subclass
//RUNTIME POLYMORPHISM AKA OVERIDING METHOD