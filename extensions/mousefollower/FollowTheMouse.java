package mousefollower;

import java.awt.Color;

import sedgewick.StdDraw;

public class FollowTheMouse {
	
	public static double [] getMousePosition() {
		double [] mouse = {StdDraw.mouseX(), StdDraw.mouseY()};
		return mouse;
	}
	
	public static void drawBall(double[] position, double radius) {
		StdDraw.filledCircle(position[0], position[1], radius);
	}

	public static double [] changePosition(double[] position, double[] mousePosition, double speed) {
		double [] next = position;
		
		if (mousePosition[0] > position[0]) next[0] = next[0] + speed;
		if (mousePosition[0] < position[0]) next[0] = next[0] - speed;
		if (mousePosition[1] > position[1]) next[1] = next[1] + speed;
		if (mousePosition[1] < position[1]) next[1] = next[1] - speed;
		
		return next;
	}
	
	public static void main(String[] args) {
		double [] ball = {0.5, 0.5};
		double speed = 0.01;
		double radius = 0.05;
		StdDraw.filledCircle(0.5, 0.5, radius);
		
		while (true) {
			StdDraw.clear();
			double [] mouse = getMousePosition();
			double [] next = changePosition(ball, mouse, speed);
			drawBall(next, radius);
			StdDraw.show(20);
		}

	}

}
