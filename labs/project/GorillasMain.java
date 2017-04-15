package project;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class GorillasMain {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//Start screen
		StdDraw.text(0.5, 0.5, "GORILLAS");
//		StdDraw.pause(1500);
//		int points = ap.nextInt("How many points to win?");
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
//		StdDraw.pause(2000);
		
		//Redraw all elements to begin game-play
		StdDraw.clear();
		g.redraw();
		p.redraw();
		s.redraw();
		
		//Main game loop
		StdDraw.setPenColor(Color.RED);
		StdDraw.text(0.10, 0.50, "Player 1");
		
		double angle = ap.nextDouble("Player 1: Angle");
		double velocity = ap.nextDouble("Player 1: Velocity");
		Projectile r = new Projectile(angle, velocity);
		int hit = r.throwP(true);
		if (hit == 2) {
			StdDraw.text(0.5, 0.5, "Player 1 Point");
			s.updateScore(true);
		}
		if (hit == 0) {
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(0.5, 0.5, "No point");
		}
		StdDraw.pause(750);
		StdDraw.clear();
		g.redraw();
		p.redraw();
		s.redraw();
		

	}

}
