package com.bptn.course._10_static_conceps;

public class ClassName {
	
	//declare a static variable
	static int staticVariable=100;
	
	//declare an instance variable
	int instanceVariable;
	
	//declare a static method
	static void staticMethod() {
		System.out.println("Static method is called..");
		
		//can i access an IV? NO
		//InstanceVariable=100;
		
		//can i access an instance method? NO
		//InstanceMethod();
		}
	
	void InstanceMethod() {
		System.out.println("Instance method is called..");
		
		//can i access a StaticVariable within an instance method- yes
		System.out.println("Static variable : "+staticVariable);
		
		//can i access a Static method within an instance method- yes
		staticMethod();
		
		//this.staticVariable-NO.won't work
	}
	
	public static void main(String[] args) {
	ClassName c1=new ClassName();
	c1.InstanceMethod();
	
	//access the static variable
	System.out.println("Static variable : "+staticVariable);
	staticMethod();

	}

}
