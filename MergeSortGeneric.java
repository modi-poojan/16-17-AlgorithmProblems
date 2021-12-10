package com.Algorithms;

import java.util.Arrays;

public class MergeSortGeneric<T extends Comparable<T>>{

	public <T extends Comparable<T>> void mergeSort(T array[], int left, int right) {
		if (left < right) {

			int mid = (right + left) / 2;

			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			merge(array, left, mid, right);
		}
	}

	public <T extends Comparable<T>> void merge (T array[], int low, int mid, int high) {

		Integer leftRange = mid - low + 1;
		Integer rightRange = high - mid;

		Integer leftArray[] = new Integer[leftRange];
		Integer righArray[] = new Integer[rightRange];

		for (Integer i = 0; i < leftRange; i++)
			leftArray[i] = (Integer)array[low + i];
		for (Integer j = 0; j < rightRange; j++)
			righArray[j] = (Integer)array[mid + 1 + j];

		Integer i, j, k;
		i = 0;
		j = 0;
		k = low;

		while (i < leftRange && j < rightRange) {
			if ((leftArray[i].compareTo(righArray[j])) < 0) {
				array[k] = (T)leftArray[i];
				i++;
			} else {
				array[k] = (T)righArray[j];
				j++;
			}
			k++;
		}

		while (i < leftRange) {
			array[k] = (T)leftArray[i];
			i++;
			k++;
		}

		while (j < rightRange) {
			array[k] = (T)righArray[j];
			j++;
			k++;
		}
		System.out.println("Sorted Array = " + Arrays.toString(array));
	}

}
