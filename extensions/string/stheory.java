package string;
import cse131.ArgsProcessor;
public class stheory {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//String s = "21 + 33";
		String s = ap.nextString("What is the operation? (int operator int)");
		char charArray [] = new char [s.length()];
		int intArray [] = new int [s.length()];
		char operator = ' ';
		System.out.println("Input: " + s);
		
		int i = 0;
		while (i < s.length()) {
			charArray[i] =  s.charAt(i);
			if (Character.isDigit(charArray[i])) {
				String holder = Character.toString(charArray[i]);
				intArray[i] = Integer.parseInt(holder);
			}
			
			if (Character.isWhitespace(charArray[i])) {
			}
			
			if (!Character.isDigit(charArray[i]) && operator == ' ') {
				operator = charArray[i];
				intArray[i] = 0;
			}
			i = i + 1;
		}
		
		for (int j = 0; j < intArray.length; j++) {
		}
		
		String firstHolder = "";
		String secondHolder = "";
		
		int k = 0;
		while (intArray[k] != 0) {
			firstHolder = firstHolder + intArray[k];
			k = k + 1;
		}
		k = k + 3;
		while (k < intArray.length) {
			secondHolder = secondHolder + intArray[k];
			k = k + 1;
		}
	
		int firstInt = Integer.parseInt(firstHolder);
		int secondInt = Integer.parseInt(secondHolder);
		
		int output = 0;
		if (operator == '+') {
			output = firstInt + secondInt;
		}
		if (operator == '-') {
			output = firstInt - secondInt;
		}
		if (operator == '*') {
			output = firstInt * secondInt;
		}
		if (operator == '/') {
			output = firstInt / secondInt;
		}
		
		System.out.println("Output: " + output);
		
	}

}
