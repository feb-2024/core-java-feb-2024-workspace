DROP DATABASE IF EXISTS bmsdb;
CREATE DATABASE IF NOT EXISTS bmsdb;
USE bmsdb;
DROP TABLE IF EXISTS book_details;

CREATE TABLE book_details (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    book_title VARCHAR(200) NOT NULL,
    book_author VARCHAR(100) NOT NULL,
    book_genre VARCHAR(100) NOT NULL,
    book_price INT NOT NULL,
    book_image_url VARCHAR(255) NOT NULL
);

INSERT INTO book_details(book_title, book_author, book_genre, book_price, book_image_url) VALUES('Harry Potter and the Deathly Hallows', 'J.K.Rowling', 'Fantasy', 450, '');
INSERT INTO book_details(book_title, book_author, book_genre, book_price, book_image_url) VALUES('Harry Potter and the Order of Phoenix', 'J.K.Rowling', 'Fantasy', 350, '');
INSERT INTO book_details(book_title, book_author, book_genre, book_price, book_image_url) VALUES('Harry Potter and the Half Blood Prince', 'J.K.Rowling', 'Fantasy', 250, '');



