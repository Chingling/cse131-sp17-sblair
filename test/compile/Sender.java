package compile;

import cse131.ArgsProcessor;
import sedgewick.StdIn;

public class Sender {

	private int [] sender;
	
	public Sender() {
		int [] holder = new int [8375];
//		ArgsProcessor.useStdInput("test/files");
		int i = 0;
		while(i < 8375) {
			int ID = StdIn.readInt();
			holder[i] = ID;
			i = i + 1;
		}
		this.sender = holder;
	}
	
	public int [] getSender() {
		return this.sender;
	}
}
