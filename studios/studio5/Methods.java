package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y; 
	}
	
	
	/**
	 * 
	 * @param x one number
	 * @param y another number
	 * @param z yet another number
	 * @return the average of the numbers
	 */
	public static double avg3(double x, double y, double z){
		return (x+y+z)/3;
	}

	/**\
	 * 
	 * @param sumthing array of doubles
	 * @return sum of array of doubles
	 */
	public static double sumArray(double[] sumthing){
		double sum=0;
		for(int i=0; i<sumthing.length;i++){
			sum = sum + sumthing[i];
		}
		return sum;
	}
	/**
	 * 
	 * @param sumthing array of doubles
	 * @return average of array of doubles
	 */
	public static double average(double[] sumthing){
		double sum = sumArray(sumthing);
		return sum/sumthing.length;
	}
	
	/**
	 * 
	 * @param s String of word
	 * @return piglatin version of word
	 */
	public static String pig(String s){
		return s.substring(1) + s.substring(0,1) +"ay";
	}

}
