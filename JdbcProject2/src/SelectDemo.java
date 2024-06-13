import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		// Step 1: Load the driver
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
			String selectQuery = "SELECT * FROM person_details";
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()) {
				int pId = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				Date dob = rs.getDate(4);
				Long mobile = rs.getLong(5);
				String city = rs.getString(6);
				System.out.println("ID : " + pId);
				System.out.println("First Name : " + firstName);
				System.out.println("Last Name : " + lastName);
				System.out.println("DOB : " + dob);
				System.out.println("Mobile : " + mobile);
				System.out.println("City : " + city);
				System.out.println("==============================");
			}
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

		// Step 4: handle the exceptions
		
		
	}

}
