package com.bms.dao;

import java.util.HashSet;
import java.util.Set;

import com.bms.model.BookPojo;

public class BookDaoCollectionImpl implements BookDao{

	Set<BookPojo> bookDataStore;
	
	public BookDaoCollectionImpl() {
		bookDataStore  = new HashSet<>();
		BookPojo book1 = new BookPojo(101, "Harry Potter and the Order of Phoenix", "J.K.Rowling", "Fiction", 300, "");
		BookPojo book2 = new BookPojo(102, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", "Fiction", 350, "");
		BookPojo book3 = new BookPojo(103, "Harry Potter and the Half Blood Prince", "J.K.Rowling", "Fiction", 250, "");
		bookDataStore.add(book1);
		bookDataStore.add(book2);
		bookDataStore.add(book3);
	}
	
	@Override
	public Set<BookPojo> fetchAllBooks() {
		return bookDataStore;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookPojo returnBookPojo = null;
		for(BookPojo eachBook: bookDataStore) {
			if(eachBook.getBookId() == bookId) {
				returnBookPojo = eachBook;
				break;
			}
		}
		return returnBookPojo;
	}

	@Override
	public Set<BookPojo> fetchByGenre(String bookGenre) {
		Set<BookPojo> allBooksByGenre = new HashSet<>();
		for(BookPojo eachBook: bookDataStore) {
			if(eachBook.getBookGenre().equals(bookGenre)) {
				allBooksByGenre.add(eachBook);
			}
		}
		return allBooksByGenre;
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
		bookDataStore.removeIf((eachBook) -> eachBook.getBookId() == bookId);
	}

}
