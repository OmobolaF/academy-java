package com.bptn.course._22_test;

import java.util.Scanner;

public class PluralizingNouns {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.print("Enter a noun: ");
		String noun = scan.next();
		
		if (number < 0) {
			System.out.println("Please enter a positive integer");
			
		} else if (number == 1) {
			System.out.println(number + " " + noun);
			
		} else {
			String pluralNoun = noun;
			
		if (noun.endsWith("sh") || noun.endsWith("ch")) {
				pluralNoun += "es";
				
		//if noun ends with -y but not -oy, -ay, -uy, -oy, replace with -ies
		} else if (noun.endsWith("y") && !noun.endsWith("ay") && !noun.endsWith("ey") && !noun.endsWith("oy") && !noun.endsWith("uy")) {
				pluralNoun = noun.substring(0, noun.length() - 1) + "ies";
				
		// if noun ends with -fe, sub with -ves
				
		} else if (noun.endsWith("fe")){
			  pluralNoun = noun.substring(0, noun.length() - 2) + "i";
				
		//substitute with -s in other cases
				
		} else {
			pluralNoun += "s";
		}
			System.out.println(number + " " + pluralNoun); 
		}
		scan.close();
				
				
				

	}

}
