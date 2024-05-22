package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerializationDemo {

	public static void main(String[] args) {
		Account account = new Account(123456, "Savings", 8888);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			 fos = new FileOutputStream("serialization-demo.txt");
			 oos = new ObjectOutputStream(fos);
			 oos.writeObject(account);
			 oos.flush();
			 System.out.println("Object writtern to the file serialization-demo.txt...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
