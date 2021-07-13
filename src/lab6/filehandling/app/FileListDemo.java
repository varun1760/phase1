package lab6.filehandling.app;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\varun\\"
				+ "eclipse-workspace-for-java\\Phase1\\"
				+ "src\\lab6\\filehandling\\app");
		File []files = dir.listFiles();
		
		for (File file : files) {
			System.out.println(file.getName() + " is a ");
			if (file.isFile()) {
				System.out.println("File");
			} else {
				System.out.println("Directory");
			}
		}
	}

}
