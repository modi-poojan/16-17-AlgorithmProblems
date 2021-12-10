package com.Algorithms;

import java.util.Scanner;

public class Algorithm_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		FindNumber call = new FindNumber();

		System.out.println("\n Enter the range of number for program\n");
		int range = input.nextInt();

		System.out.println("Think of any number between 0-" + range + "\n");
		call.searchNumber(0, range);
	}
}