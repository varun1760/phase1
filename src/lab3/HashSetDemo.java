package lab3;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String args[]) {
		HashSet<Integer> hSet = new HashSet<>();

		hSet.add(55);
		hSet.add(55); // won't add duplicate
		hSet.add(40);
		hSet.add(55); // won't add duplicate
		hSet.add(40); // won't add duplicate
		hSet.add(80);

		int size = hSet.size();
		System.out.println("Size of TreeSet: " + size);
		
		Iterator<Integer> item = hSet.iterator();
		while(item.hasNext()) {
			System.out.println(item.next());
		}

		// print shorted element in decreasing order
		System.out.println("TreeSet Elements Are: " + hSet);
	}
}
