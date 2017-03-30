package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Calendar {
	
	private HashSet<Appointment> set;

	public Calendar() {
	}
	
	public boolean addDate(Appointment a) {
		return set.add(a);
	}
	
	
	



	public static void main(String[] args) {
		List<Working> list = new LinkedList<Working>();
		Working a = new Time(10, 10, true);
		Working b = new Date(2,3,2,false);
		list.add(a);
		list.add(b);
		System.out.println(list);
		int working = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).amWorking() == true) working++;
		}
		System.out.println(working);

	}

}
