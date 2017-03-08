package magicball;
import java.awt.Color;
import java.awt.Font;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;
public class Ball {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//String question = ap.nextString("Ask your question...");
		
		double random = 3*Math.random();
		String answer = null;
		
		if (random < 1) answer = "It is certain";
		if (random > 1 && random < 2) answer = "Ask again later";
		if (random > 2) answer = "Not likely";
		
		Font small = new Font("Sans Serif",5, 10);
		StdDraw.setFont(small);
		StdDraw.setPenColor(Color.black);
		StdDraw.filledCircle(0.5, 0.5, 0.5);
		StdDraw.setPenColor(Color.white);
		StdDraw.circle(0.5, 0.5, 0.2);
		
		double [] x = {0.37, 0.5, 0.63};
		double [] y = {0.60, 0.36, 0.60};
		
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < 255; i++) {
			StdDraw.setPenColor(new Color (a,0,c));
			StdDraw.filledPolygon(x, y);
			StdDraw.setPenColor(new Color (a,b,c));
			StdDraw.text(0.515, 0.515, answer, 45);
			StdDraw.pause(5);
			a = a + 1;
			b = b + 1;
			c = c + 1;
		}

	}

}
