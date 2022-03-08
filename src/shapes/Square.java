package shapes;

public class Square extends Rectangle {
    private double side;
    //Default constructor
    public Square(double rectLength, double rectWidth) {
        super(rectLength, rectWidth);
    }
//One-arg constructor
    public Square(double side) {
        super(side,side);
        this.side = side;
        System.out.println("In square constructor.");
    }

//Methods that override the equivalent methods of the superclass Rectangle
    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return Math.pow(this.side,2);
    }
}
