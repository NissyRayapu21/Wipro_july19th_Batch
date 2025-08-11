package Lab23;

class Vehicle{
	
	public void drive() {
		System.out.println("Driving the car");
	}
}
class Car extends Vehicle{
	@Override
	public void drive() {
		System.out.println("Reparing the car");
	}
}

public class Question2 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.drive();
		Car c = new Car();
		c.drive();

	}

}