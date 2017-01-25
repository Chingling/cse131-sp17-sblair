package exercises2;
import cse131.ArgsProcessor;
public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//

		ArgsProcessor ap = new ArgsProcessor(args);
		
		int inches = ap.nextInt("Number of inches?");
		int feet = inches / 12;
		int remainder = inches % 12;
		
		if (feet == 1 && remainder == 1) {
		System.out.println(feet + " foot and " + remainder + " inch");
		}
		if (feet == 1 && (remainder > 1 || remainder == 0)) {
		System.out.println(feet + " foot and " + remainder + " inches");
		}
		if ((feet > 1 || feet == 0) && remainder == 1) {
		System.out.println(feet + " feet and " + remainder + " inch");
		}
		if ((feet > 1 || feet == 0) && (remainder > 1 || remainder == 0)) {
		System.out.println(feet + " feet and " + remainder + " inches");
		}
	}

}
