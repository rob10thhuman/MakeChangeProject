package com.skilldistillery.makechange;
import java.util.Scanner;
//import java.math.BigDecimal;

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
		
//		double changeGiven = amountGiven - itemPrice; 
//		double changeGiven = doTheMath(itemPrice, amountGiven); 
		
		//talking to a friend and describing the problem, it occurred to me 
		//that the computer doesn't know what a penny, etc., is so...
		
//		final double penny=.01, nickel=.05, dime=.1, quarter=.25, dollar=1.00, fiveDollar=5.00, tenDollars=10.00; 
//		final double twenty=20.00, fifty=50.00, hundred=100.00;
		
		//testing
//		double changeOwed=amountGiven - itemPrice - hundred; 
//		System.out.println(changeOwed);
		
		//I think I need some form of loop
		//have to think of a way that change owed is tested against the balance, etc 
		
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
//			System.out.println(changeGiven);
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
//						(changeGiven > fifty) 
						//no need to do the final math here 
//						changeOwed.append("\n1 Penny "); 
						changeOwed.append("\n1 Penny ");
						changeGiven -= penny; 
						}
			}
//		changeGiven = 15;
//		System.out.println("Here's the math! You tendered " + "$" + amountGiven + " and are due $" + changeGiven + ".");
			// After testing, I realized changeGiven is being reduced to zero here...
		
//		System.out.println("Here's the math! You tendered " + "$" + amountGiven + " and are due $" + Math.round(changeToMake) + ".");
			// After testing, I tried to round the change but that didn't work well (rounded the .61 for example to $1
		amountGiven = amountGiven/100; 
		changeToMake = changeToMake/100; 
//		changeOwed = changeOwed/100; 
		System.out.println("\nHere's the math! \nYou tendered " + "$" + amountGiven + " and are due $" + changeToMake + ".");
		System.out.println("\n" + changeOwed); 
		return changeGiven;
//		return changeOwed.toString(); 
		}

}
