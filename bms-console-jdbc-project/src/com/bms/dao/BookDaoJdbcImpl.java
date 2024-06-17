package com.bms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.bms.model.BookPojo;

public class BookDaoJdbcImpl implements BookDao{

	@Override
	public Set<BookPojo> fetchAllBooks() {
		Set<BookPojo> returnBooks = new HashSet<>();
		Connection conn = DBUtil.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book_details");
			// traverse the result set
			while(rs.next()) {
				BookPojo bookPojo = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
				returnBooks.add(bookPojo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnBooks;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		Connection conn = DBUtil.makeConnection();
		try {
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Set<BookPojo> fetchByGenre(String bookGenre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

}
