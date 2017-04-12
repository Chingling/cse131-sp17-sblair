package compile;
import cse131.ArgsProcessor;
import sedgewick.StdIn;

public class Test {
	public static void main(String[] args) {
		String message [] = new String [10];
		String message2 [] = new String [10];
		int i = 0;
		ArgsProcessor.useStdInput("test");
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readLine();
			message[i] = s;
			i = i + 1;
		}
		i = 0;
		
		ArgsProcessor.useStdInput("test");
		
		while(!StdIn.isEmpty()) {
			String s = StdIn.readLine();
			message2[i] = s;
			i = i + 1;
		}
		i = 0;
		
		for (int j = 0; j < 10; j++) {
			System.out.println(message[j]);
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(message2[j]);
		}
	}

}
