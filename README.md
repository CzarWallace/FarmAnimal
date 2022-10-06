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



//Chicken class


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







// Cow
package Exercises;

public class Cow extends FarmAnimal {
	
   // Cow attribute
	private String sound;
	
	// Cow constructor
	public Cow(String name, FarmAnimal.Gender gender, double weight, int age) {
		super(name, gender, weight, age);
		sound = "Moo Moo";
	}
	// Cow getter and setter
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	// Cow feed loading schedule
	public String feedLoadingSchedule() {
		return "6 am - 4 pm";
	}
	// Cow toString method
	public String toString() {
		return "Cow " + sound + super.toString();
	}

}


//Duck class

package Exercises;

public class Duck extends FarmAnimal {
     //Duck attribute
	private String sound;
	
	//Duck constructor
	public Duck(String name, FarmAnimal.Gender gender, double weight, int age) {
		super(name, gender, weight, age);
		sound = "Quack Quack";
	}
	//Duck getter and setter
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	//Duck feedLoading Schedule
	public String feedLoadingSchedule() {
		return "8 am - 12 pm - 6 pm";
	}
	//Duck toString method
	public String toString() {
		return "Duck " + sound + super.toString();
	}

}





//myFarm

package Exercises;

import java.util.ArrayList;

public class MyFarm {

	public static void main(String args[]) {

		// I created an ArrayList
		ArrayList<FarmAnimal> myAnimal = new ArrayList<>();

		// And them a farmAnimal object
		FarmAnimal chi1 = new Chicken("Albert", FarmAnimal.Gender.Male, 1.6, 2);
		FarmAnimal chi2 = new Chicken("Amelia", FarmAnimal.Gender.Female, 1.8, 4);
		FarmAnimal chi3 = new Chicken("Dixie", FarmAnimal.Gender.Female, 1.7, 4);
		FarmAnimal c1 = new Cow("Molly", FarmAnimal.Gender.Female, 1600.0, 3);
		FarmAnimal c2 = new Cow("Jelly", FarmAnimal.Gender.Male, 2000.6, 5);
		FarmAnimal d1 = new Duck("Donald", FarmAnimal.Gender.Male, 3.2, 5);
		FarmAnimal d2 = new Duck("Cheese", FarmAnimal.Gender.Female, 3.6, 5);
		// Adding the my farmAnimal to the ArrayList
		myAnimal.add(d1);
		myAnimal.add(d2);
		myAnimal.add(c1);
		myAnimal.add(c2);
		myAnimal.add(chi1);
		myAnimal.add(chi2);
		myAnimal.add(chi3);
		// to print my object without hard coding it, I used the forEach loop.
		for (FarmAnimal mAnimal : myAnimal) {
			System.out.println(mAnimal.toString());
			
			// I need an extra space
			System.out.println();



		}

	}
}


//things that fly

package FlyingObject;

public interface Flight {
    // fly method declared in the flight interface
	void fly();

}



//Bird


package FlyingObject;

public class Bird implements Flight, Movement {
// bird attribute
	private String type;

	public Bird(String type) {
		this.type = type;

	}
 // implementing the fly method in the bird class
	public void fly() {
		System.out.println("I'm a bird who flaps my " + "flaps my wings to fly");
	}
// getter and setter method 
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Bird[ " + "type = " + type + ']';
	}
	 // implementing the walk method in the movement interface
	public void walk() {
		System.out.println("I flap my wings to fly");
		System.out.println("I walk on my feet.");

	}
	 // implementing the jump method in the movement interface
	public void jump() {
		System.out.println("I jump by leaping from my feet.");
	}
}





//Airplane

package FlyingObject;

public class Airplane implements Flight, Movement {
	
// Attribute for airplane class
	private String model;
	private int yearBuilt;
	private String type;
    // Airplane constructor
	public Airplane(String model, int yearBuilt, String type) {
		this.model = model;
		this.yearBuilt = yearBuilt;
		this.type = type;
	}
      //implementing the fly method in the airplane class
	public void fly() {
		System.out.println("I'm an airplane that " + "relies on an engine to fly.");
	}
      //Airplane getter and setter methods
	public String getModel() {
		return model;

	}

	public void setModel(String model) {
		this.model = model;

	}

	public int getYearBuild() {
		return yearBuilt;
	}

	public void setYearBuild(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
      // toString method for the airplane class
	public String toString() {
		return "Airplane[ " + "Type = " + type + ", Year built = " + yearBuilt + ",Model = " + model + ']';
	}
     // implementing the walk method in the movement interface
	public void walk() {
		System.out.println("I rely on my engine to fly");
		System.out.println("I tax on my wheels.");

	}
	 // implementing the jump method in the movement interface
	public void jump() {
		System.out.println("I cannot jump.");
	}

}


//Things that fly
package FlyingObject;

import java.util.ArrayList;

public class ThingsThatFly {

	public static void main(String[] args) {
// declaring the object for plane and bird
		Flight plane = new Airplane("Boeing 747", 2016, "jet plane");
		Flight bird0 = new Bird("Eagle");
		Flight bird1 = new Bird("Humingbird");
       // Using the ArrayList  to print my objects
		ArrayList<Flight> flyingObject = new ArrayList<Flight>();
		flyingObject.add(plane);
		flyingObject.add(bird0);
		flyingObject.add(bird1);
// for each loop
		for (Flight e : flyingObject) {
			System.out.println(e.toString() + " ");
			e.fly();
		}

	}

}



//Movement

package FlyingObject;

public interface Movement extends Flight {
	
	// two method declared for movement interface

	public abstract void walk();

	public abstract void jump();

}


//thingsThatMove

package FlyingObject;

import java.util.ArrayList;

public class thingsThaatMove {

	public static void main(String[] args) {
// Object for the airplane and bird implementing the movement interface
		Movement plane = new Airplane("Boeing 747", 216, "Jet");

		Movement bird0 = new Bird("Eagle");
		Movement bird1 = new Bird("Hummingbird");
//ArrayList is created
		ArrayList<Movement> arr = new ArrayList<Movement>();

		arr.add(plane);
		arr.add(bird0);
		arr.add(bird1);
 // for each loop for the objects
		for (Flight e : arr) {
			System.out.println(e.toString());
			((Movement) e).walk();
			((Movement) e).jump();

		}

	}

}




