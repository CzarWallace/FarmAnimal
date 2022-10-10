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
			System.out.println(mAnimal.toString());// + " " + mAnimal.getName());// " :" +
			// mAnimal.feedLoadingSchedule());
			// I need an extra space
			System.out.println();

//			for (FarmAnimal mAnimal1 : myAnimal) {
//				System.out.println(mAnimal.getName() + ":" + mAnimal.feedLoadingSchedule());
//			}

		}

	}
}
