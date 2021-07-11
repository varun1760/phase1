package lab2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

public class MyCollection {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<>();
		city.add("Delhi");
		city.add("Ghaziabad");
		city.add("Chandigarh");
		city.add("Delhi");
		System.out.println("values of ArrayList: " + city);
		System.out.println("values of ArrayList: " + city.get(2));
		
		System.out.println("Vector");
		Vector<Integer> vector = new Vector<>();	// here Integer is wrapper class
		vector.add(5);
		vector.add(1);
		vector.add(9);
		vector.add(9);
		System.out.println("values of Vector:" + vector);
		
		System.out.println("HashSet");
		HashSet<String> sets = new HashSet<>();
		sets.add("Delhi");
		sets.add("Ghaziabad");
		sets.add("Chandigarh");
		sets.add("Delhi");		// won't print because there can't be duplicate element in HashSet
		System.out.println("values of set of Cities: " + sets);
	}

}
