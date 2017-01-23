package homeowning;
import cse131.ArgsProcessor;
public class HomeOwning {

	public static void main(String[] args) {
	
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("What is the name of the apartment complex?");
		String zip = ap.nextString("What is the zip code of the apartment");
		int monthRent = ap.nextInt("What is the monthly rent?");
		double dailyInterest = (ap.nextDouble("What is the daily interest payment for your house mortgage?"));
		double yearRent = monthRent * 12;
		double weekRent = Math.round(yearRent / 52 * 100.0) / 100.0;
		double yearInterest = Math.round(dailyInterest * 365 * 100.0) / 100.0;
		double weekInterest = Math.round(dailyInterest * 7 * 100.0) / 100.0;
		
		System.out.println(name + " is located in the Zip Code " + zip);
		System.out.println("Rent per year: " + yearRent);
		System.out.println("Rent per week: " + weekRent);
		System.out.println("");
		System.out.println("Intrest paid per year: " + yearInterest);
		System.out.println("Interest paid per week: " + weekInterest);
		System.out.println("");
		System.out.println("I should " + (weekInterest > weekRent ? "rent" : "own"));
	}

}
