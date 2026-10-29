package com.practice.constructor;

// Question. Create a Product class with productId, productName, and price. Display the details using a constructor.

public class Product {
	
	int productId = 12;
	String productName = "Laptop";
	double price = 54000.00;

	public Product() {
		
	   System.out.println("Product Id = "+productId);
	   System.out.println("Product Name = "+productName);
	   System.out.println("Product Price = "+price);

	}
	
	public static void main(String[] args) {
		
		Product p = new Product();
		
	}
	
}
