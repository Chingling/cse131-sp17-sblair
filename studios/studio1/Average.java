package studio1;

import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int n1 = ap.nextInt("What is the first integer?");
		int n2 = ap.nextInt("What is the second integer?");
		
		System.out.println((n1 + n2)/2);
	}

}
