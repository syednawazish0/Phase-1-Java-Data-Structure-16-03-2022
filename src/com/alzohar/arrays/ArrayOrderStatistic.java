package com.alzohar.arrays;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {

		int[] items = { -15, 20, 3, 50, 26, 24, 78, 90 };

		int position = 3;

		int response1 = findKthSmallest(items, position);
		System.out.println(" The position '" + position + "' smalllest element is " + response1);

		int response2 = findKthLargert(items, position);
		System.out.println(" The position '" + position + "' largest element is " + response2);

	}

	private static int findKthSmallest(int[] items, int position) {
		// sort array in ascending order
		Arrays.sort(items);
		// return kth
		return items[position - 1];
	}

	private static int findKthLargert(int[] items, int position) {
		// sort array in ascending order
		Arrays.sort(items);
		// return kth
		return items[items.length - position];
	}

}
