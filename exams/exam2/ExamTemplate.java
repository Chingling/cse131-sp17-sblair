package exam2;

import sedgewick.StdDraw;

public class ExamTemplate {
	public static void main(String[] args) {
		//Yes, this is supposed to be blank

//		String answer = "F-H-H";
//		if (answer.charAt(4) == 'F') {
//			String start1 = answer.substring(0, 0);
//			String start = answer.substring(4, 4+1);
//
//			String end = answer.substring(4+1,answer.length());
//
//			String temp = start.replaceAll("F", "F-H");
//			answer = temp + end;
//			System.out.println(answer);
//		}
//		if (answer.charAt(4) == 'H') {
//			String start = answer.substring(4, 4+1);
//
//			String end = answer.substring(4+1,answer.length());
//
//			String temp = start.replaceAll("H", "F+H");
//			answer = temp + end;
//			System.out.println(answer);
//		}
		
		System.out.println(Dragon(2));

	}

	public static String koch(int n) {
		if (n < 1) {
			return "F";
		}

		return koch(n-1).replaceAll("F", "F+F-F-F+F");
	}

	public static String Dragon(int n) {
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

	public static double computeScale(String l) {
		double count = 0;
		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == 'F') count = count + 1;
			if (l.charAt(i) == 'H') count = count + 1;
		}

		double answer = (1/(2*Math.sqrt(count)));
		return answer;
	}

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
