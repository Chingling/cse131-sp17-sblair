package exercises8;

public class PersonalProperty {
	private final int initialValue, yearsOld;

	public PersonalProperty(int initialValue, int yearsOld) {
		this.initialValue = initialValue;
		this.yearsOld = yearsOld;
	}

	public int getInitialValue() {
		return initialValue;
	}

	public int getYearsOld() {
		return yearsOld;
	}
	
	public int depreciatedValue() {
		return (int)(initialValue*0.80*yearsOld);
	}

	@Override
	public String toString() {
		return "PersonalProperty [initialValue=" + initialValue + ", yearsOld=" + yearsOld + "]";
	}
	
	
}
