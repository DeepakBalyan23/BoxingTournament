//Player POJO class extends Person Interface
public class Player extends Person{
	
	private double weight;
	
	public Player(int id, String name, String place, double weight, double experience) {
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.place = place;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
