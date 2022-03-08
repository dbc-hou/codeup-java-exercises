package shapes;

public class Rectangle {
    protected double length;
    protected double width;

//Constructor
    public Rectangle(double rectLength, double rectWidth) {
        this.length = rectLength;
        this.width = rectWidth;
        System.out.println("In rectangle constructor.");
    }

//Getters for the instance variables length & width
    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }

//Setters for the instance variables length & width
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }
}
