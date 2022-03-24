package com.alzohar.linkedlist.circularlinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create instance of singly linked list
		CircularLinkedList list = new CircularLinkedList();

		System.out.println("List Size : " + list.getSize());
		System.out.println("List Empty : " + list.isEmpty());

		// add data in front
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);

		System.out.println("List Size : " + list.getSize());
		System.out.println("List Empty : " + list.isEmpty());
		list.printList();

		System.out.println("---------------");
		list.remove();
		list.remove();
		list.printList();
	}

}
