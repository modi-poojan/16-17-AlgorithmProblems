package com.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {

	 ArrayList<Integer> primeList = new ArrayList<Integer>();
	 ArrayList<Integer> primepalindromelist = new ArrayList<>();

	public void prime() {

		for (int i = 2; i <= 1000; i++) {
			if (i % 2 == 0) {
				continue;
			} else {
				primeList.add(i);
			}
		}
		
		  System.out.println("Prime numbers are :\n"); 
		  for (Integer i : primeList) { 
			  
			  System.out.println(i); 
		}
		 
	}

	public void palindromePrime() {

		prime();
		for (int i = 0; i < primeList.size(); i++) {

			int number = primeList.get(i);
			int compare = number;
			int remainder = 0;
			int temp = 0;
			while (number > 0) {
				remainder = number % 10;
				number = number / 10;
				temp = temp * 10 + remainder;
			}
			if (compare == temp) {
				primepalindromelist.add(primeList.get(i));
			} else {
				continue;
			}
		}
		System.out.println("Palindrome Prime Numbers are\n:");
		for (Integer integer : primepalindromelist) {
			System.out.println(integer);
		}
	}
	
	public void primeAnagram() {
		palindromePrime();
		for (int i = 0; i < primepalindromelist.size() ; i++ ) {
			String number1 = Integer.toString(primepalindromelist.get(i)) ;
			
			for(int j = i+1; j < primepalindromelist.size(); j++ ) {
				String number2 = Integer.toString(primepalindromelist.get(j));
				
				char numString1[]  = number1.toCharArray();
				char numString2[] = number2.toCharArray();
				
				Arrays.sort(numString1);
				Arrays.sort(numString2);
				
				if(Arrays.equals(numString1, numString2)) {
					System.out.println(primepalindromelist.get(j)+" is an anagram of "+ primepalindromelist.get(i));
				}else {
					System.out.println(primepalindromelist.get(j)+" is NOT an anagram of "+ primepalindromelist.get(i));
				}
			}
		}
	}
}
