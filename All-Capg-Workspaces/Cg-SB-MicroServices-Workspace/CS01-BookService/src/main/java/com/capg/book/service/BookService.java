package com.capg.book.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capg.book.entity.Book;


public interface BookService {
	
	public List<Book> getAllBooks();
	
	public Book getBookById(Long id);
	
	public Book addBook(Book book);
	
	public Book updateBookById(Book book, Long id);
	
	public ResponseEntity<String> deleteBookById(Long id);
	
}
