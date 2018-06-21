import java.util.Random;

public class Official extends Person {
	
	public Official(int id, String name, String place, double experience) {
		this.id = id;
		this.name = name;
		this.place = place;
		this.experience = experience;
	}
	
	public Round setPoints(Round round) {
		round.setPointOfP1(new Points(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1));
		round.setPointOfP2(new Points(new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, new Random().nextInt(50) + 1, -new Random().nextInt(50) + 1));
		ScoreCalculator sc = new ScoreCalculator();
		round.setP1TotalScore(sc.totalScore(round.getPointOfP1()));
		round.setP2TotalScore(sc.totalScore(round.getPointOfP2()));
		return round;
	}
	
}