package Lab25;

public class ShapeTestChild implements Shape1{

	

	public double getArea() {
		System.out.println("Area of different shapes");
		return 0;
	}
	
		
	
	public static void main(String[] args) {
		  Shape1 rect = new Rect(2, 3);
	        Shape1 circ = new Cir(5);
	        Shape1 tri = new Tri(3, 4);

	        System.out.println("Rectangle Area: " + rect.getArea());
	        System.out.println("Circle Area: " + circ.getArea());
	        System.out.println("Triangle Area: " + tri.getArea());
	    }
	

	

	}


