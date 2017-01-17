package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int change = ap.nextInt("Number of pennies?");
		
		int dollars = change % 100;
		int quarters = 
		
				
				
		System.out.println(dollars + quarters);
		
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
