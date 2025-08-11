package Lab23;
class Shape{
	int length;
	int height;
	int area;
	public void area() {
		System.out.println("Calculating the area");
	}
}
class Rectangle extends Shape{
	public Rectangle(int length,int height) {
		this.length=length;
		this.height=height;
	}
	@Override
	public void area() {
		area=this.length*this.height;
		System.out.println("The area of the give shape is :"+area);
		
	}
}

public class Question3 {

	public static void main(String[] args) {
		Shape sh= new Shape();
		sh.area();
		Rectangle s=new Rectangle(10,20);
		s.area();
	}
}
