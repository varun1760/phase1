package lab6.filehandling.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import lab6.filehandling.classes.Person;

public class ReadPerson {

	public static void main(String[] args) {
		Person p1;
		try {
			FileInputStream fStream =
					new FileInputStream("Person1.dat");
			ObjectInputStream oStream = 
					new ObjectInputStream(fStream);
			p1 = (Person)oStream.readObject();
			System.out.println("Data Obtained from file: " + p1);
			oStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
