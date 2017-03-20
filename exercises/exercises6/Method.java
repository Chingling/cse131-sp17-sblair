package exercises6;

import java.util.Arrays;

public class Method {

	public static void reverse(int[] array) {
		for (int i = 0; i < array.length/2; i++) {
			if (i == array.length-i-1) ;

			else {

				int first = array[i];
				int second = array[array.length-i-1];

				array[i] = second;
				array[array.length-i-1] = first;
			}
		}
	}

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println(Arrays.toString(array));
	}

}
