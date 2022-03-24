package com.alzohar.stack.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {

		int inputs[] = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		int x = -15;

		int searchIndex = exponentialSearch(inputs, x);

		if (searchIndex >= 0) {
			System.out.println("The search element : " + x);
			System.out.println("It is found at index : " + searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}

	}

	// This methods run in best time complexity as O(1)
	// worst time complexity is O(long2 n)
	private static int exponentialSearch(int[] inputs, int value) {

		// consider first element is search value
		if (inputs[0] == value) {
			return 0;
		}

		// step 1: find range : doubling method
		int i = 1;
		while (i < inputs.length && inputs[i] <= value) {
			i = i * 2;
		}

		// step 2: apply binary search
		return Arrays.binarySearch(inputs, i / 2, Math.min(i, inputs.length), value);
	}

}
