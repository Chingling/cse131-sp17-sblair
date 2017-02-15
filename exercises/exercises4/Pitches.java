package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A

		int pitch = ap.nextInt("What is the pitch?");
		double frequency = 440.0 * Math.pow(2,  pitch/12.0);
		int pitchStep = pitch + 7;
		double frequencyStep = 440.0 * Math.pow(2,  pitchStep/12.0);

		System.out.println("For pitch " + pitch);
		System.out.println(" and we get frequency " + frequency);
		System.out.println(" up a diatonic fifth " + frequencyStep);
		System.out.println("Ratio: " + frequencyStep/frequency);
		
		int pitch1 = ap.nextInt("What is the first pitch?");
		int pitch2 = ap.nextInt("What is the second pitch?");
		double frequency1 = 440.0 * Math.pow(2,  pitch1/12.0);
		double frequency2 = 440.0 * Math.pow(2,  pitch2/12.0);
		
		System.out.println("For pitch " + pitch1 + " we get frequency " + frequency1);
		System.out.println("For pitch " + pitch2 + " we get frequency " + frequency2);
		System.out.println("Ratio: " + frequency1/frequency2);
	}

}
