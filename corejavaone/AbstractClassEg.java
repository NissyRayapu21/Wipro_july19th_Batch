package corejavaone;

abstract class AbstractClassEg {
	
	//abstract no body method
	abstract void makesound();
	//concrete methods
	public void eat() {
		System.out.println("The animal eats food");
	
	}
	//constructor
	AbstractClassEg(){
		System.out.println("Creating constructor in abstract class");
	}
	//instance variables
	public static String animalname="Lion";
	//final variable
	private final String animalbehav="roars";
	
	
	

	
	}


