package FlyingObject;

import java.util.ArrayList;

public class thingsThaatMove {

	public static void main(String[] args) {

		Movement plane = new Airplane("Boeing 747", 216, "Jet");

		Movement bird0 = new Bird("Eagle");
		Movement bird1 = new Bird("Hummingbird");

		ArrayList<Movement> arr = new ArrayList<Movement>();

		arr.add(plane);
		arr.add(bird0);
		arr.add(bird1);

		for (Flight e : arr) {
			System.out.println(e.toString());
			((Movement) e).walk();
			((Movement) e).jump();

		}

	}

}
