package com.alzohar.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<Integer>();

		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);

		for (int index = 0; index < numberList.size(); index++) {
			System.out.println("Element at index :" + index + " " + numberList.get(index));
		}

	}

}
