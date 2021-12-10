package com.Algorithms;

import java.util.Scanner;

public class FindNumber {

	Scanner scan = new Scanner(System.in);

	public void searchNumber( int low, int high) {

		int mid = (high + low) / 2;

		System.out.println("If " + mid + " this is your number enter 'Y'\n");
		System.out.println("If your number is smaller than " + mid + " enter 'D' \n");
		System.out.println("If your number is larger than " + mid + " enter 'U' \n");
		char choice = scan.next().charAt(0);

		switch (choice) {
		case 'Y':
			System.out.println("Number Found\n ");
			return;

		case 'D':
			high = mid - 1;
			searchNumber( low, high);

		case 'U':
			low = mid + 1;
			searchNumber( low, high);

		default:
			System.out.println("Enter valid option");
			break;
		}
	}
}
