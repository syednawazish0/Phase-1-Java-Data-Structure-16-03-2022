package com.alzohar.stack.arraystack;

public class Test {

	public static void main(String[] args) {

		// create employee object
		Employee employee1 = new Employee(1001, "John Smith", "Engineering", 56456.567);
		Employee employee2 = new Employee(1002, "Marry Joe", "HR", 896456.567);
		Employee employee3 = new Employee(1003, "Kim Smith", "HR", 16456.567);
		Employee employee4 = new Employee(1004, "Will Smith", "Engineering", 57856.567);
		Employee employee5 = new Employee(1005, "Aria Stark", "Operations", 99056.567);

		// create array stack
		ArrayStack stack = new ArrayStack(2);

		System.out.println("Stack size :: " + stack.size());
		System.out.println("Stack is empty :: " + stack.isEmpty());

		// push element in stack
		stack.push(employee1);
		stack.push(employee2);

		System.out.println("Stack size " + stack.size());
		System.out.println("Stack is empty :: " + stack.isEmpty());

		System.out.println("---------------");

		stack.push(employee3);
		stack.push(employee4);
		stack.push(employee5);

		System.out.println("-------------");
		System.out.println("Stack top element before : " + stack.peek());
		System.out.println("-------------");

		System.out.println("Removed Element :-> " + stack.pop());

		System.out.println("---------------------");
		System.out.println("Stack top element after : " + stack.peek());
		System.out.println("-----------------");
		stack.printStack();
	}

}
