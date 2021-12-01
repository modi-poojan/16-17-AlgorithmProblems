package com.Algorithms;

import java.util.Arrays;

public class Insertion_Sort {

	public void sorting(String[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			String key = array[i];               
			int index = i - 1;
			
			while(index >= 0) {
				
				if(key.compareTo(array[index]) > 0) {
					break;
				}
				array[index + 1] = array[index];       
				index--;
			}
			array[index + 1] = key;          
		}
		System.out.println("\nSorted Array :-  " + Arrays.toString(array));
	}
}
