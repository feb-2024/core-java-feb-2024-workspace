package com.bms.model;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String bookGenre;
	private String bookPrice;
	private String bookImageUrl;
	
	public BookPojo(int bookId, String bookTitle, String bookAuthor, String bookGenre, String bookPrice,
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

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookImageUrl() {
		return bookImageUrl;
	}

	public void setBookImageUrl(String bookImageUrl) {
		this.bookImageUrl = bookImageUrl;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookGenre="
				+ bookGenre + ", bookPrice=" + bookPrice + ", bookImageUrl=" + bookImageUrl + "]";
	}
}
