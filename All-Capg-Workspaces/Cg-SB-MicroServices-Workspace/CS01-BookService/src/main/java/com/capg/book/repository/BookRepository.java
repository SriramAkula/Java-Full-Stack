package com.capg.book.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capg.book.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

	public Optional<Book> findById(Long id);
	
	public List<Book> findByCategory(String category);
	
}
