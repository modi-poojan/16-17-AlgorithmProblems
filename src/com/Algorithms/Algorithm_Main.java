package com.Algorithms;

import java.util.Arrays;

public class Algorithm_Main {

	public static void main(String[] args) {
		
		System.out.println("\n\nBubble Sorting\n");
		
		Bubble_Sort call = new Bubble_Sort();
		int array[] = {73, 51, 33, 45, 96, 45, 21, 130};
		
		System.out.println("Given Array :-  " + Arrays.toString(array));
		
		call.sorting(array);
	}
}
