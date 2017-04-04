package lab8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		Polynomial p = new Polynomial();
		LinkedList<Double> list = new LinkedList<Double>();
		list.add(7.0);
		list.add(5.0);
		list.add(-2.0);
		list.add(5.0);
		System.out.println(list);
		Iterator<Double> iter = list.descendingIterator();
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
//		System.out.println(iter.next());
	}

}
