package compile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lazy {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("test/files/lazy.txt"));
		
		for (int i = 1; i < 238; i++) {
			pw.write("<div class=\"gallery\"><a target=\"_blank\" href=\"" + i + ".jpg\"><img src=\"" + i + ".jpg\" alt=\"" + i + "\" width=\"300\" height=\"200\"></a></div>" + "\n");
		}
		pw.close();

	}

}
