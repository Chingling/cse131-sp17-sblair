package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// here, the mouse has been pressed
		StdDraw.text(0.05, 0.95, "Pressed");
		while (StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		
		// here the mouse is released
		StdDraw.clear();
		StdDraw.text(0.05, 0.95, "Released");
		
		// draw a point at the location of the mouse
		StdDraw.setPenRadius(0.05);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());
		
		char key = 'a';
		while (key != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(100);
			}
			key = StdDraw.nextKeyTyped();
		}
		// here, a q has been typed
		
		
		StdDraw.text(0.5, 0.5, "You suck!");

	}

}
