package lab1;
import cse131.ArgsProcessor;
public class Nutrition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		String name = ap.nextString("Food name?");
		double carbs = ap.nextDouble("Grams of carbs?");
		double fat = ap.nextDouble("Grams of fat?");
		double protein = ap.nextDouble("Grams of protein");
		int statedCal = ap.nextInt("Total calories?");
		
		double carbCal = carbs * 4.0;
		double protCal = protein * 4.0;
		double fatCal = fat * 9.0 * 10.0 / 10.0;
		double totalCal = carbCal + protCal + fatCal;
		double unavalCal = Math.round((totalCal - statedCal) * 10.0) / 10.0;
		double fiber = unavalCal / 4.00;
				
		double perCarb = Math.round((carbCal / statedCal) * 1000.0) / 10.0;
		double perFat = Math.round((fatCal / statedCal) * 1000.0) / 10.0;
		double perProt = Math.round((protCal / statedCal) * 1000.0) / 10.0;
		
		boolean lowcarb = perCarb <= 25;
		boolean lowfat = perFat <= 15;
		
		double random = Math.random();
		boolean coin = random < 0.5;
		
		System.out.println(name + " has");
		System.out.println(carbs + " grams of carbohydrates = " + carbCal + " Calories");
		System.out.println(fat + " grams of fat = " + fatCal + " Calories");
		System.out.println(protein + " grams of protein = " + protCal + " Calories");
		System.out.println("");
		System.out.println("This food is said to have " + unavalCal + " (available) Calories.");
		System.out.println("With " + unavalCal + " unavailable Calories, this food has " + fiber + " grams of fiber");
		System.out.println("");
		System.out.println("Approximately");
		System.out.println(perCarb + "% of your food is carbohydrates");
		System.out.println(perFat + "% of your food is fat");
		System.out.println(perProt + "% of your food is protein");
		System.out.println("");
		System.out.println("This food is acceptable for a low-carb diet? " + lowcarb);
		System.out.println("This food is acceptable for a low-fat diet? " + lowfat);
		System.out.println("By coin flip, you should eat this food? " + coin);
	}

}
