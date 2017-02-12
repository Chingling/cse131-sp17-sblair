package biofindframe;

import java.io.File;

import org.biojava3.core.sequence.DNASequence;

import biojava.SequenceLoader;
import cse131.ArgsProcessor;

public class FindTheFrame {
	
	//
	// Do not change any code from here....
	//

	public static void main(String[] args) {
		File file = ArgsProcessor.chooseFile("genomes");
		System.out.println("For " + file + ", best reading frame is " + runsolution(file));
	}
	
	public static int runsolution(File file) {
		//
		// Load the sequence into a DNASequence object
		//
		SequenceLoader sequenceLoader = new SequenceLoader();
		DNASequence dnaSequence = sequenceLoader.loadDNASequence(file);
		
		//
		// Convert the sequence to a string and then a char array
		//
		String dnaAsString = dnaSequence.getSequenceAsString().toUpperCase();
		char[] dnaAsCharArray = dnaAsString.toCharArray();
		
		//
		// Call your solution to compute the result
		//
		int frame = bestReadingFrame(dnaAsCharArray);
		
		return frame;
	}
	
	//
	// ... to here, so we can unit test your solution
	//
	
	/**
	 * 
	 * @param dna an array of char.  Each element is a nucleotide:  one of A, T, C, or G.
	 * @return the index at which the best reading frame occurs.  This would be 0, 1, or 2.
	 */
	public static int bestReadingFrame(char[] dna) {
		

		// Below, define each of the three Stop Codons as a separate array of char,
		//     named ochre, amber, and opal
		//     See http://en.wikipedia.org/wiki/Genetic_code#Start.2Fstop_codons

		char ochre[] = {
				'T','A','A'
		};
		char amber[] = {
				'T','A','G'
		};
		char opal[] = {
				'T','G','A'
		};
		
		
		// Below, define the Start Codon (Methionine) as an array of char
		//Start Codon
		
		char meth[] = {
			'A','T','G'	
		};
		
		int ans = -1;  // returned if no appropriate sequences was found
		
		//
		// Follow the instructions in the extension write up
		//
		
		char checkA[] = new char[3];
			
		//Ref 1
		int count1 = 0;
		int position1 = 0;
		while (position1 < dna.length) {
			
			//Look for start codon
			for (int i = position1; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
				
					position1 = i + 3;
					if (checkA[0] == meth[0] && checkA[1] == meth[1] && checkA[2] == meth[2]) {
						i = dna.length;
				}
				System.out.println(position1);	
			}
			
			//Look for stop codon
			
			for (int i = position1; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
				position1 = i + 3;
				if ((checkA[0] == ochre[0] && checkA[1] == ochre[1] && checkA[2] == ochre[2]) || (checkA[0] == amber[0] && checkA[1] == amber[1] && checkA[2] == amber[2]) || (checkA[0] == opal[0] && checkA[1] == opal[1] && checkA[2] == opal[2])) {
					i = dna.length;
				}
				else {
					count1 = count1 + 1;
				}
				System.out.println(position1);	
			}
			
		}
			
			
		//Ref 2
		int count2 = 0;
		int position2 = 1;
			while (position2 < dna.length) {
		
			//Look for start codon
			for (int i = position2; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
					position2 = i + 3;
					if (checkA[0] == meth[0] && checkA[1] == meth[1] && checkA[2] == meth[2]) {
						i = dna.length;
				}
					
			}
			
			//Look for stop codon
			
			for (int i = position2; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
				position2 = i + 3;
				if ((checkA[0] == ochre[0] && checkA[1] == ochre[1] && checkA[2] == ochre[2]) || (checkA[0] == amber[0] && checkA[1] == amber[1] && checkA[2] == amber[2]) || (checkA[0] == opal[0] && checkA[1] == opal[1] && checkA[2] == opal[2])) {
					i = dna.length;
				}
				else {
					count2 = count2 + 1;
				}
			}
			
			}
			
			
		//Ref 3
			int count3 = 0;
			int position3 = 2;
			while (position3 < dna.length) {
			
			//Look for start codon
			for (int i = position2; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
					position3 = i + 3;
					if (checkA[0] == meth[0] && checkA[1] == meth[1] && checkA[2] == meth[2]) {
						i = dna.length;
				}
					
			}
			
			//Look for stop codon
			
			for (int i = position3; i < dna.length; i = i + 3) {
				if (i + 2 > dna.length - 1) {
					i = dna.length;
				}
				else {
					checkA[0] = dna[i];
					checkA[1] = dna[i + 1]; 
					checkA[2] = dna[i + 2];
				}
				position3 = i + 3;
				if ((checkA[0] == ochre[0] && checkA[1] == ochre[1] && checkA[2] == ochre[2]) || (checkA[0] == amber[0] && checkA[1] == amber[1] && checkA[2] == amber[2]) || (checkA[0] == opal[0] && checkA[1] == opal[1] && checkA[2] == opal[2])) {
					i = dna.length;
				}
				else {
					count3 = count3 + 1;
				}
			}
			
			}
		
		if (count1 > count2 && count1 > count3) {
			ans = 0;
		}
		if (count2 > count1 && count2 > count3) {
			ans = 1;
		}
		if (count3 > count1 && count3 > count2) {
			ans = 2;
		}
		
		return ans;
	}
}
