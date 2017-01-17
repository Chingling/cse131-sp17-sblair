package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		
		//Setup user prompt
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//Ask for amount of pennies
		int change = ap.nextInt("Number of pennies?");
		
		//Calculate number of each coin
		int dollars = change / 100;
		int quarters = (change - (dollars * 100)) / 25;
		int dimes = (change - (dollars * 100) - (quarters * 25)) / 10;
		int nickels = (change - (dollars * 100) - (quarters * 25) - (dimes * 10)) / 5;
		int pennies = (change - (dollars * 100) - (quarters * 25) - (dimes * 10) - (nickels * 5));
		
		//Check to see if the coins added up match the initial value
		int check = (dollars * 100) + (quarters * 25) + (dimes * 10) + (nickels * 5) + pennies;
				
		//Output number of each coin		
		System.out.print("For " + change + " pennies: " + dollars + " dollars and " + quarters + " quarters and " + dimes + " dimes and " + nickels + " nickels and " + pennies + " pennies " + check );
		
		
		
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
