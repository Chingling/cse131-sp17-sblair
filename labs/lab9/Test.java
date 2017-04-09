package lab9;

public class Test {

	public static void main(String[] args) {
		ListItem s = new ListItem(3, 
				new ListItem(5,
						new ListItem(9,
								new ListItem(3,
										new ListItem(2,
												new ListItem(4,null)
										)
								)
						)
				)
		);
		
		ListItem t = s.duplicate();
		ListItem u = new ListItem(2, null);
		u.setNext(new ListItem(3,null));
		ListItem v = u.duplicate();
		
		for (ListItem p = s.duplicate(); p != null; p = p.getNext()) {
			System.out.println(p.getNum());
		}
		
		System.out.println(v.getNum());
		System.out.println(u.getNum());
		System.out.println(s);
		System.out.println(s.stretch(2));
	}

}
