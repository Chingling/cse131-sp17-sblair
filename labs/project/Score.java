package project;

import java.awt.Color;

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
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(0.5, 0.5, "Player 1 POINT");
			StdDraw.pause(1500);
		}
		else {
			this.player2 = this.player2 + 1;
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.text(0.5, 0.5, "Player 2 POINT");
			StdDraw.pause(1500);
		}
	}
	
	public int getPlayer1() {
		return this.player1;
	}
	
	public int getPlayer2() {
		return this.player2;
	}
	
	public void redraw() {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.07, 0.95, Integer.toString(this.player1));
		StdDraw.text(0.93, 0.95, Integer.toString(this.player2));
	}

}
