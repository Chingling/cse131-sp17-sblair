package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GorillasMain {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		//Start screen
		StdDraw.text(0.5, 0.5, "GORILLAS");
		//StdDraw.pause(1500);
		int points = ap.nextInt("How many points to win?");
		StdDraw.clear();

		//Show Player positions
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(0.10, 0.50, "Player 1");
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.text(0.90, 0.50, "Player 2");

		//Initialize Ground, Players, and Score
		GameBoard g = new GameBoard(0.10);
		Players p = new Players(0.07, 0.93, 0.11);
		Score s = new Score();
		//StdDraw.pause(2000);

		//Redraw all elements to begin game-play
		StdDraw.clear();
		g.redraw();
		p.redraw();
		s.redraw();

		//Main game loop
		int count = 1;
		while (count == 1) {

			double initX = 0.081;
			double initY = 0.121;
			int turn = 1;

			//Player 1

			StdDraw.clear();
			g.redraw();
			p.redraw();
			s.redraw();
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(0.10, 0.50, "Player 1");

			double angle = ap.nextDouble("Player 1: Angle");
			double velocity = ap.nextDouble("Player 1: Velocity");
			Projectile r = new Projectile(angle, velocity);
			
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
				if (collisionG == true) {
					System.out.println("Ground");
					StdDraw.setPenColor(Color.BLACK);
					StdDraw.text(0.5, 0.5, "Miss!");
					turn = 2;
					StdDraw.pause(1500);
				}
				if (collisionP == true) {
					System.out.println("Player");
					s.updateScore(true);
					turn = 2;
				}
				if (s.getPlayer1() == points) {
					count = 0;
				}
			}

			StdDraw.clear();
			g.redraw();
			p.redraw();
			s.redraw();
			
			if (count == 1) {
				initX = 0.919;
				initY = 0.119;

				//Player 2
				StdDraw.setPenColor(Color.BLUE);
				StdDraw.text(0.90, 0.50, "Player 2");

				angle = ap.nextDouble("Player 2: Angle");
				velocity = ap.nextDouble("Player 2: Velocity");
				r = new Projectile(angle, velocity);
				StdDraw.clear();
				g.redraw();
				p.redraw();
				s.redraw();

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
					if (collisionG == true) {
						System.out.println("Ground");
						StdDraw.setPenColor(Color.BLACK);
						StdDraw.text(0.5, 0.5, "Miss!");
						turn = 1;
						StdDraw.pause(1500);
					}
					if (collisionP == true) {
						System.out.println("Player");
						s.updateScore(false);
						turn = 1;
					}
					if (s.getPlayer2() == points) {
						count = 0;
					}
				}
			}
		}

	}

}
