package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		//String s = "Hello \" World";
		//System.out.println(s);
		
		//to create a new String
		
				String s= "Hello World";
				String reversedWord="";
				
				//find the total length of the string and store it inside a variable
				int stringLength= s.length();
				
				System.out.println("The length of the string is: "+stringLength);
				
				//substring( method - to get a part of the String
				
				String sub = s.substring(0, 5);
				
				System.out.println("The substring with start index 0 and end index 5:"+ sub);
				
				String  sub1 = s.substring(3);
				System.out.println("The substring with start index 3 "+ sub1);
				
				//toLowerCase( - converts all the letter of the string to lowercase
				String lowerCaseString = s.toLowerCase();
				System.out.println("The lowercase of the string is: "+ lowerCaseString);
				
				//toUpperCase() -converts all the letters of the string to UpperCase
				String upperCaseString = s.toUpperCase();
				System.out.println("The uppercase of the string is: " + upperCaseString);
				
				int index = s.indexOf("World");
				
				System.out.println("The index of World is: "+ index);
				
				//Find the character at the specified index -0
				char c = s.charAt(0);
				
				System.out.println("The character at index 0: "+ c);
				
				//Find the character at the specified index -3
				
				char c1 = s.charAt(3);
				
				System.out.println("The character at index 3: "+ c1);
				
				for(int i= s.length()-1 ; i>=0 ; i--) {
					
					reversedWord += s.charAt(i);
				}
				
				System.out.println("Reversed word: "+ reversedWord);
	}
}
