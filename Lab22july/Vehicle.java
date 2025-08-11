package Lab22july;

 class Vehicle1 {
	
	    public void drive() {
	        System.out.println("Vehicle is driving");
	    }
	}
//sub
	class Car extends Vehicle1 {
	    @Override
	    public void drive() {
	        System.out.println("Repairing a car");
	    }
	}

	public class Vehicle {
	    public static void main(String[] args) {
	        Vehicle1 myCar = new Vehicle1();
	        myCar.drive();  
	        
	        Car c =new Car();
	        c.drive();
	    }
	}

	


