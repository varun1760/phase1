package lab6.filehandling.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		StringBuffer string = new StringBuffer();
		
		try {
			FileInputStream inStream =
					new FileInputStream("C:\\Users\\varun\\"
					+ "eclipse-workspace-for-java\\Phase1\\"
					+ "src\\lab6\\filehandling\\app\\file2.txt");
			int i = 0;
			while ((i = inStream.read()) != -1) {
				char ch = (char)i;
				string.append(ch);
			}
			System.out.println("File content:");
			System.out.println(string);
			inStream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
