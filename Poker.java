package game.poker;

public class Poker {

	private  String color;
	private  String points;
	
	public Poker(String color ,String  points){
		this.color = color;
		this.points = points;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}
	

}
