package com.designpatterns.app;

import com.designpatterns.model.Book;

/*
	---		Single responsible principle		---
	A software entity (class, method) should have only one reason to change
	if a class or a method does more than one procedure, it is advisable to
	separate it into two distinct classes / methods
	it can be done easily with the help of Interfaces (able)
	
	So if we have 2 reasons to change for a class then 
	we should split the functionality into two separate classes
		Note: Each class handle a single responsibility!
	
	it leads to a low coupled design with less and lighter dependencies.

*/


public class SolidApp {
	
	public static void main(String[] args) {
		Book principito = new Book();
		principito.setNumOfPages(510);
		principito.setAuthorName("Antoine de Saint-Exupéry");
		
		principito.toString();
		
	}

}
