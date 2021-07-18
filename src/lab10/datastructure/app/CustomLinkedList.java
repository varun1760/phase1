package lab10.datastructure.app;

class LinkedList {
	private class Node {	// inner class as private to keep
							// code safe
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	Node first;
	Node last;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void addLast(int item) {
		var node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
		
//		Node node = new Node();
		//or
//		var node = new Node();	// var is a variable that can hold
//								// any type of data. java 11.
//		node.value = item;
	}
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if (isEmpty()) {
			first = last = node;
		} else {
			node.next = first;
			first = node;
		}
	}
	
	public int indexOf(int item) {
		int index = 0;
		var current = first;
		while (current != null) {
			if (current.value == item) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	

}

public class CustomLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(100);
		list.addLast(200);
		list.addFirst(50);
		
		System.out.println(list.isEmpty() ? "Empty" : "Not Empty");
		var index = list.indexOf(100);	// var can hold any type of instance
		System.out.println((index != -1) ? index : "Item is not available");
	}
}
