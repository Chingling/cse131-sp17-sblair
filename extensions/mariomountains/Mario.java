package mariomountains;
import cse131.ArgsProcessor;
public class Mario {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int number = ap.nextInt("What level of mountain?");
		
		String mario = "";
		
		for (int x = 0; x < number; x++) {
			mario = mario + "#";
			System.out.println(mario);
		}
		
	}

}
