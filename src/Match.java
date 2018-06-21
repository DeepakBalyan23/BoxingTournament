import java.util.List;

//Match POJO class
public class Match {

	private int matchId;
	private Player p1;
	private Player p2;
	private Player matchWinner;
	private Official ref;
	private List<Round> rounds;
	private int roundsWonByP1;
	private int roundsWonByP2;
	
	public Match(int matchId, Player p1, Player p2, Official ref) {
		this.matchId = matchId;
		this.p1 = p1;
		this.p2 = p2;
		this.ref = ref;
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
	
	@Override
	public String toString() {
		String str = "Match ID "+matchId+": "+p1.name+" won "+roundsWonByP1+" rounds "+ " and "+p2.name+" won "+roundsWonByP2+" rounds.";
		if(matchWinner==null) {
			str+="\nMatch tied";
		}else {
			str+="\nMatch Winner: "+matchWinner.name;
		}
		return str;
	}
}
