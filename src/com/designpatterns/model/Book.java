package com.designpatterns.model;

public class Book {
	private int numOfPages;
	private String authorName;
	
	//Constructors
	public Book() {
		
	}
	
	public Book(int numOfPages, String authorName) {
		this.numOfPages = numOfPages;
		this.authorName = authorName;
	}
	
	//Getters and setters
	
	public int getNumOfPages() {
		return numOfPages;
	}
	
	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	//methods
	public void print() {
		System.out.println("Printint the book by " + authorName);
	}
	
	public void save() {
		System.out.println("Saving " + numOfPages + " pages of the book.");
	}
	
	
	@Override
	public String toString() {
		return "Autor name: [" + authorName + "] - Number of pages: [" + numOfPages + "]";
	}
	
}
