package lab10.datastructure.app;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(200);
		list.addFirst(250);
		list.addLast(800);
		System.out.println(list);
	}

}
