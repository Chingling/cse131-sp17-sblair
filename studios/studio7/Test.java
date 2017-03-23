package studio7;

public class Test {

	public static void main(String[] args) {
		Joel joel = new Joel("Joel", 7, "No hands");
		
		System.out.println(joel.getGames());
		System.out.println(joel.getPoints());
		joel.playGame(5, 50);
		System.out.println(joel.getGames());
		System.out.println(joel.getPoints());
		

	}

}
