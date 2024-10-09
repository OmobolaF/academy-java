package com.bptn.course._15_java_collection_list._01_arraylist_coding_exercises;

import java.util.ArrayList;

public class MoveSmallestElement {

	 public static void moveSmallest(ArrayList<Integer> list) {
	        int smallestIndex = 0;
	        
	        //for i=0,1,2,3,4,5
	        
	        for (int i =0; i<list.size() ; i++) {
	            if (list.get(i)< list.get(smallestIndex)) {
	                smallestIndex = i;
	            }
	        }
	        
	       Integer smallest = list.remove(smallestIndex);
	  
	        //move smallest to front
	        
	        list.add(0, smallest);
	        
	        
	        

	    }

	    public static void main(String[] args) {
	        //instantiate ArrayList and fill with Integers
	    	ArrayList<Integer> values = new ArrayList<>();
	        
	        
	        int[] nums = {3, 11, 54, 7, 1, 22};
	        for (int i = 0; i < nums.length; i ++) {
	            values.add(nums[i]);
	        }
	        
	        //values= [3,11,54,7,1,22]
	        
	        moveSmallest(values);
	        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
	        System.out.println("Your Result: " + values);
	    }
	}

	//i =0 
	//3<3
	//smallestIndex=0

	//i=1
	//11<3
	//smallestIndex=0

	//i=2
	//54<3
	//smallestIndex=0

	//i=3
	//7<3
	//smallestIndex=0


	//i=4
	//1<3 
	//smallestIndex=4

	//i=5
	//22<1
	//smallestIndex=4

	//smallest=1

	//[1,3,11,54,7,22]