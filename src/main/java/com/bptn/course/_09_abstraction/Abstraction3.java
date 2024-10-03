package com.bptn.course._09_abstraction;

//after Java 8
//from Java 8-interfaces can support abstract methods, default methods and static methods

interface Operations{
	String getRandomNumber = null;

	void draw(); //abstract method has no implementation
	
	//default method-has some implementation
	default int add(int a, int b) {
		return a+b;
}
	
	//static method
	static double getRandomNumber() {
		return Math.random();
	}
	}

//subclass- create a subclass tht implements the Operations interface
class Calculator implements Operations{
//compiler always enforces the subclass to implement or override the methods in the abstract methods from the interface
	@Override
	public void draw() {
		System.out.println("Draw method implemented by Calculator Class");
		
	}
	
}
public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3);
		System.out.println("The result is: "+ result);
		System.out.println("The random number is: "+ Operations.getRandomNumber);


	}

}
