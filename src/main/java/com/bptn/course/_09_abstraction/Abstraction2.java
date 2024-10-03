package com.bptn.course._09_abstraction;
//abstraction using interface- before Java 8

interface ShapeInterface{
	//before java 8- interfaces had only abstract methods and constants
	//lets create some abstract methods
	
	void draw();
	double getArea();
}

//subclass is used to implement the interface method. so create one
class RectangleClass implements ShapeInterface{

	private double width;
	private double height;
	
@Override
public void draw() {
	System.out.println("Draw a rectangle");
	
}

@Override
public double getArea() {
	return this.width * this.height;
}

public class Abstraction2 {

	public static void main(String[] args) {
		// create an object from the RectangleClass
		
		RectangleClass r1= new RectangleClass();
		r1.draw(); //calls the method from RectangleClass

	}
}
}


