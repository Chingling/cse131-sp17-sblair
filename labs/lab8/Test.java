package lab8;

import java.util.LinkedList;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		Polynomial p = new Polynomial();
		p.addTerm(4);
		p.addTerm(-7);
		p.addTerm(0);
		p.addTerm(11);
		System.out.println(p);
	}

}
