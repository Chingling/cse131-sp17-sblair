package exam1;
public class ExamTemplate {
	
	public static int[] question1() {
		// feel free to modify the declaration of answer as necessary
		int[] answer = new int[50];
	
		answer[0] = 3;
		answer[1] = 0;
		answer[2] = 2;
		for (int i = 3; i < 50; i++) {
			answer[i] = answer[i-2] + answer[i-3];
		}
		
		
		// don't change the return statement
		return answer;
	}
	
	public static boolean[] question2() {
		// feel free to modify the declaration of answer as necessary
		boolean[] answer = new boolean[50];
		
		int [] sieve = new int[50];
			
		for (int i = 0; i < sieve.length - 1; i++) {
			sieve[i] = (i+2);
		}

		for (int k = 0; k < sieve.length; k++) {
			for (int i = 2; i < sieve.length; i++) {
				for (int j = i; j < sieve.length; j++){ 
					if (sieve[j] % (i) == 0) {
						sieve[j] = (0);
					}	
				}	
			}
		}
		
		answer[1] = true;
		for (int i = 0; i < 50; i++)  {
			if (sieve[i] != 0) {
				answer[i+2] = true;
				}
		}
	

		// don't change the return statement
		return answer;
	}
	
	public static int question3() {
		// feel free to modify the declaration of answer as necessary
		int answer = 0;
		
		// you may want to use your answer from question 1 in answering this question
		int[] question1Answer = question1();
		int sum = 0;
		int i = 0;
		
		while (sum <= 1000) {
			sum = sum + question1Answer[i];
			i = i + 1;
			if (sum <= 1000){
				answer = answer + 1;
			}
		}
		
		// don't change the return statement
		return answer;
	}
	
	public static String[] question4() {
		// feel free to modify the declaration of answer as necessary
		String[] answer = new String[50];
		
		// you may want to use your answer from questions 1 and 2 in answering this question
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		
		for (int i = 0; i < 50; i++) {
			if (question2Answer[i] == true) {
				answer[i] = i + " is PRIME:\t" + question1Answer[i] + "%" + i + "==0";
			}
			else {
				answer[i] = i + " is NONPRIME";
			}
		}
		
		// don't change the return statement
		return answer;
	}

	public static void main(String[] args) {
		/*
		 * NOTE: 
		 * You should not change and should not need to change any of the code below.
		 * It's there just to make it easy for you to see and verify the accuracy of
		 * your answers.
		 */
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		int question3Answer = question3();
		String[] question4Answer = question4();
		
		// print all of the answers
		System.out.println("QUESTION 1 ");
		for (int i = 0; i < question1Answer.length; i++) {
			System.out.print( question1Answer[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// print the i's where the value is TRUE
		System.out.println("QUESTION 2 ");
		for (int i = 0; i < question2Answer.length; i++) {
			if (question2Answer[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("QUESTION 3: " + question3Answer);
		System.out.println();
		System.out.println();
		
		
		// print out all answers
		System.out.println("QUESTION 4 ");
		for (int i = 0; i < question4Answer.length; i++) {
			System.out.println(question4Answer[i]);
		}

	}

}