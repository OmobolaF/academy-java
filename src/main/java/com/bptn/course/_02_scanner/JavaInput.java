package com.bptn.course._02_scanner;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		// created myObj which is the object of the scanner class
		Scanner myObj= new Scanner(System.in);
		
		
		//ask the user to enter the username by printing "Enter Username" 
		System.out.println("Enter the username : ");
				
		//create a variable "userName" which is used to store the string data type and read the input given by the user
		String userName= myObj.nextLine();
		
		
		
		//print the username on the console
		System.out.println("The username is "+ userName);
		
		//close the scanner
		myObj.close();

	}

}
