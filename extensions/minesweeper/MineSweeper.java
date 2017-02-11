package minesweeper;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {
		
		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		
		boolean mines [][] = new boolean[rows+2][cols+2];
		
		for (int i = 1; i < mines.length - 1; i++){
			for(int j = 1; j < mines[i].length - 1; j++) {
				double random = Math.random();
				if (random < percent) {
					mines[i][j] = true;
				}
				else {
					mines[i][j] = false;
				}
			}
			
		}
		
		for (int i = 1; i < mines.length - 1; i++){
			for(int j = 1; j < mines[i].length - 1; j++) {
				if (mines[i][j] == true){
					System.out.print('*' + " ");
				}
				else {
					System.out.print('.' + " ");
				}
			}
			System.out.print("\t");
			for (int j = 1; j < mines[i].length - 1.; j++){
				if (mines[i][j] == true) {
					System.out.print('*' + " ");
				}
				
				else {
					int count = 0;
					if (mines[i - 1][j - 1] == true) {
						count = count + 1;
					}
					if (mines[i - 1][j] == true) {
						count = count + 1;
					}
					if (mines[i - 1][j + 1] == true) {
						count = count + 1;
					}
					if (mines[i][j - 1] == true) {
						count = count + 1;
					}
					if (mines[i][j + 1] == true) {
						count = count + 1;
					}
					if (mines[i + 1][j - 1] == true) {
						count = count + 1;
					}
					if (mines[i + 1][j] == true) {
						count = count + 1;
					}
					if (mines[i + 1][j + 1] == true) {
						count = count + 1;
					}
					
					System.out.print(count + " ");		
				}
				
			}
			
			System.out.println();
		}
		
		
	}
	
}
