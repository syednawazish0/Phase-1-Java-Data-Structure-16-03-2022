package com.alzohar.arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80 };

		System.out.println("Before Rotation : ");
		System.out.println(Arrays.toString(items));

		rotateLeft(items, 3);
		System.out.println("After Rotation : ");
		System.out.println(Arrays.toString(items));
	}

	private static void rotateLeft(int[] items, int position) {

		// create a temp array
		int temp[] = new int[position];

		// copy elements into temp[] based on position
		for (int index = 0; index < position; index++) {
			temp[index] = items[index];
		}

		// move / shift actual array elements
		for (int index = position; index < items.length; index++) {
			items[index - position] = items[index];
		}

		// copy the temp element in atual array
		for (int index = 0; index < position; index++) {
			items[index + items.length - position] = temp[index];
		}

	}
}
