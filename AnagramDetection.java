package com.Algorithms;

import java.util.Arrays;

public class AnagramDetection {

	public void checkAnagram(String first, String second) {
		
		char firstString [] = first.toLowerCase().toCharArray();
		char secondString [] = second.toLowerCase().toCharArray();
		
		Arrays.sort(firstString);
		Arrays.sort(secondString);
		
		if(Arrays.equals(firstString, secondString)) 
			System.out.println("\nGiven Strings are an Anagram");
		else 
			System.out.println("\nNot an Anagram");
			
		
		
	}
}
