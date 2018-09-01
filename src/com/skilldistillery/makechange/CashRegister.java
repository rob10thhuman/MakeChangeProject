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
//		double changeGiven; 
		
		//talking to my employing broker and describing the problem, it occurred to me 
		//that the computer doesn't know what a penny, etc., is so...
		
		double penny=.01, nickel=.05, dime=.1, quarter=.25, dollar=1.00, fiveDollar=5.00, tenDollars=10.00; 
		double twenty=20.00, fifty=50.00, hundred=100.00;
		
		//testing
		double changeOwed=amountGiven - itemPrice - hundred; 
		System.out.println(changeOwed);
		
		//I think I need some form of loop
		//have to think of a way that change owed is tested against the balance, etc 
		
		
//		if (amountGiven < itemPrice) {
//			System.out.println("You need more money! ");
//		}
//		else if (amountGiven == itemPrice) {
////			System.out.println("Exact price given! ");
//			exactPrice();
//		}
//		else {			
////			System.out.println(changeGiven);
//			doTheMath(itemPrice, amountGiven); 
//		}
//		
	}

	
	
	public static void exactPrice() {
		System.out.println("Exact price given!! ");
	}
	
	public static double doTheMath(double itemPrice, double amountGiven) {
		double changeGiven; 
		changeGiven = amountGiven - itemPrice;
//		changeGiven = 15;
		System.out.println("Here's the math! " + changeGiven); 
		return changeGiven; 
		}

}
