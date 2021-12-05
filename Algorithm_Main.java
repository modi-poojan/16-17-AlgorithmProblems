package com.Algorithms;

import java.util.Scanner;

public class Algorithm_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st String \n");
		String first = scan.next();
		System.out.println("Enter 2nd String \n");
		String second = scan.next();
		System.out.println("\nGiven String :\n"+first+"\n"+second);
		
		AnagramDetection call = new AnagramDetection();
		call.checkAnagram(first, second);
		
}
}