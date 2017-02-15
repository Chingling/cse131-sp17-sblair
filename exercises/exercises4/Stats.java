package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average");

		double sum = 0;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		int count = 0;
		
		while (!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			count = count + 1;
			System.out.println(d);
			sum = sum + d;
			
			if (d < min) {
				min = d;
			}
			if (d > max) {
				max = d;
			}
		}
		double average = sum/count;
		
		System.out.println();
		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
		
		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		//

	}

}
