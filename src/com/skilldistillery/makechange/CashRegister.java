package com.skilldistillery.makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of the item? >> ");
		double itemPrice = kb.nextDouble(); 
//		System.out.println(itemPrice);
		
		System.out.println("How much money are you tendering? >> ");
		double amountGiven = kb.nextDouble(); 
//		System.out.println(itemPrice);
		
//		double changeGiven = amountGiven - itemPrice; 
		double changeGiven; 
		
		if (amountGiven < itemPrice) {
			System.out.println("You need more money! ");
		}
		else if (amountGiven == itemPrice) {
//			System.out.println("Exact price given! ");
			exactPrice();
		}
		else {			
//			System.out.println(changeGiven);
			doTheMath(); 
		}
		
	}
	
	public static void exactPrice() {
		System.out.println("Exact price given!! ");
	}
	
	public static void doTheMath() {
		System.out.println("Here's the math!"); 
//		changeGiven = amountGiven - itemPrice;
		}

}
