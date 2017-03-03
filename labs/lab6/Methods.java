package lab6;
import cse131.ArgsProcessor;
public class Methods {
	
	public static int f(int x) {
		if (x > 100) {
			return x - 10;
		}
		else {
			return f(f(x+11));
		}
	}
	
	public static int g(int x, int y) {
		if (x == 0) {
			return y + 1;
		}
		if (x > 0 && y == 0) {
			return g(x-1, 1);
		}
		else {
			return g(x-1, g(x, y-1));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int choice = ap.nextInt("f or g (1 or 2)?");
		
		if (choice == 1) {
			int x = ap.nextInt("What is the x for f?");
			System.out.println(f(x));
		}
		
		if (choice == 2) {
			int y = ap.nextInt("What is the x for g?");
			int z = ap.nextInt("What is the y for g?");
			System.out.println(g(y,z));
		}
		
		
	}

}
