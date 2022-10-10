package Exercises;

public class Chicken extends FarmAnimal {
	// attribute for chicken class
	private String sound;

	public Chicken(String name, FarmAnimal.Gender gender, double weight, int age) {
		super(name, gender, weight, age);
		if (gender == gender.Male)
			sound = "Cock-a-Doodle-doo";
		else
			sound = "Cluck Cluck";

	}

	// getter and setter
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String feedLoadingSchedule() {
		return "8 am - 4 pm";
	}

	// toString method
	public String toString() {
		return "Chicken " + sound + super.toString();

	}

}
