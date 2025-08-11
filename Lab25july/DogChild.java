package Lab25july;

public class DogChild implements Animal2 {
	
	void speak() {
		System.out.println("speak");
	}



	@Override
	  public void bark() {
		        System.out.println("Dog is barking");
		    }
		
	public static void main(String[] args) {
		DogChild dc=new DogChild();
		dc.speak();
		dc.bark();
		
		
		
	}

}
