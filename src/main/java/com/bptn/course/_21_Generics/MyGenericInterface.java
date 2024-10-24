package com.bptn.course._21_Generics;

interface GenericInterface<T>{
	
	T getData();
}


class MyGenericImplementation<T> implements GenericInterface<T> {

	T data;
	
	
	
	MyGenericImplementation(T data) {
		this.data = data;
	}


	@Override
	public T getData() {
	
		return this.data;
	}
	
	
}


public class MyGenericInterface {

	public static void main(String[] args) {
		
		GenericInterface<String> obj = new MyGenericImplementation<>("Hello");
		System.out.println(obj.getData());

	}


}
