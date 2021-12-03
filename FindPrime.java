package com.Algorithms;

public class FindPrime {

	public void findPrime() {
		for(int num = 2; num <= 1000; num++ ) {
			if(validate_prime(num))
				System.out.println(num+" "+validate_prime(num));
		}
	}

	public boolean validate_prime(int number) {
		
		for(int i = 2; i < number/2; i++) {
			if(number % i == 0 ) 
				return false;
			}
			
				return true;
		}
}




