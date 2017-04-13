package sadcycle;

import java.util.HashSet;
import java.util.Set;

import cse131.ArgsProcessor;

public class SadCycler {
	
	private Set<Long> happy;
	
	public SadCycler() {
		this.happy = new HashSet<Long>();
	}
	
	public Set<Long> findCycle(int base, long n) {
		if (this.happy.contains(n)) return this.happy;
		this.happy.add(n);
		Long a = n;
		String holder = a.toString();
		char charArray [] = new char [holder.length()];
		int digits [] = new int [holder.length()];
		for (int i = 0; i < holder.length(); i++) {
			char charHolder = holder.charAt(i);
			String stringHolder = Character.toString(charHolder);
			digits[i] = Integer.parseInt(stringHolder);
		}
		long sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum = sum + (long)Math.pow(digits[i], base);
		}
		if (sum == 1) {
			this.happy = new HashSet<Long>();
			this.happy.add((long)1);
			return this.happy;
		}
		return findCycle(base, sum);
		
	}

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int base = ap.nextInt("Base");
		long n = (long)ap.nextInt("Number");
		SadCycler s = new SadCycler();
		Set<Long> result = s.findCycle(base, n);
		System.out.println(result.toString());
	}

}
