package com.practice.constructor;

import java.util.Scanner;

// Question. Create a NumberCheck class with an integer variable. Initialize it using a constructor and check whether the number is prime.

public class NumberCheck {

	Scanner sc = new Scanner(System.in);

	int num;

	public NumberCheck() {
		
		System.out.println("Enter a number :");
		num = sc.nextInt();
		
	}
	
	public String isPrime() {
		
	     int count = 0;
	     
	     for(int i = 1; i <= num; i++) {
	    	 
	    	 if(num % i == 0) {
	    		 
	    		 count++;
	    		 
	    	 }
	    	 
	     }
	     
	     if(count == 2) {
	    	 
	    	 return "Prime Number";
	    	 
	     } else {
	    	 
	    	 return "Not Prime Number";
	    	 
	     }
		
	}
	
	public static void main(String[] args) {
		
		NumberCheck n = new NumberCheck();
		System.out.println(n.isPrime());
		
	}

}
