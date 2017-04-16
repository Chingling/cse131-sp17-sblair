package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class GameBoard implements CollidableObject {
	private double height;
	
	public GameBoard(double height) {
		this.height = height;
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, this.height/2, 0.5, this.height/2);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void redraw() {
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.5, this.height/2, 0.5, this.height/2);
	}
	
	public boolean checkCollision(double x, double y) {
		if (x > 1.0 || x < 0.0 || y < 0.10 || y > 1.0){
			return true;
		}
		else {
			return false;
		}
	}

}
