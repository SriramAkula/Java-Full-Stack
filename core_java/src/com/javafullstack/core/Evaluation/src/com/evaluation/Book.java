package com.evaluation;

public class Book {
	//id,author,title,yearpublished,noofpages
	
	private int id;
	
	private String author;
	
	private String title;
	
	private int yearPublished;
	
	private int noOfPages;

	
	
	public Book() {
		
	}

	public Book(int id, String author, String title, int yearPublished, int noOfPages) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.noOfPages = noOfPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
}
