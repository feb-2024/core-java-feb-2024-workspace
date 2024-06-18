package com.bms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_ALL_BOOKS);
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
		BookPojo fetchedBook = null;
		Connection conn = DBUtil.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_A_BOOK + bookId);
			if(rs.next()) {
				fetchedBook = new BookPojo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fetchedBook;
	}

	@Override
	public Set<BookPojo> fetchByGenre(String bookGenre) {
		Set<BookPojo> returnBooks = new HashSet<>();
		Connection conn = DBUtil.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.FETCH_BOOKS_BY_GENRE + "'" + bookGenre + "'");
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
	public BookPojo addBook(BookPojo newBook) {
		Connection conn = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBQueries.ADD_BOOK);
			pstmt.setString(1, newBook.getBookTitle());
			pstmt.setString(2,  newBook.getBookAuthor());
			pstmt.setString(3,  newBook.getBookGenre());
			pstmt.setInt(4,  newBook.getBookPrice());
			pstmt.setString(5,  newBook.getBookImageUrl());
			int rowsAffected = pstmt.executeUpdate();
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(DBQueries.GET_LAST_VALUE);
			if(rs.next()) {
				newBook.setBookId(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		Connection conn = DBUtil.makeConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement(DBQueries.UPDATE_BOOK);
			pstmt.setInt(1, editBook.getBookPrice());
			pstmt.setInt(2, editBook.getBookId());
			int rowsAffected = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return editBook;
	}

	@Override
	public void deleteBook(int bookId) {
		Connection conn = DBUtil.makeConnection();
		try {
			Statement stmt = conn.createStatement();
			int rowsAffected = stmt.executeUpdate(DBQueries.DELETE_BOOK + bookId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
