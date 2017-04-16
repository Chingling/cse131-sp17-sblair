package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Players {
	private double oneX, twoX, bothY;

	public Players(double oneX, double oneY, double bothY) {
		this.oneX = oneX;
		this.twoX = oneY;
		this.bothY = bothY;
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(this.oneX, this.bothY, 0.01);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(this.twoX, this.bothY, 0.01);
	}

	public void redraw() {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(this.oneX, this.bothY, 0.01);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(this.twoX, this.bothY, 0.01);
	}

	public boolean checkCollision(double x, double y) {
		if (x >= 0.92 && x <= 0.94 && y >= 0.10 && y <= 0.12) {
			return true;
		}
		if (x >= 0.06 && x <= 0.08 && y >= 0.10 && y <= 0.12) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
