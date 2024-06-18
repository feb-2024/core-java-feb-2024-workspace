package com.bms.dao;

public class DBQueries {
	public static final String FETCH_ALL_BOOKS = "select * from book_details";
	public static final String FETCH_A_BOOK = "select * from book_details where book_id=";
	public static final String FETCH_BOOKS_BY_GENRE = "select * from book_details where book_genre=";
	public static final String ADD_BOOK = "INSERT INTO book_details(book_title, book_author, book_genre, book_price, book_image_url) VALUES(?, ?, ?, ?, ?)";
	public static final String GET_LAST_VALUE = "Select last_insert_id()";
	public static final String UPDATE_BOOK = "update book_details set book_price=? where book_id=?";
	public static final String DELETE_BOOK = "delete from book_details where book_id=";
}
