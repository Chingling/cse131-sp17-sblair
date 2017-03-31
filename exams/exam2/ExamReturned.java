package sblairexam2;

import sedgewick.StdDraw;


/* 
* Compile Error Deductions: 
* __ [-1] Needed to fix a compilation problem in the code
*/  

public class ExamReturned { 
	public static void main(String[] args) {
		//Yes, this is supposed to be blank

	}


/* Question 1: 15

* __ [+25points] Code produces correct output and follows question specifications appropriately.

* Otherwise, check off as many of these as applicable:

* _x_ [+5] Correct method signature: public static String koch(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* __ [+5] "Correctly identifies the base case - when n==0 returns ""F"""
* _x_ [+5] "When n > 0 gets koch(n-1)"
* _x_ [+5] "When n > 0  replaces F's in koch(n-1) with ""F+F-F-F+F"""
*/

	public static String koch(int n) {
		if (n < 1) {
			return "F";
		}

		return koch(n-1).replaceAll("F", "F+F-F-F+F");
	}


/* Question 2: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+4] Correct method signature: public static String dragon(int n); variable name n can change. Small typos and upper/lower case should not be penalized.
* __ [+4] "Declares an initial dragonString (name doesn't matter) that equals ""F-H"""
* __ [+4] Uses a for loop i = o; i < n or equivalent while loop 
* __ [+4] Replaces F's with F-H and H's with F+H
* __ [+4] "When replacing F's and H's avoids incorrect additions (e.g. F-H becomes F-H - F+H NOT F-F+H -F+H OR F-H-F-H+H)"
*/

	public static String dragon(int n) {
		String answer = "F-H";
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j < answer.length()) {
				if (answer.charAt(j) == 'F') {
					String start1 = answer.substring(0, j);
					String start = answer.substring(j, j+1);

					String end = answer.substring(j+1,answer.length());

					String temp = start.replaceAll("F", "F-H");
					answer = start1 + temp + end;
				}
				if (answer.charAt(j) == 'H') {
					String start1 = answer.substring(0, j);
					String start = answer.substring(j, j+1);

					String end = answer.substring(j+1,answer.length());

					String temp = start.replaceAll("H", "F+H");
					answer = start1 + temp + end;
				}
				j = j + 4;
			}
		}

		return answer;

	}


/* Question 3: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* __ [+4] Correct method signature: public static double computeScale(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* __ [+4] Uses a loop i = 0; i < lString.length() or equivalent while loop
* __ [+4] Uses charAt(i) to get the ith character in the string within the loop
* __ [+4] "When character is either an F or an H adds 1 to a count variable (name substitutions are fine)"
* __ [+4] Returns 1/(2*Math.sqrt(count)) with parentheses that ensure the correct order of operations
*/

	public static double computeScale(String l) {
		double count = 0;
		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == 'F') count = count + 1;
			if (l.charAt(i) == 'H') count = count + 1;
		}

		double answer = (1/(2*Math.sqrt(count)));
		return answer;
	}


/* Question 4: 25

* _x_ [+25points] Code produces correct output and follows question specifications appropriately. 

* Otherwise, check off as many of these as applicable:

* _x_ [+3] Correct method signature: public static void drawLString(String lString); variable name lString can change. Small typos and upper/lower case should not be penalized.
* _x_ [+3] Calls computeScale to get the scale value
* _x_ [+3] Uses a loop i = 0; i < lString.length() or equivalent while loop
* _x_ [+3] Uses charAt(i) to get the ith character in the string within the loop
* _x_ [+3] Maintains x and y directions that are used within the StdDraw.line call
* _x_ [+3] Uses one or more if statement/if-else statements to draw lines for F or H characters
* _x_ [+3] Uses one or more if statement/if-else statements to change x and y directions for + and - characters
*/

	public static void drawLString(String l) {
		double move = computeScale(l);

		double xpos = 0.5;
		double ypos = 0.5;
		double xdir = 1*move;
		double ydir = 0*move;

		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == 'F' || l.charAt(i) == 'H') {

				StdDraw.line(xpos, ypos, xpos+xdir, ypos+ydir);
				xpos = xpos+xdir;
				ypos = ypos+ydir;
			}
			if (l.charAt(i) == '+') {
				double temp = 0;
				temp = xdir;
				xdir = ydir;
				ydir = -temp;

			}
			if (l.charAt(i) == '-') {
				double temp = 0;
				temp = xdir;
				xdir = -ydir;
				ydir = temp;

			}
		}
	}


}
