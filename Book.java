package com.practice.constructor;

// Question. Create a Book class with title, author, and price. Initialize and display the values using a parameterized constructor.

public class Book {

     String title;
     String author;
     double price;
     
     public Book(String title, String author, double price) {
    	 
    	 this.title = title;
    	 this.author = author;
    	 this.price = price;
    	 
     }
     
     public static void main(String[] args) {
		
    	 Book b = new Book("Wings of Fire", "A.P.J.Abdul Kalam",500.00);
    	 
    	 System.out.println("Book Name = "+b.title);
    	 System.out.println("Author = "+b.author);
    	 System.out.println("Price = "+b.price);
    	   	 
	}
	
}
