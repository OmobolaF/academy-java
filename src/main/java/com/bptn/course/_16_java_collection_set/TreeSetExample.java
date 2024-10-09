package com.bptn.course._16_java_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//Create an object of TreeSet
				Set<String> treeSet = new TreeSet<>();
				
				treeSet.add("mango");
				treeSet.add("cherry");
				treeSet.add("apple");
				treeSet.add("banana");
				treeSet.add("pineapple");
				
				treeSet.add("mango"); //It allows duplicates ? No
				
				//treeSet.add(null); //It allows null values?  No
				
				
				System.out.println("TreeSet is : "+ treeSet);
				
				
			}

		}

