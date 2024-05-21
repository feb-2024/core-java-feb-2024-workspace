package com.bms.model;

import java.util.Objects;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookGenre;
	private int bookPrice;
	private String bookImageUrl;
	
	public BookPojo(int bookId, String bookTitle, String bookAuthor, String bookGenre, int bookPrice,
			String bookImageUrl) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.bookPrice = bookPrice;
		this.bookImageUrl = bookImageUrl;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPojo other = (BookPojo) obj;
		return bookId == other.bookId;
	}

	@Override
	public String toString() {
		return "[bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookGenre="
				+ bookGenre + ", bookPrice=" + bookPrice + ", bookImageUrl=" + bookImageUrl + "]";
	}
	
}
