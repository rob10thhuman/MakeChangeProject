package com.skilldistillery.makechange;

import java.util.Scanner;

public class DoSomeMath {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is item price? ");
		double itemPrice = kb.nextDouble(); 
		
		System.out.println("What is amount tendered?" );
		double amountPaid = kb.nextDouble(); 
	
		itemPrice *=100; 
		amountPaid *=100; 
		
		double changeDue = amountPaid - itemPrice; 
		changeDue /=100; 
		System.out.println("Change Due: " + changeDue);
		
		changeDue = amountPaid - itemPrice; 
		
//		double ab = 30%20; 
//		double ac = 3000%2000; 
//		System.out.println(ab);
//		System.out.println(ac);
		
		double a = changeDue%2000; 
		if (a!=0)
			System.out.println("One $20");
			//System.out.println("Twenties: " + a/100);

		double b = changeDue%1000; 
		if (b!=0)
			System.out.println("One $10");			
			//System.out.println("Tens: " + b);
		
//		double c = b%500; 
//		System.out.println("Fives: " + c);
//		
//		double d = b%100; 
//		System.out.println("Ones: " + d);
//		
//		double e = d%25; 
//		System.out.println("Quarters: " + e);
//		
//		double f = e%5; 
//		System.out.println("Nickels " + f);
//		
//		double g = f%1; 
//		System.out.println("Pennies: " + g);
		
		kb.close();
	}

}
