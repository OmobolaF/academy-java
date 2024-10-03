package com.bptn.course._02_scanner;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		// Create an object from scanner class
		Scanner myObj= new Scanner(System.in);
		
		//print a statement on the console
		System.out.println("Enter your name, favorite city, age and salary");
		
		//string input for name
		String name= myObj.nextLine();
		
		//string input for fav city
		String favCity= myObj.nextLine();
		
		//Numerical input to get the user's age
		int age= myObj.nextInt();
		
		//numerical input to get the user's salary
		double salary= myObj.nextDouble();
		
		//output of all the inputs provided by the user
		System.out.println("Name: "+ name);
		System.out.println("Favourite city : "+ favCity);
		System.out.println("Age : "+ age);
		System.out.println("Salary: "+ salary);
		
		myObj.close();
	}

}
