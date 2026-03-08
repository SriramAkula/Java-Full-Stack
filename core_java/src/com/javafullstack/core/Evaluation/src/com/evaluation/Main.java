package com.evaluation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		Add at least 5 books to the library collection.
//		Search for books by an author and print the results.
//		Search for books published after a given year and print the results.
//		Search for books using the complex criteria method and print the results.
		
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		
		for(int i=0;i<5;i++){
			
			String[] input = sc.nextLine().split(",");
			
			Book book = new Book();
			book.setId(Integer.parseInt(input[0]));
			book.setTitle(input[1]);
			book.setAuthor(input[2]);
			book.setYearPublished(Integer.parseInt(input[3]));
			book.setNoOfPages(Integer.parseInt(input[4]));
			
			lib.addBook(book);
			
			lib.
		}
		
		String author = sc.nextLine();
		System.out.println(lib.searchBookByAuthor(author));
		
		
		
		
		
	}
}
