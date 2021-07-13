package lab6.filehandling.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NioReadDemo {

	public static void main(String[] args) {
		List<String> lines = new ArrayList<>();
		 try {
			lines = Files.readAllLines(
					Paths.get("C:\\Users\\varun\\"
					+ "eclipse-workspace-for-java\\Phase1\\"
					+ "src\\lab6\\filehandling\\app\\file2.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 for (String string : lines) {
			 System.out.println(string);
		 }
	}
}