package studio7;

public class Die {
	private int sides;
	
	public Die(int n) {
		this.sides = n;
	}
	
	public int throwDie() {
		int die = (int)(Math.random()*this.sides) + 1;
		return die;
	}
	
}
