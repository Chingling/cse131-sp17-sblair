package speeding;

import cse131.ArgsProcessor;
public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup user input
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//Collect speed and speed limit
		int speed = ap.nextInt("How fast were you going?");
		int limit = ap.nextInt("What was the speed limit?");
		
		//Determine speed over limit and then determine fine
		int over = speed - limit;
		int overTen = over - 10;
		int initFine = (over > 0) ? 50 : 0;
		int fine = (over > 10) ? (initFine + (10 * overTen)) : initFine;
		
		System.out.println("You reported a speed of " + speed + " MPH for a speed limit of " + limit + " MPH. " + (over <= 0 ? "You went 0 MPH over the speed limit. Your fine is $0." : "You went " + over + " MPH over the speed limit. Your fine is $" + fine + "."));
		
	}

}
