package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Players implements CollidableObject {
	private double oneX, twoX, oneY, twoY;

	public Players(double oneX, double twoX, double oneY, double twoY) {
		this.oneX = oneX;
		this.twoX = twoX;
		this.oneY = oneY;
		this.twoY = twoY;
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(this.oneX, this.oneY, 0.01);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(this.twoX, this.twoY, 0.01);
	}

	/**
	 * Redraw player scores
	 */
	public void redraw() {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledSquare(this.oneX, this.oneY, 0.01);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(this.twoX, this.twoY, 0.01);
	}

	/**
	 * Take in x-coordinate and y-coordinate of projectile and determine if it has collided with the Player or not
	 * @param x x-coordinate of projectile
	 * @param y y-coordinate of projectile
	 * @return True for collision, false for no collision
	 */
	public boolean checkCollision(double x, double y) {
		if ((x >= (this.twoX - 0.01)) && (x <= (this.twoX + 0.01)) && (y >= (this.twoY - 0.01)) && (y <= (this.twoY + 0.01))) {
			return true;
		}
		if (x >= this.oneX - 0.01 && x <= this.oneX + 0.01 && y >= this.oneY - 0.01 && y <= this.oneY + 0.01) {
			return true;
		}
		else {
			return false;
		}
	}
}