package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
		testArrayList();
		testLinkedList();
	}
	
	private static void testArrayList() {
		MyArrayList list = new MyArrayList();
		Node node = new Node("Z");
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.insertAt(1, node);
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
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
//		list.removeFromBeginning();
		list.insertAt(2, node);
//		list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.printReverse();
	}

}