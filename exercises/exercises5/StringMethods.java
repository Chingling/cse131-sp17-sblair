package exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {
		//return s + s;
		return nConcat(s,2);
	}
	
	public static String nConcat(String s, int n) {
		//String s1 = "";
		//for (int i = 0; i < n; i++){
		//	 s1 = s1 + s;
		//}
		String array[] = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = s;
		}
		return join(array, "");
	}
	
	public static String join(String[] array, String joiner){
		String s1 = "";
		for (int i = 0; i < array.length; i++) {
			s1 = s1 + array[i] + joiner; 
		}
		return s1;
	}
	
	
	public static void main(String[] args) {
		
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(nConcat("echo",9));
	}

}
