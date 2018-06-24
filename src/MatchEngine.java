import java.util.ArrayList;

/*MatchEngine class
 * Responsible for creating 11 rounds in a match
 * And calling the Official class's function to set the values of the points
 * It will then set the List of rounds in the match's POJO class*/
public class MatchEngine {

	public void createRounds(Match match) {
		Official ref = match.getRef();
		Player p1 = match.getP1();
		Player p2 = match.getP2();
		ArrayList<Round> rounds = new ArrayList<>();;
		for(int i=1; i<=match.getNumberOfRounds(); i++) {
			Round round = ref.setPoints(new Round(i,p1, p2), match.getMatchType());
			RoundResultGenerator roundResultGenerator = new RoundResultGenerator();
			roundResultGenerator.setRoundWinnerPlayer(round);
			rounds.add(round);
		}
		match.setRounds(rounds);
	}
	
}
