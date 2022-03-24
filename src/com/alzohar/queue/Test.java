package com.alzohar.queue;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create array queue
		ArrayQueue queue = new ArrayQueue(2);

		System.out.println("Queue Size : " + queue.size());
		System.out.println("Queue is Empty : " + queue.isEmpty());

		queue.add(employee3);
		queue.add(employee4);
		queue.add(employee5);

		System.out.println("----------------");
		System.out.println("Front element before :: " + queue.peek());

		System.out.println("Removed Element :-> " + queue.remove());

		System.out.println("-----------------");
		System.out.println("Front Element After :: " + queue.peek());
		System.out.println("----------------");

		queue.printQueue();

	}

}
