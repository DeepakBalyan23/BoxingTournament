/*BoxingOrganizer is a driver class which
 * creates two object of Player class p1 and p2
 * creates an object ref of class Official
 * then creates an new Match object by passing p1, p2 and ref to its constructor
 * then it creates an object of MatchEngine and creates rounds for a  match.
 * Then the MatchResultGenerator object set the value of winner in Match POJO class
 * Then this class if printing the complete summary of the match */
public class BoxingOrganizer {
	
	public static void main(String args[]) {
		Player p1 = new Player(1, "John", "US", 85, 5);
		Player p2 = new Player(2, "Robbert", "England", 83, 2);
		Official ref = new Official(3, "Jimmy", "England", 2);
		Match match = new Match(101, p1, p2, ref, 11);
		MatchEngine matchEngine = new MatchEngine();
		matchEngine.createRounds(match);
		MatchResultGenerator matchResultGenerator = new MatchResultGenerator();
		matchResultGenerator.setMatchWinnerPlayer(match);
		for(Round round: match.getRounds()) {
			System.out.println(round + "\n");
		}
		System.out.println(match);
	}
	
}
