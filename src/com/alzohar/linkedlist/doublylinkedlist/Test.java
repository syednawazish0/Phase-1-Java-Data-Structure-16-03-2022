package com.alzohar.linkedlist.doublylinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create instance of doubly linked list
		DoublyLinkedList dlist = new DoublyLinkedList();

		System.out.println("List Size : " + dlist.getSize());
		System.out.println("List Empty : " + dlist.isEmpty());

		System.out.println("----------------");
		dlist.addToFront(employee1);
		dlist.addToFront(employee2);
		dlist.addToFront(employee3);

		System.out.println("List Size : " + dlist.getSize());
		System.out.println("List Empty : " + dlist.isEmpty());
		dlist.printList();
		System.out.println("----------------");

		dlist.addToEnd(employee4);
		dlist.addToEnd(employee5);
		System.out.println("----------------");

		System.out.println("List Size : " + dlist.getSize());
		System.out.println("List Empty : " + dlist.isEmpty());
		dlist.printList();

		System.out.println("----------------");
		Node reNode = dlist.removeFromFront();
		System.out.println("Removed First Node :" + reNode);
		dlist.printList();

		System.out.println("----------------");
		Node laNode = dlist.removeFromEnd();
		System.out.println("Removed Last Node :" + laNode);
		System.out.println("----------------");
		dlist.printList();

	}
}
