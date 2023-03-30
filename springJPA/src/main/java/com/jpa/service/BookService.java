package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.dao.BookRepository;
import com.jpa.entities.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}

	public Book getBookById(int id) {
		Book book = null;
		try {
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		return result;
	}

	public void deleteBook(int bid) {
		bookRepository.deleteById(bid);
	}

	public void updateBook(Book book, int bookid) {
		book.setId(bookid);
		bookRepository.save(book);
	}

}
