/*ScoreCalculator class returns the sum of all the points in a round by a player*/
public class ScoreCalculator {

	public int totalScore(Points points) {
		int sum = points.getAllIllegalPunch()+points.getBodyHook()+points.getBodyJab()+points.getBodyUpperCut()+points.getFaceHook()+points.getFaceJab()+points.getFaceUpperCut();
		return sum;
	}
	
}
