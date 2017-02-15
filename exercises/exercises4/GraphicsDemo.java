package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.5, 0.5);
		
		// larger green point
		StdDraw.setPenRadius(0.1);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.point(0.8,  0.8);
		
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0);
		double trigx[] = {0.1, 0.1, 0.2};
		double trigy[] = {0.1, 0.3, 0.2};
		StdDraw.polygon(trigx, trigy);
		
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.2, 0.8, 0.1);
		
		// filled blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledSquare(0.6, 0.6, 0.1);
		


	}

}
