package lab6.filehandling.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer();
		
		try {
			FileReader reader = new FileReader("C:\\Users\\varun\\"
					+ "eclipse-workspace-for-java\\Phase1\\"
					+ "src\\lab6\\filehandling\\app\\file1.txt");
			int i = 0;
			do {
				i = reader.read();	// bcz return type of read()
									// method is integer
				if (i != -1) {
					char ch = (char)i;
					string.append(ch);
				}
			} while (i != -1);
			System.out.println("File content:");
			System.out.println(string.toString());
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
