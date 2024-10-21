package com.bptn.course._20_sorting_algorithm;

import java.util.Arrays;

public class JavaSort {

	public static void main(String[] args) {
		
		int[] arr1 = {3,15,8,2,19,55};
		
		System.out.println("Before: " + Arrays.toString(arr1));
		
		Arrays.sort(arr1);
		
		System.out.println("After: " + Arrays.toString(arr1));

	}

}