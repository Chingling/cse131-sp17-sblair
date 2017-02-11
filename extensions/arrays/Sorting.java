package arrays;
import cse131.ArgsProcessor;

public class Sorting {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int size = -1;
		while (size < 0) {
		size = ap.nextInt("What is the size of the collection?");
		}
		
		int sort[] = new int[size];
		
		for (int i = 0; i < sort.length; i++) {
			int number = ap.nextInt("Input a number");
			sort[i] = number;
		}
		
		System.out.print("Unsorted: ");
		for (int i = 0; i < sort.length; i++){
			System.out.print(sort[i] + " ");
		}
		System.out.println();
		
		int sortCount = 0;
		int minValue = sort[0];
		
		while (sortCount < size) {
			int minIndex = sortCount;
			minValue = sort[sortCount];
			int saved = 0;
			
			for (int i = sortCount + 1; i < sort.length; i++) {
				if (sort[i] < minValue) {
					minValue = sort[i];
					minIndex = i;
				}
			}
			saved = sort[sortCount];
			sort[sortCount] = sort[minIndex];
			sort[minIndex] = saved;
			sortCount = sortCount + 1;
		}
		
		System.out.print("Sorted:   ");
		double sum = 0;
		for (int i = 0; i < sort.length; i++){
			System.out.print(sort[i] + " ");
			sum = sort[i] + sum;
		}
		double mean = sum / size;
		double median = 0;
		if (size % 2 == 0) {
			median = ((double)(sort[(size + 1)/2] + sort[((size + 1)/2) - 1])) / 2;
		}
		else {
			median = sort[size / 2];
		}
		int min = sort[0];
		int max = sort[size - 1];
		int range = max - min;
		
		System.out.println();
		System.out.println();
		System.out.println("Mean: " + mean);
		System.out.println("Median: " + median);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Range: " + range);
	}

}
