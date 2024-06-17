package com.bms.service;

import java.util.Set;

import com.bms.dao.BookDao;
import com.bms.dao.BookDaoJdbcImpl;
import com.bms.model.BookPojo;

public class BookServiceImpl implements BookService{
	
	BookDao bookDao;
	
	public BookServiceImpl() {
		//bookDao = new BookDaoCollectionImpl();
		bookDao = new BookDaoJdbcImpl();
	}

	@Override
	public Set<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}
	
	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

	@Override
	public Set<BookPojo> fetchByGenre(String bookGenre) {
		return bookDao.fetchByGenre(bookGenre);
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		return bookDao.updateBook(editBook);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

}
