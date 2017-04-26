package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class Initializer {
	private int points;
	private double[] heights;
	private ArgsProcessor ap;
	private GameBoard g;
	private Score s;
	private Players p;
	private Draw d;

	public Initializer(String[] args) {
		this.ap = new ArgsProcessor(args);

		//Initialize Ground, Players, Score, and Draw objects
		this.g = new GameBoard();
		this.heights = g.getStartHeights();
		this.p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
		this.s = new Score();
		this.d = new Draw(g, p, s, args);
		StdDraw.clear();
		this.points = d.startScreen();
	}

	public int getPoints() {
		return this.points;
	}

	public int startThrow(double initX, boolean player) {
		int turn = 1;
		double initY = 0;
		double angle = -1;
		double velocity = -1;
		this.d.redrawAll();
		if (player == true) {
			initY = this.heights[0];
			this.d.player1();
			while (angle <= 0) {
				angle = ap.nextDouble("Player 1: Angle");
			}
			while (velocity <= 0) {
				velocity = ap.nextDouble("Player 1: Velocity");
			}
		}
		if (player == false) {
			initY = this.heights[1];
			this.d.player2();
			while (angle <= 0) {
				angle = ap.nextDouble("Player 2: Angle");
			}
			while (velocity <= 0) {
				velocity = ap.nextDouble("Player 2: Velocity");
			}
		}
		Projectile r = new Projectile(angle, velocity);

		//Projectile throw loop
		while (turn == 1) {
			double [] coord = new double [2];
			if (player == true) {
				coord = r.throwP(true, initX, initY);
			}
			if (player == false) {
				coord = r.throwP(false, initX, initY);
			}
			initX = coord[0];
			initY = coord[1];
			this.d.redrawProjectile();

			boolean collisionP = this.p.checkCollision(initX, initY);
			boolean collisionG = this.g.checkCollision(initX, initY);

			//Ground collision
			if (collisionG == true) {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.text(0.5, 0.95, "Miss!");
				turn = 2;
				StdDraw.pause(1000);
			}

			//Player collision
			if (collisionP == true) {
				if (player == true) {
					this.s.updateScore(true);
					this.d.hitAnimation(true);
				}
				if (player == false) {
					this.s.updateScore(false);
					this.d.hitAnimation(false);
				}
				turn = 2;
				if (this.s.getPlayer1() != this.points && this.s.getPlayer2() != this.points) {
					this.g = new GameBoard();
					this.heights = g.getStartHeights();
					this.p = new Players(0.05, 0.95, this.heights[0] + 0.01, this.heights[1] + 0.01);
					this.d.reset(g, p);
				}
			}

			//Condition if point limit reached
			if (this.s.getPlayer1() == points || this.s.getPlayer2() == points) {
				return 0;
			}
		}
		return 1;
	}
	
	public void endScreen() {
		this.d.endScreen();
	}
}
