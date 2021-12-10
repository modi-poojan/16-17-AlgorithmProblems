package com.Algorithms;

import java.util.Arrays;

public class BubbleSortGenerics<T extends Comparable<T>> {

	public static <T extends Comparable<T>> void sorting(T[] array) {
		for(Integer i = 0 ; i < array.length; i++) {
			for(Integer	 j = 0; j < array.length-1-i; j++) {
				if(array[j].compareTo(array[j+1]) > 0) {
					Integer temp =(Integer) array[j];             
					array[j] = array[j+1];			
					array[j+1] = (T)temp;
				}
			}
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));    
	}
}
