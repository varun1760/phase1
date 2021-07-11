package lab3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(55);
		set.add(55); // won't add duplicate
		set.add(40);
		set.add(55); // won't add duplicate
		set.add(40); // won't add duplicate
		set.add(80);
		int size = set.size();
		System.out.println("Size of 1st TreeSet: " + size);
		// print shorted element in increasing order
		System.out.println("1st TreeSet Elements Are: " + set);

		TreeSet<String> tSet = new TreeSet<>();
		tSet.add("Java");
		tSet.add("Abstract");
		tSet.add("Programming");
		tSet.add("Control Statement");
		tSet.add("Hello");
		tSet.add("World");
		tSet.add("Java");
		tSet.add("control Statement");
		tSet.add("December");
		tSet.add("abstract");
		tSet.add("HeLlo");
		tSet.add("07");
		int size2 = tSet.size();
		System.out.println("Size of 2nd TreeSet: " + size2);

		System.out.println("2nd TreeSet elements are:");
		Iterator<String> item = tSet.iterator();
		while (item.hasNext()) {
			System.out.println(item.next());
		}
	}
}
