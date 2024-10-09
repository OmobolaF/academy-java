package com.bptn.course._16_java_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashExample {

	public static void main(String[] args) {
		//Create LinkedHashSet object
				Set<String> linkedHashSet = new LinkedHashSet<>();
				
				linkedHashSet.add("banana");
				linkedHashSet.add("apple");
				linkedHashSet.add("mango");
				linkedHashSet.add("cherry");
				
				linkedHashSet.add("banana");  //It allows duplicates ? 
				
				
				linkedHashSet.add(null);
				
				System.out.println("The LinkedHashSet is: "+ linkedHashSet);

			}

		}


		//Major key takeaways:

		//1. Insertion Order - Yes
		//2. It allows null values?  It allows max one null value
		//3. It allows duplicates ? No
		//4. Underlying implementation-  HashTable and Doubly LinkedList
		//5. Is a LinkedHashSet indexed ? -  No
