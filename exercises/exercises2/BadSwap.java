package exercises2;

import cse131.ArgsProcessor;

public class BadSwap {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int x = ap.nextInt("Enter x");
		int y = ap.nextInt("Enter y");
		
		if (x > y) {
			x = y;     // Bad
			y = x;     // swap!!
		}
		
		System.out.println("x and y are now"
				+ x + " and " + y);
		
		//
		// Student fill in with comments below this line:
		//   Why does the code above *not* swap the values of
		//      x and y?
		//   Note that the bad swap executes only if x>y
		//
		// Your answer:
		//	x and y are set by the user. The program then sets x = y, making them the same value.
		//	When y is then set equal to x, they are already the same value so nothing is swapped.
		//
		//
		//
		//

	}

}
