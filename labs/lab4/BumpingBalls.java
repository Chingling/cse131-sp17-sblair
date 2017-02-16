package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int speed = ap.nextInt("What speed? 15 is optimal (higher is slower)");
		int balls = -1;
		while (balls < 0) {
			balls = ap.nextInt("How many balls?");
		}
		double radius = ap.nextDouble("What radius? (0.05 is optimal)"); //0.05;
        // Set coordinate plane
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        
        // Initial values
        double dx[] = new double [balls];
        double dy[] = new double [balls];
        double vx[] = new double [balls];
        double vy[] = new double [balls];
        
        for (int i = 0; i < balls; i++) {
        	dx[i] = 2 * (Math.random() - 0.5 + radius);
        	dy[i] = 2 * (Math.random() - 0.5 + radius);
        	vx[i] = Math.random() / 40.0;
        	vy[i] = Math.random() / 40.0;
        }

        // Main loop
        while (true)  { 

            
        	for (int i = 0; i < balls; i++) {
        		
        		//Determine ball to ball collisions
        		for (int j = 1; j < balls; j++) {
        			if (i == j) {
        			}
        			else {
        				double distance = Math.sqrt(Math.pow((dx[i] - dx[j]), 2) + Math.pow((dy[i] - dy[j]), 2));
        			
        				if (distance <= 2 * radius && vx[i] != vx[j] && vy[i] != vy[j]) {
        					
        					if (dx[j] > dx[i]) {
        						dx[i] = dx[i] - ((2 * radius) - distance);
        					}
        					if (dy[j] > dy[i]) {
        						dy[i] = dy[i] - ((2 * radius) - distance);
        					}
        					if (dx[j] < dx[i]) {
        						dx[i] = dx[i] + ((2 * radius) - distance);
        					}
        					if (dx[j] < dx[i]) {
        						dx[i] = dx[i] + ((2 * radius) - distance);
        					}
        					
        					
        					
        					double oldX = vx[i];
        					double oldY = vy[i];
        					vx[i] = vx[j];
        					vy[i] = vy[j];
        					vx[j] = oldX;
        					vy[j] = oldY;
        					
        					StdAudio.play("sound/obamaout.au");
        					
        				}

        			}
        		}
        		
        		// Wall Bounce
        		
        		if (Math.abs(dx[i] + vx[i]) > 1.0) {
        			dx[i] = 1 - radius - vx[i];
        		}
        		if (Math.abs(dy[i] + vy[i]) > 1.0) {
        			dy[i] = 1 - radius - vy[i];
        		}
        		
        		if (Math.abs(dx[i] + vx[i]) > 1.0 - radius) {
        			vx[i] = -vx[i];
        		}
        		if (Math.abs(dy[i] + vy[i]) > 1.0 - radius) {
        			vy[i] = -vy[i];
        		}
        	
        		

        		// Update position
        		dx[i] = dx[i] + vx[i]; 
        		dy[i] = dy[i] + vy[i]; 
        	
        		
        	}
        	
            // Clear background
        	StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(0, 0, 1.0);

            // Draw Ball
            StdDraw.setPenColor(StdDraw.RED);
            for (int i = 0; i < balls; i++) {
            	StdDraw.filledCircle(dx[i], dy[i], radius); 
            	StdDraw.picture(dx[i], dy[i], "images/obamaface.png", radius + 0.1, radius + 0.1);
            }
            
            //Show frame
            StdDraw.show(speed);
            
            
        }
	}
}
