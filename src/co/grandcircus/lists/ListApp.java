package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		testArrayList();
		testLinkedList();
	}
	
	private static void testArrayList() {
		MyArrayList list = new MyArrayList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.insertAt(1, "Z");
		list.addAtBeginning("Z");
		list.removeAll("Z");
		
	//	list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.printReverse();
	}
	
	private static void testLinkedList() {
		MyLinkedList list = new MyLinkedList();
		Node node = new Node("X");
		Node newNode = new Node("D");
		list.addAtBeginning("D");
		list.addAtEnd("D");
		list.addAtBeginning("A");
		list.addAtEnd("D");
		list.addAtEnd("C");
		list.addAtEnd("A");
//		list.removeFromBeginning();
		list.insertAt(2, node);
		list.removeAll(newNode);
//		list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.printReverse();
	}

}
