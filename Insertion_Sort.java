package com.Algorithms;

import java.util.Arrays;

public class Insertion_Sort {

	public void sorting(String[] array) {
		
		for(int i = 1; i < array.length; i++) {
			
			String temp = array[i];               
			int index = i ;
			
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
