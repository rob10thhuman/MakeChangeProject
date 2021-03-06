package com.skilldistillery.makechange;
import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
	do {
		
		System.out.println("\nWhat is the price of the item? >> ");
		System.out.print("(Enter 0 to exit the program)  >> ");
		double itemPrice = kb.nextDouble(); 
		
		if (itemPrice==0) {
			System.out.println("Goodbye and please come again! ");
			break; 
		}
		
		System.out.print("How much money are you tendering? >> ");
		double amountGiven = kb.nextDouble(); 
		
		if (amountGiven < itemPrice) {
			System.out.println("You need more money! ");
		}
		else if (amountGiven == itemPrice) {
			exactPrice();
		}
		else {			
			itemPrice *=100; 
			amountGiven *=100; 
			doTheMath(itemPrice, amountGiven); 
		}
				
		
	} while (true); 
	
	kb.close(); 
		
	}
	
	public static void exactPrice() {
		System.out.println("Exact price given!! No change for you! ");
	}
	
	
	public static double doTheMath(double itemPrice, double amountGiven) {
		double changeGiven, changeToMake; 
		final double penny=1, nickel=5, dime=10, quarter=25, dollar=100, fiveDollar=500, tenDollars=1000;
		final double twenty=2000, fifty=5000, hundred=10000;
		changeGiven = amountGiven - itemPrice;
		changeToMake = changeGiven; 
		
		StringBuilder changeOwed = new StringBuilder(); 
		
			while (changeGiven >= penny) {
					if (changeGiven >= hundred) {
							changeOwed.append("\n1 One Hundred "); 
							changeGiven -= hundred; 
					}
					else if (changeGiven >= fifty) {
							changeOwed.append("\n1 Fifty Dollar Bill ");
							changeGiven -= fifty; 
						}
					else if (changeGiven >= twenty) {
						changeOwed.append("\n1 Twenty Dollar Bill ");
						changeGiven -= twenty; 
					}
					else if (changeGiven >= tenDollars) {
						changeOwed.append("\n1 Ten Dollar Bill ");
						changeGiven -= tenDollars; 
					}
					else if (changeGiven >= fiveDollar) {
						changeOwed.append("\n1 Five Dollar Bill ");
						changeGiven -= fiveDollar; 
					}
					else if (changeGiven >= dollar) {
						changeOwed.append("\n1 One Dollar Bill ");
						changeGiven -= dollar; 
					}
					else if (changeGiven >= quarter) {
						changeOwed.append("\n1 Quarter ");
						changeGiven -= quarter; 
					}
					else if (changeGiven >= dime) {
						changeOwed.append("\n1 Dime ");
						changeGiven -= dime; 
					}
					else if (changeGiven >= nickel) {
						changeOwed.append("\n1 Nickel ");
						changeGiven -= nickel; 
					}
					else {
						changeOwed.append("\n1 Penny ");
						changeGiven -= penny; 
						}
			}

		amountGiven = amountGiven/100; 
		changeToMake = changeToMake/100; 
		System.out.println("\nHere's the math! \nYou tendered " + "$" + amountGiven + " and are due $" + changeToMake + ".");
		System.out.println("\n" + changeOwed); 
		return changeGiven;
		}

}
