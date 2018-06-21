
public class MatchResultGenerator {

	public void setMatchWinnerPlayer(Match match) {
		int roundsWonByP1 = 0;
		int roundsWonByP2 = 0;
		for(Round round: match.getRounds()) {
			if(round.getRoundWinner()!=null) {
				if(round.getRoundWinner().id == round.getP1().id) {
					roundsWonByP1++;
				} else {
					roundsWonByP2++;
				}
			}
		}
		match.setRoundsWonByP1(roundsWonByP1);
		match.setRoundsWonByP2(roundsWonByP2);
		if(roundsWonByP1>roundsWonByP2)
			match.setMatchWinner(match.getP1());
		else if(roundsWonByP1<roundsWonByP2) {
			match.setMatchWinner(match.getP2());
		} else{
			match.setMatchWinner(null);
		}
	}
	
}
