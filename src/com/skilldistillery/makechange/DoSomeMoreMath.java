package com.skilldistillery.makechange;

import java.util.Scanner;

public class DoSomeMoreMath {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is item price? ");
		double itemPrice = kb.nextDouble(); 
		
		System.out.println("What is amount tendered?" );
		double amountPaid = kb.nextDouble(); 
	
		double userChange = amountPaid - itemPrice; 
		
		
		double newChange = userChange % 20; 
		double twenties = (int)((userChange - newChange)/20);
		System.out.println("Twenties: " + twenties);
		
		newChange = userChange % 10;
		double tens = (int)((userChange - newChange)/10);
		System.out.println("Tens: " + tens);
		
		newChange = userChange % 5;
		double fives = (int)((userChange - newChange)/5);
		System.out.println("Fives: " + fives);
		
		newChange = userChange % 1;
		double ones = (int)((userChange - newChange)/1);
		System.out.println("Ones: " + ones);
		
		newChange = userChange % .25;
		double quarters = (int)((userChange - newChange)/.25);
		System.out.println("Quarters: " + quarters);
		
		newChange = userChange % .10;
		double dimes = (int)((userChange - newChange)/.10);
		System.out.println("Dimes: " + dimes);

		newChange = userChange % .05;
		double nickels = (int)((userChange - newChange)/.05);
		System.out.println("Nickels: " + nickels);
		
		newChange = userChange % .01;
		double pennies = (int)((userChange - newChange)/.01);
		System.out.println("Pennies: " + pennies);

//		System.out.println(" Remaining change is : " + newChange);
		
		
		
		kb.close();
	}

}
