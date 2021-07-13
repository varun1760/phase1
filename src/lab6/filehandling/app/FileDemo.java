package lab6.filehandling.app;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\varun\\"
				+ "eclipse-workspace-for-java\\Phase1\\"
				+ "src\\lab6\\filehandling\\app\\file1.txt");
		
		System.out.println("name: " + f1.getName());
		System.out.println("Parent: " + f1.getParent());
		try {
			if (f1.createNewFile()) {
				System.out.println(f1.getName() +
						" Created successfully");
			}
			else {
				System.out.println(f1.getName() +
						" can't be created");
			}
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
