package com.bptn.course._03_flow_control._02_for_loop;

public class PrintEvenFrom0To100 {

	public static void main(String[] args) {
		
		//there are different ways to solve a problem
		//Approach-2
				for(int i= 1 ; i<=100 ;i++) {
					
					if(i%2==0) {
						System.out.println(i);
					}
				}
				
				//Approach-1
				for(int i= 2; i<=100; i+=2) {
					
					System.out.println(i);
				}


	}

}