package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File myFile = new File("Sample.txt");
		System.out.println("Name : " + myFile.getName());
		System.out.println("Sample.txt exists? " + myFile.exists());
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sample.txt exists? " + myFile.exists());
		System.out.println("can execute ? " + myFile.canExecute());
		System.out.println("can read ? " + myFile.canRead());
		System.out.println("can write ? " + myFile.canWrite());
		System.out.println("absolute path : " + myFile.getAbsolutePath());
		try {
			System.out.println("canonical path : " + myFile.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("----------------------------------------------------");
		File myFolder = new File("D:\\Poongs\\eclipse-workspace\\core-java-feb-2024-workspace\\CoreJavaProject");
		System.out.println("Name : " + myFolder.getName());
		System.out.println("is directory ? " + myFolder.isDirectory());
		System.out.println("is file ? " + myFolder.isFile());
		System.out.println("parent ? " + myFolder.getParent());
		System.out.println("total space ? " + myFolder.getTotalSpace());
	}

}
