package com.Algorithms;

import java.util.Arrays;

public class Algorithm_Main {

	public static void main(String[] args) {
		
		MergeSort call = new MergeSort();
		int array[] = {89, 51 ,72 ,14 , 1, 35};
		System.out.println("Unsorted array is :"+ Arrays.toString(array));
		
		call.mergeSort(array, 0, array.length-1);
		System.out.println("Sorted array is :"+ Arrays.toString(array));
	}
}
