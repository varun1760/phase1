package lab6.filehandling.app;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lab6.filehandling.classes.Person;

public class WritePerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId(101);
		p1.setName("Shalu");
		p1.setEmail("shaluvarun@gmail.com");
		
		try {
			FileOutputStream fStream =
					new FileOutputStream("person1.dat");
			ObjectOutputStream oStream =
					new ObjectOutputStream(fStream);
			oStream.writeObject(p1);
			oStream.close();
			System.out.println("Person Object saved in a file "
					+ "successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
