package lab3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();		
		list.add( 3 );		// autoBoxing
		list.add( 12 );
		list.add( 37 );
		list.add( 1 );
		System.out.println(list);
		
		System.out.println(list.get(1));
		
		int size = list.size();
		System.out.println("size: " + size);
		System.out.println();
		
		System.out.println("Positional access: Allowed only in List");
		for(int c=0; c<size; c++) {
			System.out.println(c + " " + list.get(c));
		}
		
		System.out.println();
		System.out.println("iterator access: Allowed in all collection");
		Iterator<Integer> item = list.iterator();
		while(item.hasNext()) {
			System.out.println(item.next());
		}
		System.out.println();
		System.out.println("Enhanced For Loop");
		for( int element : list) {
			System.out.println(element);
		}
	}

}
