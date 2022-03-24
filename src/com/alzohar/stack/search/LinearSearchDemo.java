package com.alzohar.stack.search;

public class LinearSearchDemo {

	public static void main(String[] args) {

		int[] inputs = { 20, 50, 35, -15, 7, 1, -55, 22 };

		int x = 35;

		int searchIndex = linearSearch(inputs, x);

		if (searchIndex >= 0) {
			System.out.println("The search element : " + x);
			System.out.println("It is found at index : " + searchIndex);
		} else {
			System.out.println("Element does not exist.");
		}

	}

	// This methods run in O(n) => linear time complexity.
	private static int linearSearch(int[] inputs, int searchValue) {
		// search through an complete array
		for (int index = 0; index < inputs.length; index++) {
			if (inputs[index] == searchValue) {
				return index;
			}
		}
		return -1;
	}

}
