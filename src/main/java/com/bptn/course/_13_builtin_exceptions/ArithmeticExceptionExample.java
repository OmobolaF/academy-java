package com.bptn.course._13_builtin_exceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		
		// critical statement
		try {
			int result =10/0;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
//e is an object of this class. call it e by convention or any other thing
			System.out.println("Error occured: "+ e.getMessage());
	}

}
}
