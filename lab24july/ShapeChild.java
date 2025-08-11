package lab24july;


public class ShapeChild {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}