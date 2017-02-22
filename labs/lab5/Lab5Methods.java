package lab5;

public class Lab5Methods {

/**Sum of the positive integers n + (n-2) + (n-4)...*/
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
	
/**Sum of 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n*/
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
/**Sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,k)*/
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
/**Product of positive j and k values*/
	public static int multPos(int j, int k) {
		int ans = 0;
		
		for (int i = 0; i < k; i++) {
			ans = ans + j;
		}
		
		return ans;
	}
/**Product of j and k including sign*/
	public static int mult(int j, int k) {
		int ans = multPos(Math.abs(j), Math.abs(k));

		if ((j > 0 && k < 0) || (j < 0 && k > 0)) {
			ans = -ans;
		}
		
		return ans;
	}
/**Value of n^k*/	
	public static int expt(int n, int k) {
		int ans = 1;
		
		for (int i = 0; i < k; i++) {
			ans = ans * n;
		}
		
		return ans;
	}

}
