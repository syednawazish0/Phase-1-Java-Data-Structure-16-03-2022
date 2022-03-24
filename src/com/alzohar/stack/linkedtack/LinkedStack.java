package com.alzohar.stack.linkedtack;

import java.util.LinkedList;

//stack implementation based on linked list
public class LinkedStack {

	private LinkedList<Employee> stack;

	// create stack
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}

	// push
	public void push(Employee data) {
		stack.push(data);
	}

	// pop
	public Employee pop() {
		return stack.pop();
	}

	// peek
	public Employee peek() {
		return stack.peek();
	}

	// size
	public int size() {
		return stack.size();
	}

	// is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	// print stack
	public void printStack() {
		System.out.println(" top -> ");
		for (Employee emp : stack) {
			System.out.println(emp);
		}
	}
}
