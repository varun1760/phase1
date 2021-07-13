package lab5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class InstanceOfDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Developer");
		list.add("Profile");
		
		for (String string : list) {
			System.out.print(string + " ");
			System.out.println("is an Instance of String class" +
					string instanceof String);
		}
		
		System.out.print("list is of ArrayList class: ");
		System.out.println(list instanceof ArrayList);
		
		System.out.print("list is of Collection class: ");
		System.out.println(list instanceof Collection);
		
		System.out.print("list is of Set class: ");
		System.out.println(list instanceof Set);
	}

}
