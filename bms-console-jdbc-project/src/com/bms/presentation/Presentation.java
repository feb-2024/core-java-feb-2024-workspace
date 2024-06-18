package com.bms.presentation;

import java.util.Scanner;
import java.util.Set;

import com.bms.model.BookPojo;
import com.bms.service.BookService;
import com.bms.service.BookServiceImpl;

public class Presentation {
	public static void start() {
		Scanner scan = new Scanner(System.in);
		BookService bookService = new BookServiceImpl();
		
		char ch = '\0';
		do {
			System.out.println("**************************************");
			System.out.println("BOOK MANAGEMENT SYSTEM");
			System.out.println("**************************************");
			System.out.println("1. Get all the books.");
			System.out.println("2. Get a book by ID.");
			System.out.println("3. Get books by Genre.");
			System.out.println("4. Add a new book.");
			System.out.println("5. Update an existing book.");
			System.out.println("6. Remove an existing book.");
			System.out.println("7. Exit.");
			System.out.println("**************************************");
			System.out.println("Enter your option : ");
			int option = scan.nextInt();
			System.out.println("**************************************");
			switch(option) {
				case 1:
					Set<BookPojo> allBooks = bookService.fetchAllBooks();
					System.out.println("**************************************");
					System.out.println("List of Books...");
					System.out.println("**************************************");
					allBooks.forEach((eachBook)->System.out.println(eachBook));
					System.out.println("**************************************");
					break;
				case 2:
					System.out.println("Enter the Book ID : ");
					int bookId = scan.nextInt();
					
					BookPojo fetchedBook = bookService.fetchABook(bookId);
					
					System.out.println("**************************************");
					if(fetchedBook == null) {
						System.out.println("Sorry! Book with ID " + bookId +" does not exist!");
					}else {
						System.out.println(fetchedBook);
					}
					System.out.println("**************************************");

					break;
				case 3:
					System.out.println("Enter the Book Genre : ");
					String bookGenre = scan.next();
					
					Set<BookPojo> fetchedBooksByGenre = bookService.fetchByGenre(bookGenre);
					
					System.out.println("**************************************");
					if(fetchedBooksByGenre.isEmpty()) {
						System.out.println("Sorry! Books with genre " + bookGenre +" does not exist!");
					}else {
						System.out.println("List of Books...");
						System.out.println("**************************************");
						fetchedBooksByGenre.forEach((eachBook)->System.out.println(eachBook));
					}
					System.out.println("**************************************");

					break;
				case 4:
					scan.nextLine();
					System.out.println("Enter Book Title : ");
					String bookTitle = scan.nextLine();
					System.out.println("Enter Book Author : ");
					String bookAuthor = scan.nextLine();
					System.out.println("Enter Book Genre : ");
					String booksGenre = scan.nextLine();
					System.out.println("Enter Book Price : ");
					int bookPrice = scan.nextInt();
					
					BookPojo newBook = new BookPojo(0, bookTitle, bookAuthor, booksGenre, bookPrice, "");
					
					BookPojo addedBook = bookService.addBook(newBook);
					System.out.println("**************************************");
					System.out.println("New book added with ID : " + addedBook.getBookId());
					System.out.println("**************************************");
					
					break;
				case 5:
					//1. ask user to enter the book id to be fetched
					//2. fetch the book with the id 
					//3. display the fetched book information
					//4. ask user to enter the new book price
					//5. set that book price in the fetched book object
					//6. using bookService call updateBook() and pass the object
					//1
					System.out.println("Enter Book ID to edit : ");
					int editBookId = scan.nextInt();
					BookPojo editBook = bookService.fetchABook(editBookId);
					if(editBook != null) {
						System.out.println(editBook);
						System.out.println("Please enter updated price : ");
						int price = scan.nextInt();
						editBook.setBookPrice(price);
						bookService.updateBook(editBook);
						System.out.println("Book price successfully updated!!");
					}	
					break;
				case 6:
					System.out.println("Enter Book ID to delete : ");
					int deleteBookId = scan.nextInt();
					BookPojo deleteBook = bookService.fetchABook(deleteBookId);
					if(deleteBook != null) {
						System.out.println(deleteBook);
						System.out.println("Are you sure to remove this book (y/n) ? ");
						char sure = scan.next().charAt(0);
						if(sure == 'y' || sure == 'Y') {
							bookService.deleteBook(deleteBookId);
							System.out.println("Book successfully removed!!");
						}	
					}else {
						System.out.println("Sorry! Book with ID : " + deleteBookId + " does not exist!");
					}
					break;
				case 7:
					System.out.println("**************************************");
					System.out.println("Thankyou for using BMS!!");
					System.out.println("**************************************");
					System.exit(0);
					break;
				default:
					System.out.println("**************************************");
					System.out.println("Please enter a valid option!");
					System.out.println("**************************************");
			}
			System.out.println("Do you want to continue(y/n) ? ");
		}while((ch = scan.next().charAt(0)) == 'y');
		System.out.println("**************************************");
		System.out.println("Thankyou for using BMS!!");
		System.out.println("**************************************");
	}
}
