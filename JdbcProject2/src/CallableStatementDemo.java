import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CallableStatementDemo {

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

			// Step 3 : Create a CallableStatement and execute it
			String query = "{call demodb.add_person(?, ?, ?, ?, ?, ?)}";
			CallableStatement cstmt = conn.prepareCall(query);
			cstmt.setInt(1, 113);
			cstmt.setString(2, "Rupert");
			cstmt.setString(3, "Grint");
			cstmt.setString(4, "2000-10-10");
			cstmt.setInt(5, 1564560000);
			cstmt.setString(6, "LA");
			boolean result = cstmt.execute();
			System.out.println("Stored prcedure called");
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
