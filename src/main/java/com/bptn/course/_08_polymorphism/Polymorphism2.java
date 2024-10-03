package com.bptn.course._08_polymorphism;



//parent class 1.
class Shape {
	
	//create a method 2.
			void drawAngle() {
				System.out.println("Drawing a shape angle");
			}
}

//sub class rectangle
class Rectangle extends Shape {
	
	@Override
	void drawAngle() {
		System.out.println("Drawing a rectangle");
	}
}








public class Polymorphism2 {

	public static void main(String[] args) {
		
		Rectangle r1= new Rectangle();
		r1.drawAngle();
		
		
	}

}
//create a parent class called shape
//create one subclass called rectangle 
//create a method called drawAngle() in the shape class
//and override it in the rectangle class