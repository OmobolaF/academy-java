package com.bptn.course._22_test;

public class Car {

	
		

		    //Declare a String color, String brand, int price
		    private String color;
		    private String brand;
		    private int price;

		    // Default constructor
		    public Car() {
		    // Calls the parameterized constructor with default values
		        this("Unknown", "Unknown", 0); 
		    }
		// calls the parameterized constructor
		    public Car(String color, String brand, int price) {
		    
		        
		     //Define a parameterized constructor with parameters String color, String brand, int price) {
		    //Assign Constructor parameters String color, String brand, and int price to Class variables with the this keyword.
		        this.color = color;
		        this.brand = brand;
		        this.price = price;
		    }

		    void printCarDetails() {
		        this.print();
		    
		    }
		//private method
		    private void print() {
		  System.out.println("Car(color='" + color + "', brand='" + brand + "', price=" + price + ")");
		    }
		    

		
		}

	


