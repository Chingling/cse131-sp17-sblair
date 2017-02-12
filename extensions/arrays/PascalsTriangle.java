package arrays;
import cse131.ArgsProcessor;

public class PascalsTriangle {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int n = ap.nextInt("How many rows?");
		int trig[][] = new int[n][n];
		
		System.out.println("\tcolumn");
		System.out.print("\t");
		for (int i = 0; i < n; i ++){
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("row");
		for (int r = 0; r < trig.length; r++) {
			System.out.print(r + "\t");
			for (int c = 0; c < trig[r].length; c++) {
				if (c == 0 || c == r) {
					trig[r][c] = 1;
				}
				if (r < 0 || c < 0 || c > r) {
					trig[r][c] = 0;
				}
				if (r > 0 && c > 0 && c < r) {
					trig[r][c] = trig[r-1][c] + trig[r-1][c-1];
				}
				if (trig[r][c] != 0) {
				System.out.print(trig[r][c] + " ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
