package com.bptn.course._06_big_coding_friday;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//Step 1: create an object from the scanner class
				Scanner scanner = new Scanner(System.in);
						
		//Step 2: assign values to the variable and convert int to double
						int firstNumber;
						double myDouble;
						double myDouble1;
						int select;
						
						
						
		//Step 3: display calculator menu
			do {				 	 
				System.out.println("Press 1 for addition\n"
			       		+ "Press 2 for subtraction\r\n"
			       		+ "Press 3 for multiplication\r\n"
			       		+ "Press 4 for division\r\n"
			       		+ "Press 5 to square a number\r\n"
			       		+ "Press 6 to find a square root\r\n"
			       		+ "Press 7 to find the reciprocal");
			//step 4:
				
				firstNumber = scanner.nextInt();
						
			//step 5:
			       if (firstNumber == 1) {
			    	   System.out.print("Enter the first number: ");
			           myDouble = scanner.nextDouble();
			           System.out.print("Enter the second number: ");
			           myDouble1 = scanner.nextDouble();
	
			          double result = myDouble + myDouble1;
			          
			           System.out.println("The addition of the numbers " + myDouble + " and " + myDouble1 + " is: " + result);
		 			
		
			       }
			       else if (firstNumber == 2) {
			    	   System.out.print("Enter the first number: ");
			           myDouble = scanner.nextDouble();
			           System.out.print("Enter the second number: ");
			           myDouble1 = scanner.nextDouble();
	
			          double result = myDouble - myDouble1;
			          
			           System.out.println("The substraction of the numbers " + myDouble + " and " + myDouble1 + " is: " + result);
			    	   
			       }
			       else if (firstNumber == 3) {
			    	   System.out.print("Enter the first number: ");
			           myDouble = scanner.nextDouble();
			           System.out.print("Enter the second number: ");
			           myDouble1 = scanner.nextDouble();
	
			          double result = myDouble * myDouble1;
			          
			           System.out.println("The multiplication of the numbers " + myDouble + " and " + myDouble1 + " is: " + result);
			       }
	
			       else if (firstNumber == 4) {
			    	   System.out.print("Enter the first number: ");
			           myDouble = scanner.nextDouble();
			           System.out.print("Enter the second number: ");
			           myDouble1 = scanner.nextDouble();
	
			          double result = myDouble / myDouble1;
			          
			           System.out.println("The division of the numbers " + myDouble + " and " + myDouble1 + " is: " + result);
			          
			       }

			       else if (firstNumber == 5) {
			    	   System.out.print("Enter the number you want to square: ");
			           myDouble = scanner.nextDouble();
			          
	
			          double result = myDouble * myDouble;
			          System.out.println("The Square of the number: " + myDouble + " is = " + result);
			          
			       }  

			      
				  else if (firstNumber == 6) {
					  System.out.print("Enter to find a square root: ");
				      myDouble = scanner.nextDouble();
				          
		
				      double result = Math.sqrt(myDouble);
				          
				           
				      System.out.println("The Square root of the number: " + myDouble + " is = " + result);
				  }
			       
				  else if (firstNumber == 7) {
					  System.out.print("Enter to find the reciprocal: ");
				      myDouble = scanner.nextDouble();
				          
		
				      double result = 1 / myDouble;
				          
				           
				      System.out.println("The reciprocal of the number: " + myDouble + " is = " + result);
				      
				  }
			       
				  else {
					  System.out.print("Invalid choice! Please make a valid choice: ");
				      myDouble = scanner.nextDouble();
				  }   
			       System.out.println("to continue calculation Press 1, else press any other number to exit");
			       select = scanner.nextInt();
			       
			} while (select == 1);  
					System.out.print("Exiting program, goodbye ");
					scanner.close();
	}
}
		
		
		
			

		
