package corejavaone;

public class AbstractinChild extends AbstractClassEg {

	@Override
	void makesound() {
	System.out.println("Animals makes sound");
	
		
	}
	public static void main(String[] args) {
		AbstractinChild  obj = new AbstractinChild();
	    obj.eat();
		obj.makesound();
		System.out.println("animalname");

	}

}
