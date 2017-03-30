package studio8;

public class Time implements Working {
	
	private final int hour, min;
	private final boolean format;
	
	public Time(int hour, int min, boolean format) {
		this.hour = hour;
		this.min = min;
		this.format = format;
	}
	
	
	
	public int getHour() {
		return hour;
	}



	public int getMin() {
		return min;
	}



	public boolean isEarlier(Time t) {
		if (this.hour < t.getHour()) return true;
		else if (this.hour == t.getHour() && this.min < t.getMin()) return true;
		else return false;
	}
	
	public boolean amWorking() {
		if (this.hour > 9 && this.hour < 17) return true;
		else return false;
	}

	@Override
	public String toString() {
		if (this.format == true && this.hour > 12) return "Time [" + (hour-12) + ":" + min + " PM, 12hr=" + format + "]";
		if (this.format == true && this.hour < 12) return "Time [" + (hour) + ":" + min + " AM, 12hr=" + format + "]";
		if (this.format == true && this.hour == 12) return "Time [" + (hour) + ":" + min + " PM, 12hr=" + format + "]";
		else return "Time [" + hour + ":" + min + ", 12hr=" + format + "]";
	}

	public static void main(String[] args) {
		//input 24 hour
		Time t = new Time(20, 12, true);
		Time s = new Time(20, 12, false);
		System.out.println(s.isEarlier(t));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

}
