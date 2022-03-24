package com.alzohar.stack.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before sort : " + Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("After sort : " + Arrays.toString(inputs));
	}

	// This method has time complexity O(n^2)
	private static void selectionSort(int[] inputs) {
		// iterate over unsorted partition
		for (int lastUnsortedIndex = inputs.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
			int largest = 0;

			// comparative for loop for finding largest
			for (int index = 1; index <= lastUnsortedIndex; index++) {
				if (inputs[index] > inputs[largest]) {
					largest = index;
				}
			}
			// System.out.println("largest : "+largest);
			// System.out.println("lastUnsortedIndex : "+lastUnsortedIndex);
			swap(inputs, largest, lastUnsortedIndex);
		}

	}

	private static void swap(int[] inputs, int a, int b) {
		if (a == b) {
			return;
		}
		int temp = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = temp;
	}

}
