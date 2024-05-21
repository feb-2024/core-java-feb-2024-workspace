package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {

	public static void main(String[] args) {
		// in this demo we will get a sentence as input from the user and write it to the file
		// getting input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence : ");
		String input = scan.nextLine();
		
		// now let us write it to a file
		FileWriter fw = null;
		try {
			fw = new FileWriter("Test.txt");
			fw.write(input);
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Writtern to the file...");
	}

}
