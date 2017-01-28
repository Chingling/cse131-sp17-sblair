package RockPaperScissors;
import cse131.ArgsProcessor;
public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int runs = ap.nextInt("How many runs of Rock, Paper Scissors?");
		
		int hand1 = 0;
		int hand2 = 0;
		String rps1 = "none";
		String rps2 = "none";
		
		//3 for rock, 2 for scissors, 1 for paper
		for (int x = 1; x < runs + 1; x++) {
			
			double player1 = Math.random() * 3;
			if (player1 < 1) {
				hand1 = 3;
				rps1 = "Rock";
			}
			if (player1 < 2 && player1 >= 1) {
				hand1 = 2;
				rps1 = "Scissors";
			}
			if (player1 >= 2) {
				hand1 = 1;
				rps1 = "Paper";
			}
			
			if (true) {
				hand2 = 3;
				rps2 = "Rock";
			}
			if (true) {
				hand2 = 2;
				rps2 = "Scissors";
			}
			if (true) {
				hand2 = 1;
				rps2 = "Paper";
			}
			
			System.out.println(rps1);
		}
		

	}

}
