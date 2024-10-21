package com.bptn.course._22_test;

import java.util.ArrayList;

public class Values {

	public static void main(String[] args) {
		ArrayList<Integer> values = null;
	       System.out.println(values);
	       
	       
	       values = new ArrayList<Integer>();
	       System.out.println(values);
	       System.out.println("size is " + values.size());
	       
	       // ADD w/o index
	      values.add(25);                  // Autoboxing example
	       System.out.println( values);
	       values.add(73);
	       System.out.println( values);
	       values.add(14);
	       System.out.println( values);
	       values.add(Integer.valueOf(85)); 
	       System.out.println( values);
	       values.add(Integer.valueOf(9));// no boxing necessary
	       System.out.println( values);
	       System.out.println("size is " +  values.size());
	       
	       
	       values.add(2, 5);// no boxing necessary
	       System.out.println( values);
	       System.out.println("size is " +  values.size());
	}

}
