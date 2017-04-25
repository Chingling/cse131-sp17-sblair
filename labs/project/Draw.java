package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Draw {

	private GameBoard g;
	private Score s;
	private Players p;

	public Draw(GameBoard g, Players p, Score s) {
		this.g = g;
		this.s = s;
		this.p = p;
	}

	public void startScreen() {
		//Start screen and get points to win
		StdDraw.text(0.5, 0.5, "GORILLAS");
		StdDraw.pause(1500);
		StdDraw.clear();

		//Show Player positions
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(0.10, 0.80, "Player 1");
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(0.90, 0.80, "Player 2");

		StdDraw.pause(1500);

		//Redraw all elements to begin game-play
		redrawAll();
	}
	
	public void redrawAll() {
		StdDraw.clear();
		g.redraw();
		p.redraw();
		s.redraw();
	}
	
	public void redrawProjectile() {
		StdDraw.show(5);
		redrawAll();
		StdDraw.show();
	}
	
	public void endScreen() {
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.text(0.5, 0.5, "GAME OVER");
	}
	
	public void player1() {
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(0.10, 0.80, "Player 1");
	}
	
	public void player2() {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(0.90, 0.80, "Player 2");
	}

}
