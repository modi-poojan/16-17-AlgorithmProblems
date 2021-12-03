package com.Algorithms;

import java.util.Arrays;

public class Algorithm_Main {

	public static void main(String[] args) {
		
		System.out.println("Insertion Sorting\n");
		
		Insertion_Sort call = new Insertion_Sort();
		String array[] = {"Europe","Africa", "South America","Asia", "Antarctica", "Australia","North America" };
		
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		call.sorting(array);
	}
}
