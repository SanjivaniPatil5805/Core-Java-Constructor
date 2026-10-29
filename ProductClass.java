package com.practice.constructor;

// Question. Create a Product class with overloaded constructors to initialize a product using: Product name only , Product name and price , Product name, price, and quantity

public class ProductClass {
	
	String productName;
	double price;
	int quantity;
	
	public ProductClass(String productName) {
		
		this.productName = productName;
		
	}
	
	public ProductClass(String productName, double price) {
		
		this.productName = productName;
		this.price = price;
		
	}
	
	public ProductClass(String productName, double price, int quantity) {
		
		this.productName = productName;
		this.price = price;
		this.quantity =quantity;
		
	}

	public static void main(String[] args) {
		
		ProductClass p1 = new ProductClass("Apple");
		ProductClass p2 = new ProductClass("Pen", 10.0);
		ProductClass p3 = new ProductClass("Book", 50.0, 30);
		
		System.out.println("First Product Name = "+p1.productName);
		System.out.println("First Product Price = "+p1.price);
		System.out.println("First Product Quantity = "+p1.quantity);
		
		System.out.println();
		
		System.out.println("Second Product Name = "+p2.productName);
		System.out.println("Second Product Price = "+p2.price);
		System.out.println("Second Product Quantity = "+p2.quantity);
		
		System.out.println();
		
		System.out.println("Third Product Name = "+p3.productName);
		System.out.println("Third Product Price = "+p3.price);
		System.out.println("Third Product Quantity = "+p3.quantity);
		
	}
	
}
