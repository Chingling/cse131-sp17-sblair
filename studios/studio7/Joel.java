package studio7;

public class Joel {
	private  String name, direction;
	private int jersey, goals, assists, games, points;
	
	public Joel(String name, int jersey, String direction) {
		this.name = name;
		this.direction = direction;
		this.jersey = jersey;
		
		this.goals = 0;
		this.assists = 0;
		this.games = 0;
		this.points = 0;
	}
	
	public void playGame(int goals, int assists) {
		this.goals = this.goals + goals;
		this.assists = this.assists + assists;
		this.games = this.games + 1;
		this.points = this.points + goals + assists;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public int getGames() {
		return this.games;
	}
	
}
