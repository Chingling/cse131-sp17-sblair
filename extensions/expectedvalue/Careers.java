package expectedvalue;
import cse131.ArgsProcessor;
public class Careers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		
		double prob = ap.nextDouble("What is the probability of the game start-up venture succeeding?");
		double gamer = Math.round((prob * 190000) + ((1 - prob) * 5000));
		double random = Math.random();
		double programmer = Math.round(110000 + (50000 * random));
		
		double gamer2 = Math.round(3 * Math.sqrt(gamer));
		double programmer2 = Math.round(2 * Math.sqrt(programmer));
		
		System.out.println("Expected Value");
		System.out.println("Gamer: $" + gamer);
		System.out.println("Programmer: $" + programmer);
		System.out.println("You should be a: " + (programmer > gamer ? "programmer" : "gamer"));
		System.out.println("");
		System.out.println("Non-Linear Utility:");
		System.out.println("Gamer: " + gamer2);
		System.out.println("Programmer: " + programmer2);
		System.out.println("You should be a: " + (programmer2 > gamer2 ? "programmer" : "gamer"));
	}

}
