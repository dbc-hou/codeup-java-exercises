package shapes;

public class Square extends Rectangle {
//Constructor
    public Square(double rectLength, double rectWidth) {
        super(rectLength, rectWidth);
    }
//One-arg constructor
    public Square(double side) {
        super(side,side);
    }

//Methods that override the equivalent methods of the superclass Rectangle
    public double getPerimeter() {
        return super.getLength() * 4;
    }

    public double getArea() {
        return Math.pow(super.getLength(),2);
    }
}
