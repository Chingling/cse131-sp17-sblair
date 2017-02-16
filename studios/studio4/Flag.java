package studio4;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {


	public static void main(String[] args) throws FileNotFoundException {

		StdDraw.setPenRadius(0.01);
		StdDraw.square(0.5, 0.5, 0.5);

		StdDraw.setPenColor(new Color(0,20,100));
		StdDraw.filledRectangle(0.5, 0.5, 0.495, 0.15);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.895, 0.495, 0.1);
		StdDraw.filledRectangle(0.5, 0.105, 0.495, 0.1);
		StdDraw.setPenColor(Color.GREEN);

		for(int i = 0; i < 9; i++) {
			StdDraw.text(0.1+(double)(i*0.1), 0.9-(double)(0.1*i), "Thailand");
			StdDraw.show(100);
		}



		//StdAudio.loop("sound/obamaout.au");
		//StdDraw.pause(500);
		System.setIn(new FileInputStream("music/A.txt"));
		// repeat as long as there are more integers to read in


		while(true) {
			while (!StdIn.isEmpty()) {
				// read in the pitch, where 0 = Concert A (A4)
				int pitch = StdIn.readInt();

				// read in duration in seconds
				double duration = StdIn.readDouble();

				// build sine wave with desired frequency
				double hz = 440 * Math.pow(2, pitch / 12.0);
				int N = (int) (StdAudio.SAMPLE_RATE * duration);
				double[] a = new double[N+1];

				for (int i = 0; i <= N; i++) {
					a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);

				}


				while(true){

					// play it using standard audio
					StdAudio.play(a);
					StdDraw.pause(500);

				}
			}
		}

	}
}
