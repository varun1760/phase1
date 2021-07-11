package lab3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();		
		list.add( 3 );		// autoBoxing
		list.add( 12 );
		list.add( 37 );
		list.add( 1 );
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		int size = list.size();
		System.out.println(size);
		
		System.out.println("Positional access: Allowed only in List");
		for(int c=0; c<size; c++) {
			System.out.println(c + " " + list.get(c));
		}
		
		list.addFirst(30);
		list.addLast(40);
		list.add(3, 70);
		System.out.println();
		System.out.println("iterator access: Allowed in all collection");
		Iterator<Integer> item = list.iterator();
		while(item.hasNext()) {
			System.out.println(item.next());
		}

	}

}
