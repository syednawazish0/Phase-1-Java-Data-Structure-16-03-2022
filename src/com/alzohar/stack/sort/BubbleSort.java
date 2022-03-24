package com.alzohar.stack.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before sort : " + Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	// This method has time complexity O(n^2)
	private static void bubbleSort(int[] inputs) {
		// iterate over unsorted partition
		for (int lastUnsortedIndex = inputs.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
			// comparative loop
			for (int index = 0; index < lastUnsortedIndex; index++) {
				if (inputs[index] > inputs[index + 1]) {
					swap(inputs, index, index + 1);
				}
			}
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
