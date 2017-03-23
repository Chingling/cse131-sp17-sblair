package studio7;

public class Fraction {
	private int num, den;
	private Fraction f;
	
	public Fraction(int numerator, int denominator) {
		this.num = numerator;
		this.den = denominator;
	}
	
	public int getNumerator() {
		return this.num;
	}
	
	public int getDenominator() {
		return this.den;
	}
	
	public Fraction add(Fraction f) {
		int num = this.num * f.getDenominator() + this.den * f.getNumerator();
		int den = this.den * f.getDenominator();
		
		Fraction s = new Fraction(num, den);
		return s;
	}
	
	public Fraction mult(Fraction f) {
		int num = this.num * f.getNumerator();
		int den = this.den * f.getDenominator();
		Fraction s = new Fraction(num, den);
		
		return s;
	}
	
	public Fraction recip() {
		int num = this.den;
		int den = this.num;
		Fraction s = new Fraction(num, den);
		
		return s;
	}
	
	public Fraction simplify() {
		boolean [] array = new boolean [this.num];
		int [] simp = new int [this.num];
		for (int i = 0; i < this.num; i++) {
			if (this.num % (i+1) == 0) array[i] = true; 
		}
		
		for (int i = 0; i < this.num; i++) {
			if (this.den % (i+1) == 0 && array[i] == true) simp[i] = i+1;
		}
		
		int max = simp[0];
		for (int i = 1; i<simp.length; i++) {
			int check = simp[i];
			if (check > max) max = check;
		}
		
		int num = this.num/max;
		int den = this.den/max;
		
		Fraction s = new Fraction(num, den);
		return s;
	}
	
	public String toString() {
		return this.num + "/" + this.den;
	}
	
}
