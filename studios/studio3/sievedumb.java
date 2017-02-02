package studio3;
import cse131.ArgsProcessor;
public class sievedumb {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int n = ap.nextInt("How big is the array?");
		
		boolean [] sieve = new boolean[n];
		System.out.print("Primes under " + n + " = ");
		
		for (int k = 0; k < sieve.length; k++) {
		for (int i = 2; i < sieve.length; i++) {
			for (int j = i; j < sieve.length; j++){ 
			if (k % i == 0) {
				sieve[j] = (false);
			}
			if (k % i !=0) {
				sieve[j] = (true);
			}
	}

}
		if (sieve[k] == false) {
			System.out.print(k + " ");
		}
		
		}
	}
}
