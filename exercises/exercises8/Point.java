package exercises8;

import java.util.HashSet;
import java.util.Set;

public class Point {

	private final int x, y;


	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}


	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	public static void main(String[] args) {
//		Point x = new Point(1,2);
//		Point y = new Point(2,3);
//		System.out.println(x);
//		System.out.println(y);

		Set<Point> set = new HashSet<Point>();
		set.add(new Point(131, 132));
		set.add(new Point(131,132));
		System.out.println("Set has " + set);
	}
	
	



	@Override
	public int hashCode() {
	    return 0;
	 }


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}



}
