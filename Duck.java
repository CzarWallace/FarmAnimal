package Exercises;

public class Duck extends FarmAnimal {

	private String sound;

	public Duck(String name, FarmAnimal.Gender gender, double weight, int age) {
		super(name, gender, weight, age);
		sound = "Quack Quack";
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String feedLoadingSchedule() {
		return "8 am - 12 pm - 6 pm";
	}

	public String toString() {
		return "Duck " + sound + super.toString();
	}

}
