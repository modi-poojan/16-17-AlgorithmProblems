package com.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchGenerics<T extends Comparable<T>> {

	public static <T extends Comparable<T>> Integer binarySearch(T[] array, int first, int last, T input) {

		int mid = (first + last) / 2;

		if (((T) input).compareTo((T) (array[mid])) == 0) {
			return mid;
		} else if (((T) input).compareTo((T) (array[mid])) > 0) {
			first = mid + 1;
			return binarySearch(array, first, last, input);
		} else if (((T) input).compareTo((T) (array[mid])) < 0) {
			last = mid - 1;
			return binarySearch(array, first, last, input);
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {

		System.out.println("BINARY SEARCH \n");

		String[] array = { "Asia", "Africa", "North America", "South America", "Antarctica", "Europe", "Australia" };

		Arrays.sort(array);

		System.out.println("Sorted Array :-  " + Arrays.toString(array));

		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter a word to search\n");
		String input = scan.nextLine();

		int first = 0;
		int last = array.length - 1;

		int result = binarySearch(array, first, last, input);

		if (result == -1) {
			System.out.println("\n" + input + " is not present.");
		} else {
			System.out.println("\n" + input + " is present at index " + result + ".");
		}
	}


}
