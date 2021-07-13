package lab6.filehandling.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// advantage of nio => all are static method
// and we can use them directly.
public class NioWriteDemo {

	public static void main(String[] args) {
		String string = "There are many variations of passages"
				+ " of Lorem Ipsum available, but the majority"
				+ " have suffered alteration in some form, by"
				+ " injected humour, or randomised words which "
				+ "don't look even slightly believable.";
		
		Path path = Paths.get("C:\\Users\\varun\\"
				+ "eclipse-workspace-for-java\\Phase1\\"
				+ "src\\lab6\\filehandling\\app\\file3.txt");
		
		byte []bytes = string.getBytes();
		try {
			Files.write(path, bytes);// no need to close anything
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully written");
	}

}
