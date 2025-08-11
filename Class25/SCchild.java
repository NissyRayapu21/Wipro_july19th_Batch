package Class25;

public class SCchild implements Circle{

	@Override
	public void shape() {
		System.out.println("Drawing Shape");
	
	}

	@Override
	public void radius() {
		System.out.println("Radius of circle");
	
	}
	public static void main(String[] args) {
		SCchild sc=new SCchild();
		sc.shape();
		sc.radius();

	}

}
