package com.ls.main;

public class Node {
	public Node(Node next, Object o) {
		super();
		this.next = next;
		this.o = o;
	}
	private Node next;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Object getO() {
		return o;
	}
	public void setO(Object o) {
		this.o = o;
	}
	private Object o;

}
