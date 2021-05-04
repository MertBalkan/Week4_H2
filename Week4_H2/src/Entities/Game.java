package Entities;

public class Game {
	private String gameName;
	private int gamePrice;
	
	public Game(String gameName, int gamePrice) {
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
}