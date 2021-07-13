package lab6.filehandling.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\varun\\"
				+ "eclipse-workspace-for-java\\Phase1\\"
				+ "src\\lab6\\filehandling\\app\\file2.txt");
		
		System.out.println("name: " + file.getName());
		System.out.println("Parent: " + file.getParent());
		
		String string = "There are many variations of passages"
				+ " of Lorem Ipsum available, but the majority"
				+ " have suffered alteration in some form, by"
				+ " injected humour, or randomised words which "
				+ "don't look even slightly believable.";
		
		try {
			FileOutputStream fOutStream = new FileOutputStream(file);
			byte []b = string.getBytes();
			fOutStream.write(b);
			fOutStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("Written successfully");
	}
}
