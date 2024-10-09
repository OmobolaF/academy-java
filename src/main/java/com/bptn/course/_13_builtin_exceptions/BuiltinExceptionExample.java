package com.bptn.course._13_builtin_exceptions;

public class BuiltinExceptionExample {
	//create a method which checks if a number is positive or negative
	
	public static void checkPositive(int number) throws IllegalArgumentException{
		
		if(number<0) {
			throw new IllegalArgumentException ("The number must be positive");
		}
		System.out.println("The number is positive");
	}
	public static void main(String[] args) {
		
		try {
			checkPositive(10); //this calls is expected to be fine
			checkPositive(-10);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Caught an exception: "+ e.getMessage());
		}
	

	}

}
//IllegalArgumentException is a subclass of RuntimeException
//RuntimeException is  a subclass of Exception
//throws always comes in the method signature
//throws is optional in unchecked exception
//throws is used in checked exception(custome exception which is created as a checked exception)
