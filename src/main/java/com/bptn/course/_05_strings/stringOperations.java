package com.bptn.course._05_strings;

import java.util.Scanner;

public class stringOperations {

	public static void main(String[] args) {
		
		//step 1: create an object from the scanner class
		Scanner scanner = new Scanner(System.in);
		
					
		//Step 2: assign values to the variable and include the boolean expression
		int superChoice;
		int choice;
		
		
		
		//Step 3: display string menu
	 	 
				System.out.println("Press 1 for Palindrome Check");
				System.out.println("Press 2 to reverse a String");
				System.out.println("Press 3 for to Concatenate two Strings");
				System.out.println("Press 4 for for String Comparison");
				System.out.println("Press 5 to to Calculate the Length of String");
				
				superChoice = scanner.nextInt();
				scanner.nextLine();
				
				 if (superChoice == 1) {
						System.out.print("Enter the first string: ");
						
				String input = scanner.nextLine();
			    String reverseInput = "";
					       

			    for (int i = input.length() - 1; i >= 0; i--) {
					reverseInput += input.charAt(i);
			    }
			    
			    if (input.toLowerCase().equals(reverseInput.toLowerCase())) {
		            System.out.println("Input string is palindrome");
		        } else {
		            System.out.println("Input string is not palindrome");
		        }
			    
			  // length of string
				 } else if (superChoice == 5) {
					System.out.print("Enter the string to calculate its length: ");
					String strLength = scanner.nextLine();
	                System.out.println("The length of the string is: " + strLength.length());
			    
		}
				 //concat two strings
				 if (superChoice == 3) {
        
					System.out.print("Enter the first string: ");
					String firstString = scanner.nextLine();
					System.out.print("Enter the second string: ");
					String secondString = scanner.nextLine();
        
					String concatString = firstString + secondString;
					System.out.println("Concat string: " + concatString);
				 
			        }  else {
						  System.out.print("Invalid choice! Please make a valid choice: ");
					  }   
				       System.out.println("if true repeat, else exit");
				       superChoice = scanner.nextInt();
				       
				 while (superChoice == 1);  
						System.out.print("Exiting program, goodbye ");
						scanner.close();

	}
}

	



	
		
				
						
						
				
		