/*RoundResultGenerator class generates the result of a particular round based on the player's total score
 * and set the roundWnner in Round POJO class*/
public class RoundResultGenerator {
	
	public void setRoundWinnerPlayer(Round round) {
		if(round.getP1TotalScore()>round.getP2TotalScore()) {
			round.setRoundWinner(round.getP1());
		} else if(round.getP1TotalScore()<round.getP2TotalScore()){
			round.setRoundWinner(round.getP2());
		} else {
			round.setRoundWinner(null);
		}
	}
	
}
