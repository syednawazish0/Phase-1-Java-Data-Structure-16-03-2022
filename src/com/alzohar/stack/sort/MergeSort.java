package com.alzohar.stack.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before sort : " + Arrays.toString(inputs));

		int start = 0;
		int end = inputs.length;
		mergeSort(inputs, start, end);

		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	// This method runs in : O(log n);
	private static void mergeSort(int[] inputs, int start, int end) {

		// break logic for recursion
		if (end - start < 2) {
			return;
		}

		// 1. divide array elements
		int mid = (start + end) / 2;

		// 2. call merge sort first
		mergeSort(inputs, start, mid);

		// 3. call merge sort second
		mergeSort(inputs, mid, end);

		// 4. call for data merge
		merge(inputs, start, mid, end);
	}

	private static void merge(int[] inputs, int start, int mid, int end) {
		// break logic for recursion
		if (inputs[mid - 1] < inputs[mid]) {
			return;
		}

		int i = start;
		int j = mid;
		int tmpIndex = 0;
		// create temp array for sorted value.
		int[] temp = new int[end - start];

		// start comparison
		while (i < mid && j < end) {
			temp[tmpIndex++] = (inputs[i] <= inputs[j]) ? inputs[i++] : inputs[j++];
		}

		// copy data from temp array to actual array
		System.arraycopy(inputs, i, inputs, start + tmpIndex, mid - i); // already sorted
		System.arraycopy(temp, 0, inputs, start, tmpIndex);
	}
}
