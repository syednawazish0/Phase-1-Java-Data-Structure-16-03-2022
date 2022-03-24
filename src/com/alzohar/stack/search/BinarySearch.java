package com.alzohar.stack.search;

public class BinarySearch {

	public static void main(String[] args) {

		int inputs[] = { -22, -15, -3, -1, 7, 9, 20, 35, 55 };

		int x = -15;

		int searchIndex = binarySearch(inputs, x);

		if (searchIndex >= 0) {
			System.out.println("The search element : " + x);
			System.out.println("It is found at index : " + searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}

	}

	// iterate binary search
	// This methods runs in : Logarithmic time complexity. O(log n).
	private static int binarySearch(int[] inputs, int value) {

		// find midpoint
		int start = 0;
		int end = inputs.length - 1;

		while (start <= end) {
			// midpoint
			int midpoint = (start + end) / 2;

			// midpoint is equal to required search
			if (inputs[midpoint] == value) {
				return midpoint;
			}
			// search data into right half
			else if (inputs[midpoint] < value) {
				start = midpoint + 1;
			}
			// search in lowe half / left value
			else {
				end = midpoint - 1;
			}
		}
		return -1;
	}

}
