package lab24;

abstract class VehicleCheck extends Vehicle {

	public static void main(String[] args) {
	     Vehicle v1 = new Car();
	        Vehicle v2  = new Bike();
	        Vehicle v3 = new Bus();

	        v1.move();
	        v2.move();
	        v3.move();


	}

}
