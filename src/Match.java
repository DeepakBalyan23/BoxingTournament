import java.util.List;

//Match POJO class
public class Match {
	//These fields will be set by constructor.
	private int matchId;
	private Player p1;
	private Player p2;
	private Official ref;
	private int numberOfRounds;
	
	//Match these fields will be set MatchEngine
	private List<Round> rounds;
	private int roundsWonByP1;
	private int roundsWonByP2;
	
	//matchWinner will be set by MatchResultGenerator
	private Player matchWinner;
	
	public Match(int matchId, Player p1, Player p2, Official ref, int numberOfRounds) {
		this.matchId = matchId;
		this.p1 = p1;
		this.p2 = p2;
		this.ref = ref;
		this.setNumberOfRounds(numberOfRounds);
	}

	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}
	
	public Player getMatchWinner() {
		return matchWinner;
	}

	public void setMatchWinner(Player matchWinner) {
		this.matchWinner = matchWinner;
	}

	public Official getRef() {
		return ref;
	}

	public List<Round> getRounds() {
		return rounds;
	}

	public void setRounds(List<Round> rounds) {
		this.rounds = rounds;
	}

	public int getRoundsWonByP1() {
		return roundsWonByP1;
	}

	public void setRoundsWonByP1(int roundsWonByP1) {
		this.roundsWonByP1 = roundsWonByP1;
	}

	public int getRoundsWonByP2() {
		return roundsWonByP2;
	}

	public void setRoundsWonByP2(int roundsWonByP2) {
		this.roundsWonByP2 = roundsWonByP2;
	}
	
	public int getNumberOfRounds() {
		return numberOfRounds;
	}

	public void setNumberOfRounds(int numberOfRounds) {
		this.numberOfRounds = numberOfRounds;
	}
	
	@Override
	public String toString() {
		String str = "Match ID "+matchId+": "+p1.name+" won "+roundsWonByP1+" rounds and "+p2.name+" won "+roundsWonByP2+" rounds.";
		if(matchWinner==null) {
			str+="\nMatch tied";
		}else {
			str+="\nMatch Winner: "+matchWinner.name;
		}
		return str;
	}
}
