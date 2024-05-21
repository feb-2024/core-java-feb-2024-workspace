package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		// in this demo we will read from a file and write the contents on the console
		FileReader fr = null; 
		try {
			System.out.println("Reading from the file...");
			fr = new FileReader("Test.txt");
			char[] myCharArray = new char[100];
			fr.read(myCharArray);
			
			// write it to the console
			System.out.println(new String(myCharArray).trim());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
