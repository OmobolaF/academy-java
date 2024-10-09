package com.bptn.course._15_java_collection_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//1st way of declaring ArrayList
				//ArrayList<Integer> arrayList = new ArrayList<>();	
				
				
				//2nd way of declaring ArrayList -- more preferred and accurate
				List<Integer> arrayList = new ArrayList<>();
				
				//Add values into arrayList
				arrayList.add(100);
				arrayList.add(200);
				arrayList.add(300);
				arrayList.add(300);  //ArrayList allow duplicates
				arrayList.add(400);
				arrayList.add(null); //ArrayList allow null values
				arrayList.add(null); //ArrayList allows duplicate null values
				
				
				System.out.println(arrayList);
				
				//The size of the arraylist
				System.out.println("The size of arraylist: "+ arrayList.size());
				
				//Access the first element 
				System.out.println("The first element is: "+ arrayList.get(0));
				
				//Update the element at index 2
				arrayList.set(2, 250);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				arrayList.set(5, 450);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				arrayList.add(7, 500);
				
				System.out.println("Updated ArrayList" + arrayList);
				
				//Remove an element from index 4
				System.out.println("The element removed is: "+ arrayList.remove(4));
				
				
				//The size of the arraylist
				System.out.println("The size of arraylist: "+ arrayList.size());
				
				
				//Accessing the elements using traditional for-loop
				for(int i=0 ; i< arrayList.size() ;i++) {
					
					System.out.println(arrayList.get(i));
				}
				
				//Access the elements using for-each loop
				for(Integer element: arrayList) {
					
					System.out.println(element);
				}

			}

		}

		//<> diamond operator ->Java Generics


		//1. SOLID principles 
		//D- > Dependency inversion principle
		//High-level modules should not depend on low-level modules. Both should depend on abstractions.
		//Abstractions should not depend on details. Details should depend on abstractions.
		///List is an abstraction (an interface), while ArrayList is a concrete implementation (a detail).



		//1. The 1st way of declaring is relying on concrete implementation which does not follow Dependency Inversion Principle

		//2. The 2nd of declaring is relying on Abstraction which follows DIP

		//3.  ArrayList<Integer> arrayList = new ArrayList<>();  
		//The arrayList object has access to both List methods and any methods specific to the ArrayList class 
		//(like trimToSize() and ensureCapacity()).


		//4. List<Integer> arrayList = new ArrayList<>();
		//The arrayList object can only call methods defined in the List interface. You won’t have access to ArrayList-specific methods.

		//5. array[0] --> access the first element in an array
		// arrayList.get(0) ->access the first element in an ArrayList

		//6. array.length -->length of an array
		//arrayList.size() --> length of an ArrayList

		//https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
