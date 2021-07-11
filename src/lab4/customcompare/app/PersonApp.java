package lab4.customcompare.app;

import java.util.Iterator;
import java.util.TreeSet;

import lab4.customcompare.comparable.Person;

public class PersonApp {

	public static void main(String[] args) {
		TreeSet<Person> set = new TreeSet<>();
		
		Person p1 = new Person(1, "Shalu",
				"shaluvarun@gmail.com");
		Person p2 = new Person(2, "Varun",
				"varunshalu@gmail.com");
		Person p3 = new Person(1, "Singh",
				"shalusingh@gmail.com");	// same id
		
		set.add(p1);
		set.add(p2);
		set.add(p3);	// check compareTo method in Person
						// class to compare id and won't add  
						// because of same id
		
//		System.out.println(set);
		Iterator<Person> index = set.iterator();
		while (index.hasNext()) {
			System.out.println(index.next());
		}
	}

}
