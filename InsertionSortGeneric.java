package com.Algorithms;

import java.util.Arrays;

public class InsertionSortGeneric<T extends Comparable<T>> {

public <T extends Comparable<T>>void sorting(T[] array) {
		
		for(Integer i = 1; i < array.length; i++) {
			
			T temp = array[i];               
			Integer index = i ;
			
			while(index > 0 && array[index-1].compareTo(temp) > 0){
				
				if(temp.compareTo(array[index]) > 0) {
					break;
				}
				array[index] = array[index - 1];       
				index--;
			}
			array[index] = temp;          
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));
	}
}
