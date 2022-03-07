package shapes;

public class Circle {
    final double pi = Math.PI;

    public Circle(double radius) {
        Circle myCircle = new Circle(radius);
    }

    public double getArea(double r) {
        return Math.pow(r,2) * pi;
    }

    public double getCircumference(double r) {
        return 2 * r * pi;
    }
}
