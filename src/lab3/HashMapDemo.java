package lab3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "Java");
		hMap.put(2, "Technology");
		hMap.put(3, "Industry");
		hMap.put(4, "Windows");
		hMap.put(5, "Mouse");
		hMap.put(6, "Football");
		hMap.put(7, "Cellphone");
		hMap.put(8, "Windows");
		hMap.put(3, "windows");		// it will replace value of
									// Industry at 1st key-3 
									// with windows at 2nd key-3
		
		Set<Integer> key = hMap.keySet();
		Iterator<Integer> index = key.iterator();
		while (index.hasNext()) {
			Integer it = index.next();
			String value = hMap.get(it);
			System.out.println(it + " " + value);
		}
		
		System.out.println();
		System.out.println("Enhanced For loop");
		for (Map.Entry entry : hMap.entrySet() ) {	
			// Map.Entry is an Inner Class
			System.out.println(entry);
		}
	}

}
