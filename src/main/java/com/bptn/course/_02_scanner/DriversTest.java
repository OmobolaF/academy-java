package com.bptn.course._02_scanner;


//


import java.util.Scanner;

public class DriversTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You can get a driver's license in most states!");
        } else {
            System.out.println("Sorry, you need to be older to get a driver's license.");
        }
    }
}