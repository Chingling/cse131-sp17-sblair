package lab7;

public class Student {

	private String firstName, lastName, fullName;
	private int id, credits;
	private double GPA;

	public Student(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.id = id;
	}

	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
	}

	public void setStudentID(int id) {
		this.id = id;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getName() {
		return this.fullName;
	}

	public int getStudentID() {
		return this.id;
	}

	public int getCredits() {
		return this.credits;
	}

	public double getGPA() {
		return this.GPA;
	}

	public String getClassStanding() {
		if (credits < 30) return "Freshman";
		if (credits >= 30 && credits < 60) return "Sophomore";
		if (credits >=60 && credits < 90) return "Junior";
		if (credits >=90) return "Senior";
		return "";
	}
	
	public void submitGrade(double grade, int credits) {
		double quality = this.GPA * this.credits;
		double score = grade * credits;
		this.credits = this.credits + credits;
		this.GPA = Math.round(((quality + score)/this.credits)*1000.0)/1000.0;
	}
	
	public String toString() {
		return getName() + " " + getStudentID();
	}
	
	public Student createLegacy(Student s) {
		Student ss = new Student(this.fullName, s.getName(), this.id + s.getStudentID());

		ss.setGPA((this.GPA + s.getGPA())/2);
		ss.setStudentID(this.id + s.getStudentID());
		ss.setCredits(Math.max(this.credits, s.getCredits()));

		return ss;
		
	}
	

}
