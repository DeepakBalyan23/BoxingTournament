import java.util.Random;

/* Official class extends Person Interface
 * It is responsible for setting of the points value and the total score value in a round for Player1 and Player2.*/
public class Official extends Person {
	
	public Official(int id, String name, String place, double experience) {
		this.id = id;
		this.name = name;
		this.place = place;
		this.experience = experience;
	}
	
	public Round setPoints(Round round, String matchType) {
		Points pointsOfP1;
		Points pointsOfP2;
		if(matchType=="Pro") {
			pointsOfP1 = new ProBoxingPoints(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1);
			pointsOfP2 = new ProBoxingPoints(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1,new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1);
		} else {
			pointsOfP1 = new GeneralBoxingPoints(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1);
			pointsOfP2 = new GeneralBoxingPoints(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1);
		}
		round.setPointOfP1(pointsOfP1);
		round.setPointOfP2(pointsOfP2);
		
		round.setP1TotalScore(pointsOfP1.getTotalPoints());
		round.setP2TotalScore(pointsOfP2.getTotalPoints());
		
		return round;
	}
	
}
