package lab6;
import cse131.ArgsProcessor;

public class Beer {
	
	public static String bottlesOfBeer(int n) {
		
		if (n < 0) {
			return "You can't have negative bottles of beer";
		}
		if (n == 0) {
			return "0 bottles of beer on the wall; go home";
		}
		else {
			return n + " bottles of beer on the wall; take one down, pass it around, " + (n - 1) + " bottles of beer on the wall.\n" + bottlesOfBeer(n-1); 
		}
	}

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int bottles = ap.nextInt("How much drunk?");

		System.out.println(bottlesOfBeer(bottles));
	}

}
