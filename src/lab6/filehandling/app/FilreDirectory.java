package lab6.filehandling.app;

import java.io.File;

public class FilreDirectory {

	public static void main(String[] args) {
		File dir = new File("C:\\Users\\varun\\"
					+ "eclipse-workspace-for-java\\Phase1\\"
					+ "src\\lab6\\filehandling\\app\\sample");
		if(dir.mkdir()) {
			System.out.println("Directory created successfully");
		}
		else {
			System.out.println("failed to create Directory");
		}
	}

}
