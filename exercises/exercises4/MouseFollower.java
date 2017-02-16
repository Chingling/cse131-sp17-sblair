package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Level of mouse tracking (1 is the highest)");
		double arrayx[] = new double[n];
		double arrayy[] = new double[n];
		int a = 0;
		
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			
			arrayx[a] = x;
			arrayy[a] = y;
			a = a + 1;
			
			if (a >= arrayx.length) {
				a = 0;
			}
			
			int old = a;
			
			StdDraw.setPenRadius(0.05);
			StdDraw.point(arrayx[old], arrayy[old]);
			
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
