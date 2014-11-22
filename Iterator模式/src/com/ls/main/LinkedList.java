package com.ls.main;

public class LinkedList implements Collection {
	private Node head = null;
	private Node tail = null;
	private int size;

	public void add(Object o) {
		Node n = new Node(null, o);
		if (head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);
		tail = n;
		size++;

	}

	public int size() {
		return size;
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Iterator() {
			private Node n = head;

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				Object o = n.getO();
				n = n.getNext();
				return o;
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				if (n != null) {
					return true;
				}
				return false;
			}

		};
	}
}
