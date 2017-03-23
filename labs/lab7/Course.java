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
		this.roster = new Student [seats];
		this.student = new Student("John", "Smith", 000000);
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
	
	public void setRoster(Student s) {
		this.student = s;
		this.roster = new Student [this.seats];
		for (int i = 0; i < this.seats; i++) {
			this.roster[i] = this.student;
		}
	}

	public boolean addStudent(Student s) {
		boolean check = true;
		System.out.println(this.roster[0].getName());
			for (int i = 0; i < this.startingSeats; i++) {
				
				if (this.roster[i] == null) ;
				else {
					if (s.getStudentID() == this.roster[i].getStudentID()) check = false;
				}
			}
		System.out.println(check);
		if (check == true) {
			if (this.seats == 0) ;
			else {
				roster[this.seats-1] = s;
				this.seats = this.seats - 1;
				check = true;
			}
		}
		
		
		return check;
	}



}
