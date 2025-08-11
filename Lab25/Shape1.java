package Lab25;

public interface Shape1 {
	double getArea();
	}


//class1 circle
class Rect implements Shape1 {
    double len, wid;

    Rect(double l, double w) {
        len = l;
        wid = w;
    }

    public double getArea() {
        return len * wid;
    }
}
//Class2 Circle
class Cir implements Shape1 {
    double rad;

    Cir(double r) {
        rad = r;
    }

    public double getArea() {
        return Math.PI * rad* rad;
    }
}
//Class3 Triangle

class Tri implements Shape1 {
    double base, height;

    Tri(double b, double h) {
        base = b;
        height = h;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}



