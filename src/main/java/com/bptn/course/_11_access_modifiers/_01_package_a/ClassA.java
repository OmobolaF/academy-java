package com.bptn.course._11_access_modifiers._01_package_a;

public class ClassA {

	
		//declare a private variable
		private int privateVar;
		
		//declare a public variable
		public int publicVar;
		
		//declaer a default variable
		int defaultVar;
		
		//declare a private mtethod
		private void privateMethod() {
			System.out.println("This is a private method");
		}
		
		//public method
		public void publicMethod() {
			System.out.println("This is a public method");	
		}
		//default method
		void defaultMethod() {
			System.out.println("This is a default method");
		}
		
		//protected method
		protected void protectedMethod() {
			System.out.println("This is a protected method");
		}
		public static void main(String[] args) {
			//create an object of ClassA
			ClassA myObj= new ClassA();
			
			//YES WE CAN ACCESS THE PRIVATE METHOD WITHIN THE SAME CLASS
			myObj.privateMethod();
			
			//YES WE CAN ACCESS THE PRIVATE VARIABLE WITHIN THE SAME CLASS
			System.out.println("Accessing private variable: "+ myObj.privateVar);
			
			
	}

}
