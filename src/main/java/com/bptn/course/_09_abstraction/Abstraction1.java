package com.bptn.course._09_abstraction;


//abstraction using abstract class

abstract class Shape {
	
//abstract method has no implementation
//cannot create objects-cant be instantiated
	
	abstract void draw();
	
	abstract void print();
	
	//can consist of normal methods
	void moveTo(int x, int y ) {
		System.out.println("Move to: "+ x+y);
	}
}

//subclass which extends the parent class and in this case is Shape class
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("Draw a circle");
		
	}

	@Override
	void print() {
		System.out.println("Print a circle");
		
}
	
	//sub class extends Shape class
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
	
		//create objects from circle class
		Circle c1= new Circle();
		c1.draw();
		c1.print();
		
		c1.moveTo(2,3); //this is an inherited method from Shape class
		
		Rectangle r1= new Rectangle(); 
		r1.draw();
		r1.print();
		
		r1.moveTo(5,6); 

	}
}
}
}

//abstract method has no implementation
//cannot create objects-cant be instantiated
//subclass implements the abstract methods from the abstract class by following the rules of overriding
//in this case is circle