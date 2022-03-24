package com.alzohar.stack.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before sort : " + Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After sort : " + Arrays.toString(inputs));

	}

	// This method has time complexity O(n^2)
	private static void insertionSort(int[] inputs) {
		// Iterate from start
		for (int index = 1; index < inputs.length; index++) {
			int element = inputs[index];
			// System.out.println("element "+ element);
			int inner;
			for (inner = index; inner > 0 && inputs[inner - 1] > element; inner--) {
				inputs[inner] = inputs[inner - 1];
			}
			// insert element
			inputs[inner] = element;
		}

	}
}
