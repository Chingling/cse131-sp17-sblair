package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GorillasMain {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//Start screen and get points to win
		StdDraw.text(0.5, 0.5, "GORILLAS");
		StdDraw.pause(1500);
		int points = ap.nextInt("How many points to win?");
		StdDraw.clear();

		//Show Player positions
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(0.10, 0.80, "Player 1");
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(0.90, 0.80, "Player 2");

		//Initialize Ground, Players, and Score
		GameBoard g = new GameBoard();
		double [] heights = g.getStartHeights();
		Players p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
		Score s = new Score();
		StdDraw.pause(2000);

		//Redraw all elements to begin game-play
		StdDraw.clear();
		g.redraw();
		p.redraw();
		s.redraw();

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
			StdDraw.clear();
			g.redraw();
			p.redraw();
			s.redraw();
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(0.10, 0.80, "Player 1");

			//Get Player inputs for projectile
			double angle = ap.nextDouble("Player 1: Angle");
			double velocity = ap.nextDouble("Player 1: Velocity");
			Projectile r = new Projectile(angle, velocity);

			//Projectile throw loop
			while (turn == 1) {
				double [] coord = r.throwP(true, initX, initY);
				initX = coord[0];
				initY = coord[1];
				StdDraw.show(2);
				StdDraw.clear();
				g.redraw();
				p.redraw();
				s.redraw();
				StdDraw.show();

				boolean collisionP = p.checkCollision(initX, initY);
				boolean collisionG = g.checkCollision(initX, initY);

				//Ground collision
				if (collisionG == true) {
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.text(0.5, 0.95, "Miss!");
					turn = 2;
					StdDraw.pause(1500);
				}
				
				//Player collision
				if (collisionP == true) {
					s.updateScore(true);
					turn = 2;
					g = new GameBoard();
					heights = g.getStartHeights();
					p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
				}
				
				//Condition if point limit reached
				if (s.getPlayer1() == points) {
					count = 0;
				}
			}

			//Redraw
			StdDraw.clear();
			g.redraw();
			p.redraw();
			s.redraw();

		//Player 2
			
			if (count == 1) {
				
				//Initialization
				initX = 0.95 - 0.02;
				initY = heights[1] + 0.02;
				turn = 2;
				StdDraw.clear();
				g.redraw();
				p.redraw();
				s.redraw();
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.text(0.90, 0.80, "Player 2");

				//Get Player inputs for projectile
				angle = ap.nextDouble("Player 2: Angle");
				velocity = ap.nextDouble("Player 2: Velocity");
				r = new Projectile(angle, velocity);
				StdDraw.clear();
				g.redraw();
				p.redraw();
				s.redraw();

				//Projectile throw loop
				while (turn == 2) {
					double [] coord = r.throwP(false, initX, initY);
					initX = coord[0];
					initY = coord[1];
					StdDraw.show(2);
					StdDraw.clear();
					g.redraw();
					p.redraw();
					s.redraw();
					StdDraw.show();

					boolean collisionP = p.checkCollision(initX, initY);
					boolean collisionG = g.checkCollision(initX, initY);
					
					//Ground collision
					if (collisionG == true) {
						StdDraw.setPenColor(Color.BLACK);
						StdDraw.text(0.5, 0.95, "Miss!");
						turn = 1;
						StdDraw.pause(1500);
					}
					
					//Player collision
					if (collisionP == true) {
						s.updateScore(false);
						turn = 1;
						g = new GameBoard();
						heights = g.getStartHeights();
						p = new Players(0.05, 0.95, heights[0] + 0.01, heights[1] + 0.01);
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
