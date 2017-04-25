package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GorillasMain {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//Initialize Ground, Players, Score, and Draw objects
		GameBoard g = new GameBoard();
		double [] heights = g.getStartHeights();
		Players p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
		Score s = new Score();
		Draw d = new Draw(g, p, s);
		StdDraw.clear();

		int points = ap.nextInt("How many points to win?");

		d.startScreen();

		//Main game loop
		int count = 1;
		double initX = 0;
		double initY = 0;
		int turn = 0;

		while (count == 1) {

			//Player 1

			//Initialization
			initX = 0.05 + 0.02;
			initY = heights[0] + 0.02;
			turn = 1;
			d.redrawAll();
			d.player1();

			//Get Player inputs for projectile
			double angle = ap.nextDouble("Player 1: Angle");
			double velocity = ap.nextDouble("Player 1: Velocity");
			Projectile r = new Projectile(angle, velocity);

			//Projectile throw loop
			while (turn == 1) {
				double [] coord = r.throwP(true, initX, initY);
				initX = coord[0];
				initY = coord[1];
				d.redrawProjectile();

				boolean collisionP = p.checkCollision(initX, initY);
				boolean collisionG = g.checkCollision(initX, initY);

				//Ground collision
				if (collisionG == true) {
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.text(0.5, 0.95, "Miss!");
					turn = 2;
					StdDraw.pause(1000);
				}

				//Player collision
				if (collisionP == true) {
					s.updateScore(true);
					for (int i = 0; i < 5; i++) {
						StdDraw.show(0);
						StdDraw.clear();
						g.redraw();
						p.redraw();
						s.redraw();
						StdDraw.show();
						StdDraw.setPenColor(Color.RED);
						StdDraw.text(0.5, 0.95, "Player 1 POINT");
						StdDraw.pause(200);
						StdDraw.show(0);
						StdDraw.clear();
						g.redraw();
						p.redraw();
						s.redraw();
						StdDraw.show();
						StdDraw.pause(200);
					}
					turn = 2;
					if (s.getPlayer1() != points) {
						g = new GameBoard();
						heights = g.getStartHeights();
						p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
					}
				}

				//Condition if point limit reached
				if (s.getPlayer1() == points) {
					count = 0;
				}
			}

			//Player 2

			if (count == 1) {

				//Initialization
				initX = 0.95 - 0.02;
				initY = heights[1] + 0.02;
				turn = 2;
				d.redrawAll();
				d.player2();

				//Get Player inputs for projectile
				angle = ap.nextDouble("Player 2: Angle");
				velocity = ap.nextDouble("Player 2: Velocity");
				r = new Projectile(angle, velocity);

				//Projectile throw loop
				while (turn == 2) {
					double [] coord = r.throwP(false, initX, initY);
					initX = coord[0];
					initY = coord[1];
					d.redrawProjectile();

					boolean collisionP = p.checkCollision(initX, initY);
					boolean collisionG = g.checkCollision(initX, initY);

					//Ground collision
					if (collisionG == true) {
						StdDraw.setPenColor(Color.BLACK);
						StdDraw.text(0.5, 0.95, "Miss!");
						StdDraw.pause(1500);
						turn = 1;
					}

					//Player collision
					if (collisionP == true) {
						s.updateScore(false);
						for (int i = 0; i < 5; i++) {
							StdDraw.show(0);
							StdDraw.clear();
							g.redraw();
							p.redraw();
							s.redraw();
							StdDraw.show();
							StdDraw.setPenColor(Color.BLUE);
							StdDraw.text(0.5, 0.95, "Player 2 POINT");
							StdDraw.pause(200);
							StdDraw.show(0);
							StdDraw.clear();
							g.redraw();
							p.redraw();
							s.redraw();
							StdDraw.show();
							StdDraw.pause(200);
						}
						turn = 1;
						if (s.getPlayer2() != points) {
							g = new GameBoard();
							heights = g.getStartHeights();
							p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
						}
					}

					//Condition if point limit reached
					if (s.getPlayer2() == points) {
						count = 0;
					}
				}
			}
		}
	}
}
