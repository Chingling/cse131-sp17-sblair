package project;

import java.awt.Color;

import sedgewick.StdDraw;

public class Projectile {
	private double angle, velocityX, velocityY, time, dtime;

	public Projectile(double angle, double velocity) {
		this.angle = angle;
		this.velocityX = velocity/10 * Math.cos(angle * (Math.PI/180));
		this.velocityY = velocity/10 * Math.sin(angle * (Math.PI/180));
		this.time = 0;
		this.dtime = 0.001;
	}

	public double updateXOne(double x) {
		return x + (velocityX*dtime);
	}
	
	public double updateXTwo(double x) {
		return x + (-velocityX*dtime);
	}

	public double updateY(double y) {
		this.velocityY = this.velocityY - (9.81*dtime);
		return y + (this.velocityY*dtime);
	}


	//return 0 if nothing hit, 1 if player1 hit, 2 if player2 hit
	public double [] throwP(boolean player1, double initX, double initY) {
		
		if (player1 == true) {
			
			StdDraw.setPenColor(Color.RED);
			StdDraw.filledCircle(initX, initY, 0.004);
			double next [] = {updateXOne(initX), updateY(initY)};
			return next;
		}
		else {

			StdDraw.setPenColor(Color.BLUE);
			StdDraw.filledCircle(initX, initY, 0.004);
			double next [] = {updateXTwo(initX), updateY(initY)};
			return next;
		}

	}
}
