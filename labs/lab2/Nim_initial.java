package lab2;
import cse131.ArgsProcessor;
public class Nim_initial {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int round = 0;
		int sticks = 7;
		int oldSticks;
		int who = 0; //0 for computer, 1 for human
		int remaining = sticks;
		int move = ap.nextInt("Play 'first' or 'second' (1 for first, 2 for second)?");
		String winner = "none";
		
	if (move == 1 || move == 2) {	
		while (remaining > 0) {
			int turn = 1;
			while (turn == 1) {
			
				if (move == 1) {
					
					int human = ap.nextInt("How many sticks do you want to take?");
						if (human == 1 || human == 2) {
							oldSticks = sticks;
							remaining = sticks - human;
							sticks = remaining;
							System.out.println("Round " + round + ", " + oldSticks + " sticks at start, human took " + human + ", so " + remaining + " sticks remain");
							round = round + 1;
							winner = "Human";
						}
						else {
							turn = 0;
						}

						while (turn == 1) {
							oldSticks = sticks;
							int computer = (int)Math.round((1 + Math.random()));
							
							if (remaining > 1) {
								remaining = remaining - computer;
								sticks = remaining;
								System.out.println("Round " + round + ", " + oldSticks + " sticks at start, computer took " + computer + ", so " + remaining + " sticks remain");
								round = round + 1;
								turn = 0;
								winner = "Computer";
							}
							else {
								remaining = 0;
								winner = "Computer";
							}
						}
						
				}
				else {
					if (who == 0) {
					oldSticks = sticks;
					int computer = (int)Math.round((1 + Math.random()));
					
					if (remaining == 1) {
						computer = 1;
						remaining = remaining - computer;
						System.out.println("Round " + round + ", " + oldSticks + " sticks at start, computer took 1, so " + remaining + " sticks remain");
						winner = "Computer";
						turn = 0;
					}
					if (remaining == 2) {
						remaining = 1;
						sticks = remaining;
						System.out.println("Round " + round + ", " + oldSticks + " sticks at start, computer took 1, so " + remaining + " sticks remain");
						round = round + 1;
						winner = "Computer";
						turn = 0;
					}
					if (remaining > 2) {
						remaining = remaining - computer;
						sticks = remaining;
						System.out.println("Round " + round + ", " + oldSticks + " sticks at start, computer took " + computer + ", so " + remaining + " sticks remain");
						round = round + 1;
						winner = "Computer";
						turn = 0;
					}
					}
				if (remaining <= 0) {
					who = 1;
					turn = 0;
						}
						else {
							int human = ap.nextInt("How many sticks do you want to take?");
							if (human == 1 || human == 2) {
								if (remaining == 1) {
									while (human != 1){
										human = ap.nextInt("How many sticks do you want to take?");
									}
									oldSticks = sticks;
									remaining = sticks - human;
									sticks = remaining;
									System.out.println("Round " + round + ", " + oldSticks + " sticks at start, human took " + human + ", so " + remaining + " sticks remain");
									round = round + 1;
									turn = 0;
									who = 0;
									winner = "Human";
								}
								if (remaining == 2) {
									while (human != 1){
										human = ap.nextInt("How many sticks do you want to take?");
									}
									oldSticks = sticks;
									remaining = sticks - human;
									sticks = remaining;
									System.out.println("Round " + round + ", " + oldSticks + " sticks at start, human took " + human + ", so " + remaining + " sticks remain");
									round = round + 1;
									turn = 0;
									who = 0;
									winner = "Human";
								}
								if (remaining > 2) {
								oldSticks = sticks;
								remaining = sticks - human;
								sticks = remaining;
								System.out.println("Round " + round + ", " + oldSticks + " sticks at start, human took " + human + ", so " + remaining + " sticks remain");
								round = round + 1;
								turn = 0;
								who = 0;
								winner = "Human";
								}
						}
							else {
								who = 1;
							}
					}
				}
			}
		}
		System.out.println(winner + " wins");
		
	}
	else {
		System.out.println("Pick a valid number you idiot");
	}
	}

}
