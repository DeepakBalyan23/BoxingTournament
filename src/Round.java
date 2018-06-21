
public class Round {
	
	private Player p1;
	private Player p2;
	private Player roundWinner;
	private Points pointsOfP1;
	private Points pointsOfP2;
	private int p1TotalScore;
	private int p2TotalScore;
	
	public Round(Player p1, Player p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}
	
	public Player getRoundWinner() {
		return roundWinner;
	}

	public void setRoundWinner(Player roundWinner) {
		this.roundWinner = roundWinner;
	}
	
	public int getP1TotalScore() {
		return p1TotalScore;
	}

	public void setP1TotalScore(int p1TotalScore) {
		this.p1TotalScore = p1TotalScore;
	}

	public int getP2TotalScore() {
		return p2TotalScore;
	}

	public void setP2TotalScore(int p2TotalScore) {
		this.p2TotalScore = p2TotalScore;
	}

	public Points getPointOfP1() {
		return pointsOfP1;
	}

	public void setPointOfP1(Points pointOfP1) {
		this.pointsOfP1 = pointOfP1;
	}

	public Points getPointOfP2() {
		return pointsOfP2;
	}

	public void setPointOfP2(Points pointOfP2) {
		this.pointsOfP2 = pointOfP2;
	}
}
