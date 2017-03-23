package studio7;

public class Complex {
	private double real, imag;
	private Complex c;
	
	public Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	public Complex add(Complex c) {
		double real = this.real + c.getReal();
		double imag = this.imag + c.getImag();
		
		Complex s = new Complex(real, imag);
		return s;
	}
	
	public Complex mult(Complex c) {
		double real = this.real*c.getReal() - this.imag*c.getImag();
		double imag = this.real*c.getImag() + this.imag*c.getReal();
		
		Complex s = new Complex(real, imag);
		return s;
	}
	
	public String toString() {
		if (this.imag < 0) return this.real + "-" + this.imag + "i";
		
		return this.real + "+" + this.imag + "i";
	}
}
