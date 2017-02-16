package studio3;
import cse131.ArgsProcessor;
public class sieve {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int n = ap.nextInt("How big is the array?");
		
		int [] sieve = new int[n];
		System.out.print("Primes under " + n + " = ");
		
		for (int i = 0; i < sieve.length - 1; i++) {
			sieve[i] = (i + 2);
		}

		for (int k = 0; k < sieve.length; k++) {
		for (int i = 2; i < sieve.length; i++) {
			for (int j = i; j < sieve.length; j++){ 
			if (sieve[j] % (i) == 0) {
				sieve[j] = (0);
			}
			
		}
			
		}
		if (sieve[k] != 0){
		System.out.print(sieve[k] + " ");
		}
		}
		
		
		

	}

}
