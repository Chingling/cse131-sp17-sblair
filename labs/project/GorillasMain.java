package project;

public class GorillasMain {

	public static void main(String[] args) {
		Initializer i = new Initializer(args);
		int count = 1;
		while (count == 1) {
			//Player 1
			count = i.startThrow(0.07, true);

			//Player 2
			if (count == 1) {
				count = i.startThrow(0.93, false);
			}
		}
		i.endScreen();
	}
}