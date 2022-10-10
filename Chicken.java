package edu.ggc.itec.AWallace;

public abstract class Chicken extends FarmAninal{
	
	private String sound;

	public Chicken(String name, FarmAninal.Gender gender, double weight, int age) {
		super(name, gender, weight,age);
		
		if(gender == Gender.FEMALE)
		sound = "Click Click";
		else
			sound = "Cock-a-Doodle-do";
	}
	
	
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	 @Override
		public  String feedLoadingSchedule() {
			return "8 am - 4 pm";
			
		
	}
	 @Override
		public String toString() {
			return "Chicken" + sound + super.toString();
		}


	
	
      
}
