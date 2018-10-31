package co.grandcircus.lists;

public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;

	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head
		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head
		head = head.getNext();
		length--;
	}

	@Override
	public void addAtEnd(String data) {
		Node newNode = new Node(data);
		Node tailNode = getNodeAt(length - 1);
		tailNode.setNext(newNode);
		length++;
	}

	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			// find the node right before the end.
			Node beforeTail = getNodeAt(length - 2);
			// set its next to null. This ends the list here.
			beforeTail.setNext(null);
			length--;
		}
	}

	@Override
	public String get(int index) {
		return getNodeAt(index).getData();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node = head;
		// follow the links between nodes until it reaches the end
		while (node != null) {
			sb.append(node.toString());
			node = node.getNext();
		}
		return sb.toString();
	}

	@Override
	public int size() {
		return length;
	}

	private Node getNodeAt(int index) {
		// start at the head
		Node node = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node == null) {
				// In case we run out of nodes before we get up to the desired index, return
				// null
				return null;
			}
			node = node.getNext();
		}
		return node;
	}

	public boolean removeAt(int index) {
		boolean isTrue = false;
		if (index > 0 && index < length) {
			getNodeAt(index - 1).setNext(getNodeAt(index + 1));
			isTrue = true;
		} else if (index == 0) {
			removeFromBeginning();
			isTrue = true;
		} else {
			return isTrue;
		}
		length--;
		return isTrue;
	}

	public boolean insertAt(int index, Object o) {
		boolean isTrue = false;
		Node newNode = (Node) o;
		if (index > 0 && index <= length) {
			newNode.setNext(getNodeAt(index));
			getNodeAt(index - 1).setNext(newNode);
			isTrue = true;
			length++;
		} else if (index == 0) {
			addAtBeginning(newNode.getData());
			isTrue = true;
		} else {
		}
		return isTrue;
	}

	public void printReverse() {
		for (int i = length; i > 0; i--) {
			System.out.println(getNodeAt(i-1));
		}
	}
	public void removeAll(Object o) {
		Node node = (Node) o;
		for (int i = 0; i < length; i++) {
			if (getNodeAt(i).getData().equals(node.getData())) {
				removeAt(i);
			i--;
			}
		}
	}
}
