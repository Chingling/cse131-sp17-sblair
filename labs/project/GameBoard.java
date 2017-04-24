package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class GameBoard implements CollidableObject {
	private double [] height;
	private int [] colors;
	private Color [] palette;

	public GameBoard() {
		double [] height = new double [5];
		int [] colors = new int [5];
		this.height = height;
		this.colors = colors;
		Color [] palette = {StdDraw.BLACK, StdDraw.CYAN, StdDraw.GRAY, StdDraw.GREEN, StdDraw.ORANGE};
		this.palette = palette;
		for (int i = 0; i < this.height.length; i++) {
			this.height[i] = Math.random()*0.75;
			this.colors[i] = (int)(Math.random() * 5);
			StdDraw.setPenColor(this.palette[this.colors[i]]);
			StdDraw.filledRectangle((i * 0.2) + 0.1, this.height[i]/2, 0.1, this.height[i]/2);
		}

	}

	/**
	 * Obtain the heights of both Player platforms
	 * @return Array of heights for Player 1 and Player 2 platforms
	 */
	public double [] getStartHeights() {
		double [] heights = {this.height[0], this.height[4]};
		return heights;
	}

	/**
	 * Redraw game board skyline
	 */
	public void redraw() {
		for (int i = 0; i < this.height.length; i++) {
			StdDraw.setPenColor(this.palette[this.colors[i]]);
			StdDraw.filledRectangle((i * 0.2) + 0.1, this.height[i]/2, 0.1, this.height[i]/2);
		}
	}

	/**
	 * Check for collision with GameBoard object in accordance to CollidableObject
	 */
	public boolean checkCollision(double x, double y) {
		if (x > 1.0 || x < 0.0 || y < 0.0){
			return true;
		}
		else {

			for (int i = 0; i < this.height.length; i++) {
				System.out.println("hi");
				double left = (0.2 * i);
				double right = ((0.2 * i) + 0.2);
				double top = this.height[i];
				System.out.println(left);
				System.out.println(right);
				System.out.println(top);
				if (x >= left && x < right && y <= top ) {
					return true;
				}
			}
		}
		return false;
	}

}
