import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {
		// Step 1 : Load the driver // not required in newer versions of java
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Connection conn = null;
		Statement stmt = null;
		String connectionUrl = "jdbc:mysql://localhost:3306/demodb"; // protocol://ipaddress:port/databasename
		String username = "root";
		String password = "root";
		try {
			// Step 2 : Establish Connection to the DB server
			conn = DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("Connection established...");
			
			// Step 3 : Create a statement and execute it
			stmt = conn.createStatement();
			// use a for loop to insert multiple records
			// and use scanner to get the values for the insert query
			String insertQuery = "INSERT INTO person_details(person_id, person_firstname, person_lastname, person_dob, person_mobile_no, person_city) \r\n"
					+ "	VALUES (110, 'Sandra', 'Bullock', '1980-04-04', 1565664564, 'Chicago')";
			int rowsAffected = stmt.executeUpdate(insertQuery); // here it hits the DB and compiles and executes the query
			System.out.println(rowsAffected + " rows affected...");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Step 4 : handle the exception
		

	}

}
