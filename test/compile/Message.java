package compile;

import cse131.ArgsProcessor;
import sedgewick.StdIn;

public class Message {

	private String [] message;

	public Message() {
		String [] holder = new String [8375];
//		ArgsProcessor.useStdInput("test/files");
		int i = 0;
		while(i < 8375) {
			String s = StdIn.readLine();
			holder[i] = s;
			i = i + 1;
		}
		this.message = holder;
	}
	
	public String [] getMessage() {
		return this.message;
	}

}
