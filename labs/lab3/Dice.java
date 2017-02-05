package lab3;
import cse131.ArgsProcessor;
public class Dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int numberDice = ap.nextInt("How many dice to throw?");
		int numberThrows = ap.nextInt("How many times to throw the sets of dice?");
		
		double sums[] = new double[numberDice * 6];
		int[] dice = new int[numberDice];
		double same = 0;
		
		for (int t = 0; t < numberThrows; t++) {
			int sumCheck = 1;
		for (int i = 0; i < dice.length; i++) {
			
			double random = Math.random() * 6;
				if (random < 1) {
					dice[i] = 1; 	
				}
				if (random >= 1 && random < 2) {
					dice[i] = 2;
				}
				if (random >= 2 && random < 3) {
					dice[i] = 3;
				}
				if (random >= 3 && random < 4) {
					dice[i] = 4;
				}
				if (random >= 4 && random < 5) {
					dice[i] = 2;
				}
				if (random >= 5 && random < 6) {
					dice[i] = 6;
				}
			System.out.print(dice[i] + " ");
			if (i > 0) {
				if (dice[i-1] == dice[i]) {
					sumCheck = sumCheck + 1;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < dice.length; i++) {
			sum = sum + dice[i];
		}
		
		for (int i = 0; i < sums.length; i++) {
			if (sum == i + 1) {
				sums[i] = sums[i] + 1;
			}
		}
		
		
		System.out.println("");
		System.out.print("Sum = " + sum);
		if (sumCheck == numberDice) {
			same = same + 1;
		}
		
		System.out.println("");
		
		}
		double percentSame = Math.round(same / numberThrows * 100);
		System.out.println("");
		System.out.print("All dice were the same " + percentSame + "% of the time");
		System.out.println("");
		System.out.println("");
		System.out.print("Sum \t Times Seen");
		System.out.println("");
		
		for (int i = 0; i < sums.length; i++) {
			System.out.print(i + 1 + "\t    " + Math.round(sums[i] / numberThrows * 100) + "%");
			System.out.println("");
		}
	
	}
}
