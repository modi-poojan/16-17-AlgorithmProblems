package com.Algorithms;

import java.util.Arrays;

public class Algorithm_Main {

	public static void main(String[] args) {
		System.out.println(" Bubble Sorting Using Generic\n");
		
		Integer array[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		BubbleSortGenerics call = new BubbleSortGenerics();
		call.sorting(array); 
		
		System.out.println("\nInsertion Sorting using generics \n");
		
		Integer array1[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
		System.out.println("Given Array :-  " + Arrays.toString(array1));

		InsertionSortGeneric obj = new InsertionSortGeneric();
		obj.sorting(array1); 
		
		System.out.println("\n Merge Sorting using generics \n");
		
		Integer array2[] = {10 , 25 , 90 , 15 , 30 , 55 , 125 , 75 , 5 , 11 , 67};
		System.out.println("Given Array :-  " + Arrays.toString(array2));
		
		MergeSortGeneric obj1 = new MergeSortGeneric();
		obj1.mergeSort(array2, 0, array2.length-1);
		
	}
}