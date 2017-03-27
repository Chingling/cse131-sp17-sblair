package lab7;

public class Test {

	public static void main(String[] args) {
		Course c = new Course("CSE", 1, 2);
		Student s = new Student("John", "Smith", 123456);
		
		System.out.println(c.getRemainingSeats());
		for (int j = 0; j < 2; j++) {
			String aa =  "" + (Math.random() * 5000);
			String b =  "" + (Math.random() * 5000);
			int cc = (int)(Math.random() * 500000);
			Student s2 = new Student(aa, b, cc);
			boolean added = c.addStudent(s2);
			System.out.println(added);
		}
		System.out.println(c.getRemainingSeats());
		for (int j = 0; j < 2; j++) {
			String aa =  "" + (Math.random() * 5000);
			String b =  "" + (Math.random() * 5000);
			int cc = (int)(Math.random() * 500000);
			Student s2 = new Student(aa, b, cc);
			boolean added = c.addStudent(s2);
			System.out.println(added);
		}
		
		System.out.println(c.generateRoster());
	}

}
