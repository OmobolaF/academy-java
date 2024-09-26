package com.bptn.course._05_strings;

public class Strings {

	public static void main(String[] args) {
		
		String s = "Hello \" World";
		System.out.println(s);
		
				//find the total legth of the string and stoe it inside a variable
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
				String uperCaseString = s.toUpperCase();
	}
}
