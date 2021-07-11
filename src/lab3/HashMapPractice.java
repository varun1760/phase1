package lab3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Character, Integer> hMap = new HashMap<>();
		hMap.put('a', 12);
		hMap.put('A', 22);
		hMap.put('b', 32);
		hMap.put('c', 42);
		hMap.put('d', 52);
		hMap.put('D', 62);
		hMap.put('d', 72);
		hMap.put('e', 82);
		hMap.put('f', 92);
		
		System.out.println("***Using Iterator***");
		Set<Character> key = hMap.keySet();
		Iterator<Character> index = key.iterator();
		while (index.hasNext()) {
			Character serial = index.next();
			Integer value = hMap.get(serial);
			System.out.println(serial + " => " + value);
		}
		System.out.println();
		
		System.out.println("***Using enhanced for loop***");
		for (Map.Entry entry  : hMap.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
