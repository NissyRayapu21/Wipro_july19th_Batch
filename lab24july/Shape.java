package lab24july;
abstract class Shape {
    // Abstract method
    abstract double calculateArea();
}

// Circle class inherits Shape
class Circle extends Shape {
    double radius;
    

    // Constructor
    Circle(double radius) {
    	this.radius=radius;
    	
    	   
    }

    // Implement abstract method
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inherits Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
    	this.length=length;
    	this.width=width;
        
    }

    // Implement abstract method
    double calculateArea() {
        return length * width;
    }
}
