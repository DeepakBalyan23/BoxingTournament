
public class BoxingOrganizer {
	
	public static void main(String args[]) {
		Player p1 = new Player(1, "John", "US", 85, 5);
		Player p2 = new Player(2, "Robbert", "England", 83, 2);
		Official ref = new Official(3, "Jimmy", "England", 2);
		Match match = new Match(p1, p2, ref);
		MatchEngine matchEngine = new MatchEngine();
		matchEngine.createRounds(match);
		MatchResultGenerator matchResultGenerator = new MatchResultGenerator();
		matchResultGenerator.setMatchWinnerPlayer(match);
		System.out.println(match.getMatchWinner().id);
	}
	
}
