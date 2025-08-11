package corejavaone;

public class SingleChild extends SIngleSuper {
	String model = "Mustang";
	public void display() {
		System.out.println("Brand name is"+brand);
		System.out.println("Modal is"+model);
		
	}

	public static void main(String[] args) {
		SingleChild obj= new SingleChild();
		obj.start();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
