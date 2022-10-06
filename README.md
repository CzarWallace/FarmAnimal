//# FarmAnimal

package Exercises;

public abstract class FarmAnimal {

	// my attributes
	private String name;
	
     //enum is use to declare the gender as final
	protected enum Gender {
		Male, Female
	};

	private Gender gender;
	private double weight;
	private int age;

	// zero argument constructor
	public FarmAnimal() {

	}

	// my constructor
	public FarmAnimal(String name, Gender gender, double weight, int age) {
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.age = age;

	}
	// getter and setter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;

	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// my toString method
	public String toString() {
		return "[Name = " + name + ", Gender = " + gender + ", Weight = " + weight + ", Age = " + age + "]" + ","
				+ " Feeding time = " + name + ": " + feedLoadingSchedule();
	}
 // abstract feed loading schedule
	public abstract String feedLoadingSchedule();

}
