package compile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import cse131.ArgsProcessor;
import sedgewick.StdIn;

public class Project {
	public static void main(String[] args) throws IOException {
		
		ArgsProcessor.useStdInput("test/files");
		
		Sender s = new Sender();
		Conversation c = new Conversation();
		Message m = new Message();
		
		
		int sender [] = s.getSender();
		int convo [] = c.getConvo();
		String message [] = m.getMessage();
		
		PrintWriter pw = new PrintWriter(new FileWriter("test/files/out.txt"));
		

		for (int j = 1; j < 8375; j++) {
			if (convo[j-1] == 1) {
				if (sender[j-1] == 1) {
					pw.write("<div class=\"message\"><div class=\"message_header\"><span class=\"user\">Shane</span></div></div><p>" + message[j] + "</p>");
				}
				if (sender[j-1] == 2) {
					pw.write("<div class=\"message\"><div class=\"message_header\"><span class=\"user\">Pimmy</span></div></div><p>" + message[j] + "</p>");
				}
			}
		}
		pw.close();
	}

}
