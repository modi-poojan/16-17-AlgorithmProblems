package com.Algorithms;

public class MergeSort {
	
		// Divide the array into two sub arrays, sort them and merge them
		void mergeSort(int array[], int left, int right) {
			if (left < right) {

				// mid is the point where the array is divided into two sub arrays
				int mid = (right + left) / 2;

				// recursive call to each sub arrays
				mergeSort(array, left, mid);
				mergeSort(array, mid + 1, right);

				// Merge the sorted sub arrays
				merge(array, left, mid, right);
			}
		}

		// Merge two sub arrays Left and Right into array
		void merge(int array[], int low, int mid, int high) {

			int leftRange = mid - low+1 ;
			int rightRange = high - mid ;

			int leftArray[] = new int[leftRange];
			int righArray[] = new int[rightRange];

			// fill the left and right array
			for (int i = 0; i < leftRange; i++)
				leftArray[i] = array[low + i ];
			for (int j = 0; j < rightRange; j++)
				righArray[j] = array[mid + 1 + j];

		// Maintain current index of sub-arrays and main array
		int i, j, k;
		i = 0;
		j = 0;
		k = low;

		// Until we reach either end of either Left or Right, pick larger among
		// elements L and M and place them in the correct position at A[p..r]
		// for sorting in descending
		// use if(L[i] >= <[j])
		while (i < leftRange && j < rightRange) {
			if (leftArray[i] <= righArray[j]) {
				array[k] = leftArray[i];
				i++;
			} else {
				array[k] = righArray[j];
				j++;
			}
			k++;
		}

		// When we run out of elements in either Left or Right array,
		// pick up the remaining elements and put in array[p..r]
		while (i < leftRange) {
			array[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < rightRange) {
			array[k] = righArray[j];
			j++;
			k++;
		}
	}

}