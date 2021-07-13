package lab6.filehandling.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		File f1 = new File("C:\\Users\\varun\\"
				+ "eclipse-workspace-for-java\\Phase1\\"
				+ "src\\lab6\\filehandling\\app\\file1.txt");
		System.out.println("Name: " + f1.getName());
		System.out.println("Parent: " + f1.getParent());
		String string = "The standard chunk of Lorem Ipsum"
				+ " used since the 1500s is reproduced below"
				+ " for those interested. Sections 1.10.32"
				+ " and 1.10.33 from \"de Finibus Bonorum"
				+ " et Malorum\" by Cicero are also reproduced"
				+ " in their exact original form, accompanied"
				+ " by English versions from the 1914 translation"
				+ " by H. Rackham.";
		
		try {
			FileWriter writer = new FileWriter(f1);
			writer.write(string);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Content saved successfully");
	}

}
