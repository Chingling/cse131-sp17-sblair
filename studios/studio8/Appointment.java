package studio8;

public class Appointment {
	
	private Date d;
	private Time t;
	
	

	public Appointment(Date d, Time t) {
		this.d = d;
		this.t = t;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}



	public static void main(String[] args) {
		Date d = new Date(6, 17, 9, true);
		Time t = new Time(15, 56, true);
		Appointment a = new Appointment(d, t);
		

	}

}
