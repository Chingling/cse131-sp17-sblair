package lab5;

public class Lab5Methods {

	public static int sumDownBy2(int n) {
		int ans = n;
		int check = n - 2;
		int i = 1;
		while (check > 0) {
			ans = ans + (n - (2 * i));
			check = check - 2;
			i = i + 1;
		}
		return ans;
	}
	
	public static double harmonicSum(int n) {
		double ans = 1;
		int check = n;
		int i = 2;
		while (check > 1) {
			ans = ans + (1.0 / (i));
			check = check - 1;
			i = i + 1;
		}
		
		return ans;
	}
	
	public static double geometricSum(int k) {
		double ans = 1;
		int check = k;
		int i = 1;
		while (check > 0) {
			ans = ans + (1.0 / Math.pow(2, i));
			check = check - 1;
			i = i + 1;
		}
		return ans;
	}

	public static int multPos(int j, int k) {
		int ans = 0;
		
		for (int i = 0; i < k; i++) {
			ans = ans + j;
		}
		
		return ans;
	}
	
	public static int mult(int j, int k) {
		int ans = multPos(Math.abs(j), Math.abs(k));

		if ((j > 0 && k < 0) || (j < 0 && k > 0)) {
			ans = -ans;
		}
		
		return ans;
	}
	
	public static int expt(int n, int k) {
		int ans = 1;
		
		for (int i = 0; i < k; i++) {
			ans = ans * n;
		}
		
		return ans;
	}

}
