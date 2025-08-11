package lab24july;
 
abstract class Vehicle {
	
	//method
	    abstract void move();
	}
//sub1

	class Car extends Vehicle {
	    @Override
	    void move() {
	        System.out.println("Car is moving on four wheels");
	    }
	}
//sub2
	class Bike extends Vehicle {
	    @Override
	    void move() {
	        System.out.println("Bike is moving on two wheels");
	    }
	}
	//sub3

	class Bus extends Vehicle {
	    @Override
	    void move() {
	        System.out.println("Bus is moving on six wheels");
	    }
	}

	
