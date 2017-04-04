package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {

	final private LinkedList<Double> list;
	private Iterator<Double> iter;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		this.list = new LinkedList<Double>();
	}

	/**
	 * Converts Polynomial to String with highest order first and zero/zero powers omitted
	 */
	public String toString() {
		String result = "";
		for (int i = list.size() - 1; i > -1; i--) {
			if (i == list.size() - 1) {
				if (list.get(i) < 0) result = result + "-";
			}
			if (i != list.size() - 1) {
				if (list.get(i) > 0) result = result + " + ";
				if (list.get(i) < 0) result = result + " - ";
			}
			if (i == 0) {
				result = result + (int)(Math.abs(list.get(i)));
			}
			if (list.get(i) == 0) {

			}
			if (i != 0 && list.get(i) != 0) {
				result = result + (int)(Math.abs(list.get(i))) + "x^" + i;
			}
		}
		return result;
	}

	/**
	 * Adds a term as an order of x higher to the Polynomial
	 * @param coeff Coefficient of x term
	 * @return 
	 */
	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;  // required by lab spec
	}
	
	/**
	 * Get the coefficient at location i
	 * @param i index of list
	 * @return coefficient
	 */
	public double getTerm(int i) {
		return list.get(i);
	}
	
	/**
	 * Get the order of the Polynomial
	 * @return order
	 */
	public int getOrder() {
		return list.size();
	}

	/**
	 * Recursive helper for evaluate, generates sum of polynomial at certain x
	 * @param x coordinate
	 * @param sum sum of next level order x
	 * @param i iteration level
	 * @return sum of Polynomial recursively
	 */
	public double evalRec(double x, double sum, int i) {
		if (i == 0) return sum;
		double newSum = sum*x + list.get(i - 1);
		return evalRec(x, newSum, i-1);
	}
	
	public double ListIterator(double x, double sum) {
		if (iter.hasNext() == false) return sum;
		double newSum = sum*x + iter.next();
		return ListIterator(x, newSum);
	}
	
	/**
	 * Evaluate Polynomial at given x coordinate
	 * @param x co n    ordinate
	 * @return sum of Polynomial
	 */
	public double evaluate(double x) {
		if (list.size() == 0) return 0;
		this.iter = this.list.descendingIterator();
		iter.next();
//		int order = list.size()-1;
		return ListIterator(x, list.getLast());
	}

	/**
	 * Take the derivative of Polynomial
	 * @return Polynomial
	 */
	public Polynomial derivative() {
		Polynomial p = new Polynomial();
		for (int i = 1; i < list.size(); i++) {
			double term = list.get(i)*(i);
			p.addTerm(term);
		}
		
		return p;
	}

	/**
	 * Sum two Polynomials together
	 * @param another Second Polynomial to be summed
	 * @return Polynomial sum
	 */
	public Polynomial sum(Polynomial another) {
		Polynomial p = new Polynomial();
		if (list.size() > another.getOrder()) {
			for (int i = 0; i < another.getOrder(); i++) {
				p.addTerm(another.getTerm(i) + list.get(i));
			}
			for (int i = another.getOrder(); i < list.size(); i++) {
				p.addTerm(list.get(i));
			}
		}
		if (list.size() < another.getOrder()) {
			for (int i = 0; i < list.size(); i++) {
				p.addTerm(another.getTerm(i) + list.get(i));
			}
			for (int i = list.size(); i < another.getOrder(); i++) {
				p.addTerm(another.getTerm(i));
			}
		}
		if (list.size() == another.getOrder()) {
			for (int i = 0; i < list.size(); i++) {
				p.addTerm(another.getTerm(i) + list.get(i));
			}
		}
		return p;
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

}
