package com.bms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	static Connection conn;
	// Step 1 : Load the driver
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Step 2 : Establish connection to DB Server
	public static Connection makeConnection() {
		String connectionUrl = "jdbc:mysql://localhost:3306/bmsdb";
		String username = "root";
		String password = "root";
		try {
			// here we are using singleton design pattern to return the same connection
			if(conn == null) {
				conn = DriverManager.getConnection(connectionUrl, username, password);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// closing the connection
	public void terminateConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
