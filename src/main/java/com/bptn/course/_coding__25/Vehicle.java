package com.bptn.course._coding__25;

public class Vehicle {

	//instance variables
	protected String colour;
	protected String brand;
	
	
	Vehicle() {
        this("Black", "Tesla");
	}
	
		//  parameterized constructor- parameters are passed in the brackets
		public Vehicle (String colour, String brand) {
			this.brand = brand;
	        this.colour = colour;
		}
		
		
		public Vehicle(String colour, String brand, String bikeHandle) {
			this.brand = brand;
	        this.colour = colour;
		}

		
		}

		class Car extends Vehicle {
			//instance variable 
			   String steeringWheel;
			public Car(String colour, String brand) {
				super(colour, brand);
				}
			}
		
			class Bike extends Vehicle {
				
				private String bikeHandle;
				
				public Bike(String colour, String brand,String bikeHandle) {
					super(colour, brand);
					this.bikeHandle =bikeHandle;
		
				}
				
	public static void main(String[] args) {
		// You can create instances of Car and Bike here
		
		        Car car = new Car("White", "Audi");
		        Bike bike = new Bike("Grey", "BMW", "Silvercoloured");
		        System.out.println(car.colour + " " + car.brand + " " + car.steeringWheel);
		        System.out.println(bike.colour + " " + bike.brand + " " + bike.bikeHandle);

		    }

}



