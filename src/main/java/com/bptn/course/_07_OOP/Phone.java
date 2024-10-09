package com.bptn.course._07_OOP;

//create a class
public class Phone {

	
		
		//declare instance variables - properties/attributes
		//weight, height, width, color
		private int weight;
		private int height;
		private int width;
		private String color;
		
		//constructor comes after instance variables
		//it has same name as the class- aka default const
		//does not have any return type. we have a default const- no parameters passed in the brackets
		//we have parameterized cons- parameters passed
		//should be public so you can create an object
		public Phone () {
			
			//default values
			weight=150;
			height=140;
			width=70;
			color = "Black";
		}
		
		// 1st parameterized constructor- parameters are passed in the brackets
		public Phone(int w, int h, int wi, String c) {
					weight = w;
					height = h;
					width = wi;
					color = c;
		}
		// 2nd parameterized constructor- parameters are passed in the brackets
				public Phone(int w, int h, int wi) {
							weight = w;
							height = h;
							width = wi;
		}
							
		
		//Method
		//declare its functionality- instance methods. which is the behavior
		public void makePhoneCall() {
			System.out.println("Make a phone call");
		}
		public void sendTextMessage() {	
			System.out.println("Send a text message");
		}
		
		public static void main(String[] args) {
			
		//create an object of the Phone class using default const and parameterized const
		//call the constructor to create a new phone
			Phone myObj1 = new Phone();
			System.out.println("Default Phone: "+ " Weight: " + myObj1.weight + " Height: " + myObj1.height + " Width: " + myObj1.width + " Color : " + myObj1.color);
			
			Phone myObj2 = new Phone(200, 100, 50, "Red");
			System.out.println("Custom Phone: "+ " Weight: " + myObj2.weight + " Height: " + myObj2.height + " Width: " + myObj2.width + " Color : " + myObj2.color);
			
			Phone myObj3 = new Phone(200, 100, 50);
			System.out.println("Custom Phone: "+ " Weight: " + myObj3.weight + " Height: " + myObj3.height + " Width: " + myObj3.width);
			
			//call the method using this the object which objectName.InstanceMethodName()
			
			myObj1.makePhoneCall();
			myObj1.sendTextMessage();
			
			System.out.println(myObj1);
			
	}

}
