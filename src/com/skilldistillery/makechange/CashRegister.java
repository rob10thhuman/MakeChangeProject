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
//			System.out.println("Exact price given! ");
			exactPrice();
		}
		else {			
			doTheMath(itemPrice, amountGiven); 
//			System.out.println(changeGiven);
		}
		
	}
	
	public static void exactPrice() {
		System.out.println("Exact price given!! No change for you! ");
	}
	
	
	public static double doTheMath(double itemPrice, double amountGiven) {
		double changeGiven, changeToMake; 
		final double penny=.01, nickel=.05, dime=.1, quarter=.25, dollar=1.00, fiveDollar=5.00, tenDollars=10.00;
		final double twenty=20.00, fifty=50.00, hundred=100.00;
		changeGiven = amountGiven - itemPrice;
		changeToMake = changeGiven; 
		
		StringBuilder changeOwed = new StringBuilder(); 
		
			while (changeGiven > penny) {
					if (changeGiven >= hundred) {
							changeOwed.append("Hundred "); 
							changeGiven -= hundred; 
					}
					else if (changeGiven >= fifty) {
							changeOwed.append("Fifty ");
							changeGiven -= fifty; 
						}
					else if (changeGiven >= twenty) {
						changeOwed.append("Twenty ");
						changeGiven -= twenty; 
					}
					else if (changeGiven >= tenDollars) {
						changeOwed.append("Ten ");
						changeGiven -= tenDollars; 
					}
					else if (changeGiven >= fiveDollar) {
						changeOwed.append("Five ");
						changeGiven -= fiveDollar; 
					}
					else if (changeGiven >= dollar) {
						changeOwed.append("One ");
						changeGiven -= dollar; 
					}
					else if (changeGiven >= quarter) {
						changeOwed.append("Quarter ");
						changeGiven -= quarter; 
					}
					else if (changeGiven >= dime) {
						changeOwed.append("Dime ");
						changeGiven -= dime; 
					}
					else if (changeGiven > nickel) {
						changeOwed.append("Nickel ");
						changeGiven -= nickel; 
					}
					else {
//						(changeGiven > fifty) 
						//no need to do the final math here 
						changeOwed.append("Penny ");
						changeGiven -= penny; 
						}
			}
//		changeGiven = 15;
//		System.out.println("Here's the math! You tendered " + "$" + amountGiven + " and are due $" + changeGiven + ".");
			// After testing, I realized changeGiven is being reduced to zero here...
		
//		System.out.println("Here's the math! You tendered " + "$" + amountGiven + " and are due $" + Math.round(changeToMake) + ".");
			// After testing, I tried to round the change but that didn't work well (rounded the .61 for example to $1
		System.out.println("Here's the math! You tendered " + "$" + amountGiven + " and are due $" + changeToMake + ".");
		System.out.println(changeOwed); 
		return changeGiven;
//		return changeOwed.toString(); 
		}

}
