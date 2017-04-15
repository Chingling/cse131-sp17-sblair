package project;

import sedgewick.StdDraw;

public class Score {
	private int player1, player2;
	
	public Score() {
		this.player1 = 0;
		this.player2 = 0;
	}
	
	public void updateScore(boolean player1) {
		if (player1 == true) {
			this.player1 = this.player1 + 1;
		}
		else {
			this.player2 = this.player2 + 1;
		}
	}
	
	public void redraw() {
		StdDraw.text(0.07, 0.95, Integer.toString(this.player1));
		StdDraw.text(0.93, 0.95, Integer.toString(this.player2));
	}

}
