package lab6;
import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {

	public static void trig(double x,double y,double z,double a,double b,double c,double d) {
		

		if (d < 0.025) {
			return;
		}
		
		double lengthX = Math.abs(z - x);
		double lengthY = Math.abs(a - b);
		
		double whiteX [] = {(x+y)/2, (y+z)/2, (z+x)/2};
		double whiteY [] = {(a+b)/2, (b+c)/2, c};
		
		//StdDraw.clear();
		StdDraw.filledPolygon(whiteX, whiteY);
		System.out.println(x + " " + y + " " + z + " " + a + " " + b + " " + c + " " + d);
		StdDraw.pause(5);
		
		trig(x,whiteX[0],whiteX[2],a,whiteY[0],whiteY[2],d/2); //lower left
		System.out.println("Done ll");
		trig(whiteX[0],y,whiteX[1],whiteY[0],b,whiteY[1],d/2); //upper
		System.out.println("Done up");
		trig(whiteX[2],whiteX[1],z,whiteY[2],whiteY[1],c,d/2); //lower right
		System.out.println("Done lr");
		
	}

	public static void main(String[] args) {
		double blackX [] = {0, 0.5, 1};
		double blackY [] = {0, Math.sqrt(3)/2, 0};
		double x = 0.0;
		double y = 0.5;
		double z = 1.0;
		double a = 0.0;
		double b = Math.sqrt(3)/2;
		double c = 0.0;
		double d = 1.0;
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledPolygon(blackX, blackY);
		StdDraw.setPenColor(Color.white);
		
		//StdDraw.show(10);
		trig(x,y,z,a,b,c,d);
		//StdDraw.show(10);
	}

}
