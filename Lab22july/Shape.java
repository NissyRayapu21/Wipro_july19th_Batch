package Lab22july;

 class Shape1 {
	
	    double getArea() {
	        return 0;
	    }
	}

	class Rectangle extends Shape1 {
	    double length;
	    double width;

	    Rectangle(double l, double w) {
	    	  length = l;
		     width=w;
	    }

	    @Override
	    double getArea() {
	        return length * width;
	    }
	}

	public class Shape{
	    public static void main(String[] args) {
	        Rectangle r = new Rectangle(5, 4);
	        System.out.println("Area of rectangle: " + r.getArea());
	    }
	

	

	}


