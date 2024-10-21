package com.bptn.course._22_test;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //step 1
        Scanner scanner = new Scanner(System.in);

        //step 2
        int targetNumber = 23;
        int guess = 0;

        //step 3
        System.out.println("NumberGuessingGame");
        System.out.println("Please enter a number between 1 and 100: ");

        while (guess != targetNumber) {
        guess = scanner.nextInt();

         if (guess < targetNumber) {
		System.out.println("Your guess is too low. Try again:");
	      } else if (guess > targetNumber) {
	   System.out.println("Your guess is too high. Try again:");
	   } else {
	   System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
		             }
		        }
		        
		        // Close the scanner
		        scanner.close();





    }
}
		        
