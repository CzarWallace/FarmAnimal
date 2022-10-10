package FlyingObject;

public class Airplane implements Flight, Movement {

	private String model;
	private int yearBuilt;
	private String type;

	public Airplane(String model, int yearBuilt, String type) {
		this.model = model;
		this.yearBuilt = yearBuilt;
		this.type = type;
	}

	public void fly() {
		System.out.println("I'm an airplane that " + "relies on an engine to fly.");
	}

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

	public String toString() {
		return "Airplane[ " + "Type = " + type + ", Year built = " + yearBuilt + ",Model = " + model + ']';
	}

	public void walk() {
		System.out.println("I rely on my engine to fly");
		System.out.println("I tax on my wheels.");

	}

	public void jump() {
		System.out.println("I cannot jump.");
	}

}
