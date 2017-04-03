package studio8;

import java.util.HashSet;
import java.util.LinkedList;

public class Date implements Working{
	
	private final int month, day, year;
	private final boolean holiday;
	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	

	public int getMonth() {
		return month;
	}




	public int getDay() {
		return day;
	}




	public int getYear() {
		return year;
	}

	public boolean isEarlier(Date d) {
		if (this.year < d.getYear()) return true;
		else if (this.year == d.getYear() && this.month < d.getMonth()) return true;
		else if (this.year == d.getYear() && this.month == d.getMonth() && this.day < d.getDay()) return true;
		else return false;
	}
	
	public boolean amWorking() {
		if (this.day % 2 == 0) return true;
		else return false;
	}


	@Override
	public String toString() {
		return "Date [" + month + "/" + day + "/" + year + ", holiday=" + holiday + "]";
	}


	public static void main(String[] args) {
		Date d = new Date(7, 12, 1998, true);
		Date s = new Date(7, 12, 2000, false);
		Date c = new Date(8, 19, 2020, true);
		Date w = new Date(5, 20, 1, true);
		Date p = new Date(4, 30, 6000, false);
		Date x = new Date(7, 12, 1998, true);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d);
		list.add(s);
		list.add(c);
		list.add(w);
		list.add(p);
		list.add(x);
		
		HashSet<Date> hash = new HashSet<Date>();
		hash.add(d);
		hash.add(s);
		hash.add(c);
		hash.add(w);
		hash.add(p);
		hash.add(x);
		
		System.out.println(list);
		System.out.println(hash);
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
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
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
