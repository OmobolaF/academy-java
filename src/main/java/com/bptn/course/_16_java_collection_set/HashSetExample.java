package com.bptn.course._16_java_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Create an object of HashSet
		
				Set<String> hashSet = new HashSet<>();
				
				hashSet.add("apple");
				hashSet.add("banana");
				hashSet.add("cherry");
				hashSet.add("mango");
				hashSet.add("apple"); // It allows duplicates ? NO
				hashSet.add(null); //It allows null values? Yes
				
				System.out.println("The HashSet of fruits: "+ hashSet );
				

			}

		}


		//Major key takeaways:

		//1. Insertion Order - NO
		//2. It allows null values? It allows max 1 null value
		//3. It allows duplicates ? NO
		//4. Underlying implementation- Hash Table
		//5. Is a HashSet indexed ? - NO