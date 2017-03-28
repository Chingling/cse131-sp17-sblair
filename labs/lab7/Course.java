package lab7;

public class Course {

	private String name;
	private int credits;
	private int seats, startingSeats;
	private Student [] roster;
	private Student student;

	public Course(String name, int credits, int seats) {
		this.name = name;
		this.credits = credits;
		this.startingSeats = seats;
		this.seats = seats;
		Student s = new Student("", "", 0);
		this.roster = new Student [seats];
		for (int i = 0; i < this.startingSeats; i++) {
			this.roster[i] = s;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getRemainingSeats() {
		return this.seats;
	}
	
	/**
	 * add a student to the roster if not already present
	 * @param s student to be added
	 * @return boolean whether or not student was added successfully
	 */
	public boolean addStudent(Student s) {
		boolean check = true;
			for (int i = 0; i < this.startingSeats; i++) {
					if (s.getStudentID() == this.roster[i].getStudentID()) check = false;
				}
		if (check == true) {
			if (this.seats == 0) {
				check = false;
			}
			else {
				roster[this.seats-1] = s;
				this.seats = this.seats - 1;
				check = true;
			}
		}
		return check;
	}
	/**
	 * take an average GPA of all students in course
	 * @return average GPA of course students
	 */
	public double averageGPA() {
		double score = 0;
		int students = 0;
		for (int i = 0; i < this.roster.length; i++) {
			if (this.roster[i].getStudentID() != 0) {
				score = score + this.roster[i].getGPA();
				students = students + 1;
			}
		}
		double GPA = score/students;
		
		return GPA;
	}
	/**
	 * generate a roster of all students as a string
	 * @return string of roster
	 */
	public String generateRoster() {
		String list = "";
		for (int i = 0; i < this.roster.length; i++) {
			if (this.roster[i].getStudentID() != 0) {
				list = list + this.roster[i].getName() + " ";
			}
		}
		return list;
	}
	/**
	 * return name and roster credits as string
	 */
	public String toString() {
		return this.name + " " + this.credits;
	}



}
