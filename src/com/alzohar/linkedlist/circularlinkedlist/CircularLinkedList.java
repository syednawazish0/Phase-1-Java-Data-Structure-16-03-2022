package com.alzohar.linkedlist.circularlinkedlist;

public class CircularLinkedList {

	private Node head;
	private int size;
	private Node tail;

	// get size
	public int getSize() {
		return size;
	}

	// is empty
	public boolean isEmpty() {
		return head == null;
	}

	// add to front
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list is empty
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		// set tail as new code
		tail = node;

		// for circular reference
		tail.setNext(head);
		size++;
	}

	// remove from front
	public Node remove() {
		// verify linked list empty
		if (isEmpty()) {
			return null;
		}
		// remove node
		Node removeNode = head;
		// set next node value as head
		head = head.getNext();
		size--;

		// nullify the remove node
		removeNode.setNext(null);

		// change tail
		tail.setNext(head);
		return removeNode;

	}

	// print list
	public void printList() {

		Node current = head;
		if (current == null) {
			System.out.println("Circular Linked is empty !");
		} else {
			System.out.println(" Head -> ");
			do {
				if (current != null) {
					System.out.println(current);
					System.out.print(" -> ");
					current = current.getNext();
				}
			} while (current != head);
			System.out.println("null");
		}
	}
}
