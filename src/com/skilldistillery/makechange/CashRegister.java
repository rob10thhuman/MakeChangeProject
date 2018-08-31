package com.skilldistillery.makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the price of the item? >> ");
		double itemPrice = kb.nextDouble(); 
		System.out.println(itemPrice);
		
		System.out.println("How much money are you tendering? >> ");
		double amountGiven = kb.nextDouble(); 
		System.out.println(itemPrice);
		
		System.out.println(amountGiven - itemPrice);
	}

}
