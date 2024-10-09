package com.bptn.course._09_abstraction;


//Abstraction using abstract class

//Abstract class- its a class that cannot be instantiated- it cannot be used to create objects

abstract class Shape{
	
	//Abstract method --> a method which has no implementation
	abstract void draw();
	
	abstract void print();
	
	//normal method- which has an implementation
	void moveTo(int x, int y) {
		System.out.println("Move to: "+ x + y);
	}
}


//Sub class(child class) extends Shape class
class Circle extends Shape{

	@Override
	void draw() {
		
		System.out.println("Draw a circle");
		
	}

	@Override
	void print() {
		System.out.println("Print a circle");
		
	}

	
}

//Sub class(child class) extends Shape class
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	void print() {
		System.out.println("Print a rectangle");
		
	}

	
}

public class Abstraction1 {

	public static void main(String[] args) {
		
		//Create objects from Circle class
		Circle c1= new Circle();
		c1.draw(); 
		c1.print();
		
		c1.moveTo(2, 3);// this is an inherited method from Shape class
		
		Rectangle r1= new Rectangle();
		r1.draw();
		r1.print();
		
		r1.moveTo(5, 6);// this is an inherited method from Shape class

	}

}


//abstract method has no implementation
//cannot create objects-cant be instantiated
//subclass implements the abstract methods from the abstract class by following the rules of overriding
//in this case is circle