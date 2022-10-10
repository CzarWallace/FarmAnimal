package Exercises;

public class Cow extends FarmAnimal {

	private String sound;

	public Cow(String name, FarmAnimal.Gender gender, double weight, int age) {
		super(name, gender, weight, age);
		sound = "Moo Moo";
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String feedLoadingSchedule() {
		return "6 am - 4 pm";
	}

	public String toString() {
		return "Cow " + sound + super.toString();
	}

}
