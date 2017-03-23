package studio7;

public class Rectangle {
	
	private double length, width;
	private Rectangle r;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*this.length + 2*this.width;
	}
	
	public boolean isSmaller(Rectangle r) {
		boolean check = true;
		if (this.length * this.width < r.getArea()) check = true;
		else check = false;
		return check;
	}
	
	public boolean isSquare() {
		boolean check = false;
		if (this.length == this.width) check = true;
		return check;
	}

}
