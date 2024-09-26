package com.bptn.course._04_arrays;

public class EvenNumbers {

	public static void main(String[] args) {

		//approach 1
for(int i= 2; i<=100; i+=2) {
	System.out.println(i);
}
//approach 2
for(int i=1; i<=100 ;i++) {
	
	if(i%2==0) {
		System.out.println(i);
	}
}
	}

}
