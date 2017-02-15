package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int speed = ap.nextInt("What speed? (higher is slower)");
		int balls = -1;
		while (balls < 0) {
			balls = ap.nextInt("How many balls?");
		}
        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        // initial values
        double dx[] = new double [balls];
        double dy[] = new double [balls];
        double vx[] = new double [balls];
        double vy[] = new double [balls];
        
        for (int i = 0; i < balls; i++) {
        	dx[i] = Math.random();
        	dy[i] = Math.random();
        	vx[i] = Math.random() / 40.0;
        	vy[i] = Math.random() / 40.0;
        }
        
        double radius = 0.05;

        // main animation loop
        while (true)  { 

            
        	for (int i = 0; i < balls; i++) {
        		// bounce off wall according to law of elastic collision
        		
        		for (int j = 1; j < balls; j++) {
        			if (i == j) {
        			}
        			else {
        				double distance = Math.sqrt(Math.pow((dx[i] - dx[j]), 2) + Math.pow((dy[i] - dy[j]), 2));
        			
        				if (distance <= 2 * radius && vx[i] != vx[j] && vy[i] != vy[j]) {
        					System.out.println(distance);
        					double oldX = vx[i];
        					double oldY = vy[i];
        					vx[i] = vx[j];
        					vy[i] = vy[j];
        					vx[j] = oldX;
        					vy[j] = oldY;
        				}

        			}
        		}
        		
        		if (Math.abs(dx[i] + vx[i]) > 1.0 - radius) {
        			vx[i] = -vx[i];
        		}
        		if (Math.abs(dy[i] + vy[i]) > 1.0 - radius) {
        			vy[i] = -vy[i];
        		}
        	
        		

        		// update position
        		dx[i] = dx[i] + vx[i]; 
        		dy[i] = dy[i] + vy[i]; 
        	
        		
        	}
        	
            // clear the background
        	StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(0, 0, 1.0);

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.RED);
            for (int i = 0; i < balls; i++) {
            	StdDraw.filledCircle(dx[i], dy[i], radius); 
            }
            
            // higher pause for slower speed
            StdDraw.show(speed); 
        } 
		
	}

}
