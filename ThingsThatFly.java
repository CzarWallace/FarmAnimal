package FlyingObject;

import java.util.ArrayList;

public class ThingsThatFly {

	public static void main(String[] args) {

		Flight plane = new Airplane("Boeing 747", 2016, "jet plane");
		Flight bird0 = new Bird("Eagle");
		Flight bird1 = new Bird("Humingbird");

		ArrayList<Flight> flyingObject = new ArrayList<Flight>();
		flyingObject.add(plane);
		flyingObject.add(bird0);
		flyingObject.add(bird1);

		for (Flight e : flyingObject) {
			System.out.println(e.toString() + " ");
			e.fly();
		}

	}

}
