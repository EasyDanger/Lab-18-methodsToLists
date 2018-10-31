package co.grandcircus.lists;

public class Node {
	// The value stored by this node
	private String data;
	// Link to the next node.
	private Node next;
	
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public Node(String data) {
		this.data = data;
	}
	
	public Node() {}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		if (next != null) {
			return this.data + " -> ";
		} else {
			return this.data;
		}
	}
	
}
