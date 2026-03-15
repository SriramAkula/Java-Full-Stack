package com.capg.book.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.protocol.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.book.entity.Book;
import com.capg.book.repository.BookRepository;
import com.capg.book.service.BookService;


@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(obj -> books.add(obj));
		return books;
	}

	@Override
	public Book getBookById(Long id) {

		Book book = bookRepository.findById(id).orElseThrow();
		return book;
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBookById(Book book, Long id) {
		Book book1 = getBookById(id);
		book1.setAuthor(book.getAuthor());
		book1.setCategory(book.getCategory());
		book1.setPrice(book.getPrice());
		book1.setTitle(book.getTitle());
		
		
		return bookRepository.save(book);
	}

	@Override
	public ResponseEntity<String> deleteBookById(Long id) {
		Book book = getBookById(id);
		
		bookRepository.delete(book);
		
		return new ResponseEntity<>("Book Deleted Successfully", HttpStatus.OK);
	}

}
