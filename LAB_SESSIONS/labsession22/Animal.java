package labsession22;

 class Animal1 {
	void makesound() {
		System.out.println("All animals makes a sound");
	}
	
	    }
	
//sub class
	class Cat extends Animal1 {
	    @Override
	    public void makesound() {
	        System.out.println("Cat meow");
	    }
	}

public class Animal {
	    public static void main(String[] args) {
	    	
	        Animal1 myC = new Animal1();
	        myC.makesound(); 
	        
	        Cat an =new Cat();
	        an.makesound();
	        
	    }
	
	


	}
	
	


