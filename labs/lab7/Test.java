package lab7;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			double a =  (Math.random() * 5000);
			int s = (int)(Math.random() * 50);
			Course c = new Course("" + a, s, s);

			for (int j = 0; j < s; j++) {
				String aa =  "" + (Math.random() * 5000);
				String b =  "" + (Math.random() * 5000);
				int cc = (int)(Math.random() * 500000);
				Student s2 = new Student(aa, b, cc);
				boolean added = c.addStudent(s2);
				System.out.println(added);
			}

			//Try to add students, even though the class is full.
			for (int j = 0; j < s; j++) {
				String aa =  "" + (Math.random() * 5000);
				String b =  "" + (Math.random() * 5000);
				int cc = (int)(Math.random() * 500000);
				Student s2 = new Student(aa, b, cc);
				boolean added = c.addStudent(s2);

				System.out.println(added);
			}
		}
	}

}
