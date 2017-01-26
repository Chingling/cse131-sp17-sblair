package studio2;
import cse131.ArgsProcessor;
public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int start = ap.nextInt("What is the starting amount of money?");
		double winChance = ap.nextDouble("What is the chance you win?");
		int winAmount = ap.nextInt("What is the amount to reach to win?");
		double totalPlays = ap.nextDouble("What is the total amount of plays");
		double lossChance = (1 - winChance);
		int rounds = 0;
		int i = 0;
		int sim = 1;
		int win = 0; // 1 for loss 0 for win
		double count = 0;
		double Ruin = 0;
		
		
		if (lossChance != winChance) {
			Ruin = ((Math.pow((lossChance/winChance),(start)) - (Math.pow((lossChance/winChance), (winAmount)))) / (1 - Math.pow((lossChance/winChance), (winAmount)))); 

		}
			if (lossChance == winChance) {
			Ruin = 1 - start / winAmount;
			}
		
		while (i < totalPlays) {
			int startAmount = start;
			rounds = 0;
			
			while (startAmount > 0 && startAmount < winAmount) {
				double random = Math.random();
				boolean chance = random < winChance;
				if (chance == true) {
					startAmount = startAmount + 1;
				}
				if (chance == false) {
					startAmount = startAmount - 1;
				}
				rounds = rounds + 1;
				win = (startAmount == 0) ? 1 : 0;
			}
			if (win == 1) {
				count = count + 1.0;
			}
			String winornot = (win == 1) ? "LOSE" : "WIN";
			System.out.println("Simulation " + sim + ": " + rounds + " rounds        " + winornot);
			i = i + 1;
			sim = sim + 1;
			
			
			
		}
		System.out.println("");
		System.out.println("Losses: " + count + " Simulations: " + totalPlays);
		System.out.println("Actual Ruin Rate: " + (count / totalPlays) + " Expected Ruin Rate: " + Ruin);
	}

}
