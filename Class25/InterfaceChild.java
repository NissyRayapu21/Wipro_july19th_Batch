package Class25;

public class InterfaceChild implements InterFace11 {


	public void display() {
		System.out.println("Displaying Data in child ");
	
	}

	public void read() {
		System.out.println("Reading Data in child");
	
	}

	public static void main(String[] args) {
		InterfaceChild ic=new InterfaceChild();
		ic.display();
		ic.read();
		
		InterFace11.write();
	
		System.out.println(employname);
		System.out.println(employid);

	}

}
