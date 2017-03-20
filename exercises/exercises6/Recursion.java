package exercises6;

import java.util.Arrays;

public class Recursion {

	public static void reverse(int[] array, int i) {
		if (i > array.length/2 - 1) ;

		else {
			int first = array[i];
			int second = array[array.length-i-1];
			array[i] = second;
			array[array.length-i-1] = first;

			reverse(array,i+1);
		}
	}

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(Arrays.toString(array));
		reverse(array,0);
		System.out.println(Arrays.toString(array));
	}

}
