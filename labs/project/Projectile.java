package project;

import sedgewick.StdDraw;

public class Projectile {
	private double angle, velocityX, velocityY, time, dtime;
	
	public Projectile(double angle, double velocity) {
		this.angle = angle;
		this.velocityX = velocity/10 * Math.cos(angle * (Math.PI/180));
		this.velocityY = velocity/10 * Math.sin(angle * (Math.PI/180));
		this.time = 0;
		this.dtime = 0.0005;
	}
	
	public double updateX(double x) {
		return x + (velocityX*dtime);
	}
	
	public double updateY(double y) {
		this.velocityY = this.velocityY - (9.81*dtime);
		return y + (this.velocityY*dtime);
	}
	
	
	//return 0 if nothing hit, 1 if player1 hit, 2 if player2 hit
	public int throwP(boolean player1) {
		if (player1 == true) {
			double initX = 0.08;
			double initY = 0.12;
			StdDraw.filledCircle(0.08, 0.12, 0.002);
			while(updateX(initX) < 1.0 && updateY(initY) > 0.10 || (updateX(initX) <= 0.92 && updateX(initX) >=0.94 && updateY(initY) >= 0.12)){
				double nextX = updateX(initX);
				System.out.println(nextX);
				double nextY = updateY(initY);
				System.out.println(nextY);
				StdDraw.filledCircle(nextX, nextY, 0.002);
				initX = nextX;
				initY = nextY;
			}
			if (initX >= 0.92 && initX <= 0.94 && initY >= 0.10 && initY <= 0.12) return 2;	
		}
		else if (player1 == false) {
			double initX = 0.92;
			double initY = 0.12;
			StdDraw.filledCircle(0.92, 0.12, 0.005);
			while(updateX(initX) < 1.0 && updateY(initY) > 0.10){
				double nextX = updateX(initX);
				System.out.println(nextX);
				double nextY = updateY(initY);
				System.out.println(nextY);
				StdDraw.filledCircle(nextX, nextY, 0.002);
				initX = nextX;
				initY = nextY;
			}
			if (initX > 0.92 && initX < 0.94 && initY > 0.10 && initY < 0.12) return 1;
		}
		return 0;
		
	}
}
