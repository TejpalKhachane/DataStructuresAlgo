package my.ds.linkedList;

import java.util.NoSuchElementException;

public class MyLinkedList {
	private class Node {
		private int value;
		private Node next;

		public Node(int val) {
			this.value = val;
		}
	}

	private Node first;
	private Node last;

	public void addFirst(int newItem) {
		var node = new Node(newItem);
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			node.next = first;
			first = node;
		}
	}

	public void addLast(int newItem) {
		var node = new Node(newItem);
		if (isEmpty()) {
			first = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}

		return -1;
	}

	public int contains(int item) {
		Node current = first;
		while (current != null) {
			if (current.value == item) {
				return 1;
			}
			current = current.next;
		}
		return 0;
	}

	public void removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Cant remove an item from an empty LinkedList!");
		}

		if (first == last) {
			first = null;
			last = null;
			return;
		}

		Node second = first.next;
		first.next = null;
		first = second;
	}

	public void removeLast() {
		if (isEmpty()) {
			throw new NoSuchElementException("Cant remove an item from an empty LinkedList!");
		}

		if (first == last) {
			first = null;
			last = null;
			return;
		}

		Node previous = getPrevious(last);
		last = previous;
		last.next = null;
	}

	private Node getPrevious(Node node) {
		var current = first;
		while (current != null) {
			if (current.next == node) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	private boolean isEmpty() {
		return first == null ? true : false;
	}

	public String toString() {
		String items = "";
		Node current = first;
		while (current != null) {
			items += current.value;
			current = current.next;
			if (current != null) {
				items += ", ";
			}
		}

		return "[" + items + "]";
	}
}
