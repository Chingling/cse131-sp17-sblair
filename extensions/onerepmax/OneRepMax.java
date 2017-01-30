package onerepmax;
import cse131.ArgsProcessor;
public class OneRepMax {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int percent = 100;
		int weight = ap.nextInt("What is the current successful bench weight?");
		double succReps = ap.nextInt("How many successful reps?");
		int desReps = ap.nextInt("How many desired reps?");
		
		double repMax = weight * (1 + (succReps)/30);
		double fiveReps = repMax * 0.85;
		
		System.out.println("One-rep max: " + repMax);
		System.out.println("Weight for " + desReps + " reps: " + fiveReps);
		
		for (int x = 0; x < 10; x++) {
			percent = (percent - 5);
			double percentPrint = percent / 100.0;
			double percentWeight = repMax * percentPrint;
			System.out.println(Math.round(percentPrint * 100 * 10) / 10 + "% 1 RM: " + percentWeight);
		}
	}

}
