package project;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

import sedgewick.StdDraw;

public class Powerup implements CollidableObject {

	private List<Double> x, y;
	private List<Integer> type;
	private Color [] color;

	public Powerup() {
		List<Double> x = new LinkedList<Double>();
		List<Double> y = new LinkedList<Double>();
		List<Integer> type = new LinkedList<Integer>();
		Color [] color = {StdDraw.BLACK, StdDraw.ORANGE, StdDraw.GREEN};
		this.x = x;
		this.y = y;
		this.type = type;
		this.color = color;
	}

	public void random() {
		if (Math.random() < 0.70 && this.x.size() <= 2) {
			double xCoord = (Math.random() * 0.80) + 0.10;
			double yCoord = (Math.random() * 0.70) + 0.20;
			int type = (int)((Math.random() * 3));
			this.x.add(xCoord);
			this.y.add(yCoord);
			this.type.add(type);
			StdDraw.setPenColor(color[type]);
			StdDraw.filledSquare(xCoord, yCoord, 0.02);
		}
	}

	public void redraw() {
		for (int i = 0; i < x.size(); i++) {
			StdDraw.setPenColor(color[this.type.get(i)]);
			StdDraw.filledSquare(this.x.get(i), this.y.get(i), 0.02);
		}
		System.out.println(x);
	}

	public boolean checkCollision(double x, double y) {
		for (int i = 0; i < this.x.size(); i++) {

			if ((x >= (this.x.get(i) - 0.02)) && (x <= (this.x.get(i) + 0.02)) && (y >= (this.y.get(i) - 0.02)) && (y <= (this.y.get(i) + 0.02))) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	
	public int getType(double x, double y) {
		int type = 0;
		for (int i = 0; i < this.x.size(); i++) {
			if ((x >= (this.x.get(i) - 0.02)) && (x <= (this.x.get(i) + 0.02)) && (y >= (this.y.get(i) - 0.02)) && (y <= (this.y.get(i) + 0.02))) {
				type = this.type.get(i);
				this.x.remove(i);
				this.y.remove(i);
				this.type.remove(i);
			}
		}
		return type;
	}
}
