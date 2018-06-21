import java.util.ArrayList;

public class MatchEngine {

	public void createRounds(Match match) {
		Official ref = match.getRef();
		Player p1 = match.getP1();
		Player p2 = match.getP2();
		ArrayList<Round> rounds = new ArrayList<>();;
		for(int i=1; i<=11; i++) {
			Round round = ref.setPoints(new Round(p1, p2));
			RoundResultGenerator roundResultGenerator = new RoundResultGenerator();
			roundResultGenerator.setRoundWinnerPlayer(round);
			rounds.add(round);
		}
		match.setRounds(rounds);
	}
	
}
