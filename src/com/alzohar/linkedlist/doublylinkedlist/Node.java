package com.alzohar.linkedlist.doublylinkedlist;

public class Node {

	private Employee data;
	private Node next;
	private Node previous;

//create node

	public Node(Employee data) {
		this.data = data;
	}

//getter and setter methods
	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
