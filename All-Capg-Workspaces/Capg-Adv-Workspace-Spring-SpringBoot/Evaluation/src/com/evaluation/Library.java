package com.evaluation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> books = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
//	findLatestBooks(int yearThreshold)- Returns a list of books published after the given yearThreshold
	
	public List<Book> findLatestBooks(int yearThreshold){
		return books.stream()
					.filter(n -> n.getYearPublished() > yearThreshold)
					.toList();
	}
	
//	findBooksByComplexCriteria(int year,int minPage,String authorSubstring)- Returns a list of books that meet all the following conditions:
//		Published after the give year(year).
//		Have at least a minimum number of pages(minPages).
//		The author’s name contains a specific substring(authorSubstring) in a case-insensitive manner.
	
	public List<Book> findBooksByComplexCriteria(int year, int minPage, String authorSubstring){
		return books.stream()
					.filter(n -> n.getYearPublished() > year)
					.filter(n -> n.getNoOfPages() >= minPage)
					.filter(n -> n.getAuthor()
									.toLowerCase()
									.contains(authorSubstring.toLowerCase())
							)
					.toList();
	}
	
	public List<Book> searchBookByAuthor(String author) {
		return books.stream()
					.filter(obj -> obj.getAuthor().equals(author))
					.toList();
	}
	
	public List<Book> searchBookAfterYear(int year){
		return books.stream()
					.filter(obj -> obj.getYearPublished() > year)
					.toList();
	}
	
	
}
