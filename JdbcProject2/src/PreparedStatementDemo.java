import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		// Step 1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

		Connection conn = null;
		String connectionUrl = "jdbc:mysql://localhost:3306/demodb"; // protocol://ipaddress:port/databasename
		String username = "root";
		String password = "root";		
		try {
			// Step 2
			conn = DriverManager.getConnection(connectionUrl, username, password);
			System.out.println("Connection established...");

			// Step 3 : Create a PreparedStatement and execute it
			
			String query = "INSERT INTO person_details VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(query); // here it hits the DB and compiles the query once
			// use a for loop to insert multiple records
			// and use scanner to get the values for the insert query
			pstmt.setInt(1, 112);
			pstmt.setString(2, "Rupert");
			pstmt.setString(3, "Grint");
			pstmt.setString(4, "2000-10-10");
			pstmt.setInt(5, 1564564566);
			pstmt.setString(6, "LA");
			int rowAffected = pstmt.executeUpdate(); // here it hits the DB and executes the query
			System.out.println(rowAffected + " rows affected.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// Step 4
	}

}
