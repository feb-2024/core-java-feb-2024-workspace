
public class InsertDemo {

	public static void main(String[] args) {
		// Step 1 : Load the driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Step 2 : Establish Connection to the DB server
		// Step 3 : Create a statement and execute it
		// Step 4 : handle the exception
		

	}

}
