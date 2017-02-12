package blackjack;
import cse131.ArgsProcessor;
public class Blackjack {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int p = ap.nextInt("How many computer players?");
		int games = ap.nextInt("How many games?");
		
		System.out.println("You chose to play " + games + " games");
		System.out.println("There are " + p + " computer players");
		System.out.println("");
		
		for (int i = 0; i < games; i++) {
			System.out.println("Game " + i + 1);
			int score[] = new int[p+2];
			
			//Dealing 2 cards to every player
			for (int j = 0; j < score.length; j++) {
				for (int k = 0; k < 2; k++) {
					int random = (1 + (int)(13*Math.random()));
					int card = 0;
			
					//Set card values
					if (random == 1) {
						card = 11;
					}
					if (random >= 2 && random <= 9) {
						card = random;
					}
					if (random >= 10) {
						card = 10;
					}
					score[j] = score[j] + card;
				}
			}
			
			System.out.println("The player's scores are:");
			for (int j = 1; j < score.length-1; j++) {
				System.out.print(score[j] + " ");
			}
			System.out.println("");
			System.out.println("The dealer's face-up card has a value of " + score[p-1]); 
			
			
			//Human move
			int stand = 0;
			while (stand == 0) {
				System.out.println("Your current count is " + score[0]);
				int move = 0;
				while (move != 1 && move != 2) {
					move = ap.nextInt("1 for hit 2 for stand");
				}
				if (move == 1) {
					System.out.println("Hit!");
					int random = (1 + (int)(13*Math.random()));
					int card = 0;

					//Set card values
					if (random == 1) {
						card = 11;
					}
					if (random >= 2 && random <= 9) {
						card = random;
					}
					if (random >= 10) {
						card = 10;
					}
					score[0] = score[0] + card;
					if (score[0] > 21) {
						stand = 1;
						System.out.println("Your current count is " + score[0] + ". Bust!");
					}
					if (score[0] == 21) {
						stand = 1;
						System.out.println("Your current count is " + score[0] + ". Blackjack!");
					}
				}
				else {
					System.out.println("Stand");
					stand = 1;
				}
			}
			
			//Computer and Dealer moves
			for (int j = 1; j < score.length; j++) {
				while (score[j] < 18) {
					int random = (1 + (int)(13*Math.random()));
					int card = 0;
			
					//Set card values
					if (random == 1) {
						card = 11;
					}
					if (random >= 2 && random <= 9) {
						card = random;
					}
					if (random >= 10) {
						card = 10;
					}
					score[j] = score[j] + card;
				}
			}
			
			System.out.println("");
			System.out.println("Dealer got \t" + score[p-1] + ((score[p-1] > 21) ? "\tBust!" : ((score[p-1] == 21) ? "\tBlackjack!" : "")));
			System.out.println("Human got \t" + score[0] + ((score[0] > 21) ? "\tBust!" : ((score[0] == 21) ? "\tBlackjack!" : "")));
			for (int j = 1; j < score.length-1; j++) {
				System.out.println("Player " + j + " got \t" + score[j] + ((score[j] > 21) ? "\tBust!" : ((score[j] == 21) ? "\tBlackjack!" : "")));
			}
			
			String winners = "";
			String pushers = "";
			if (score[0] <= 21 && (score[0] > score[p-1] || score[p-1] > 21)) {
				winners = winners + "Human ";
			}
			if (score[0] <= 21 && score[0] == score[p-1]) {
				pushers = pushers + "Human ";
			}
			for (int j = 1; j < score.length-1; j++) {
				if (score[j] <= 21 && (score[j] > score[p-1] || score[p-1] > 21)) {
					winners = winners + "Player " + j + " ";
				}
				if (score[j] <= 21 && score[j] == score[p-1]) {
					pushers = pushers + "Player " + j + " ";
				}
			}
			System.out.println("Winners: " + winners);
			System.out.println("Pushers: " + pushers);
			
			
			
		}

	}

}
