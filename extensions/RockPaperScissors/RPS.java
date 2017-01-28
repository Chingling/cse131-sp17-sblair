package RockPaperScissors;
import cse131.ArgsProcessor;
public class RPS {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		double runs = ap.nextDouble("How many runs of Rock, Paper Scissors?");
		
		int player2 = 0;
		int hand1 = 0;
		int hand2 = 0;
		String rps1 = "none";
		String rps2 = "none";
		
		double player1wins = 0;
		double player2wins = 0;
		double drawCount = 0;
		
		//3 for rock, 2 for scissors, 1 for paper
		for (int x = 0; x < runs; x++) {
			
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
			
			if (player2 == 0) {
				hand2 = 3;
				rps2 = "Rock";
			}
			if (player2 == 1) {
				hand2 = 1;
				rps2 = "Paper";
			}
			if (player2 == 2) {
				hand2 = 2;
				rps2 = "Scissors";
				player2 = player2 - 3;
			}
			player2 = player2 + 1;
			
			System.out.println("Random: " + rps1 + " | Orderly: " + rps2);
			if ((hand1 == 3 && hand2 == 3) || (hand1 == 2 && hand2 == 2) || (hand1 == 1 && hand2 == 1)) {
				System.out.println("Draw");
				drawCount = drawCount + 1;
				
			}
			if ((hand1 == 3 && hand2 == 2) || (hand1 == 2 && hand2 == 1) || (hand1 == 1 && hand2 == 3)) {
				System.out.println("Player 1 wins");
				
				player1wins = player1wins + 1;
			}
			if ((hand2 == 3 && hand1 == 2) || (hand2 == 2 && hand1 == 1) || (hand2 == 1 && hand1 == 3)) {
				System.out.println("Player 2 wins");
				
				player2wins = player2wins + 1;
			}
		}
		double player1ratio = player1wins / (runs - drawCount);
		double player2ratio = player2wins / (runs - drawCount);
		System.out.println("");
		System.out.println("Random wins: " + player1wins + " Ratio: " + player1ratio);
		System.out.println("Orderly wins: " + player2wins + " Ratio: " + player2ratio);
		System.out.println(((player1ratio > player2ratio) ? "Random" : "Orderly") + " has a higher win ratio");
		

	}

}
