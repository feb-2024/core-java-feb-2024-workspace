package com.bms.dao;

import java.util.Set;

import com.bms.model.BookPojo;

public interface BookDao {
	Set<BookPojo> fetchAllBooks();
	BookPojo fetchABook(int bookId);
	Set<BookPojo> fetchByGenre(String bookGenre);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int bookId);
}
