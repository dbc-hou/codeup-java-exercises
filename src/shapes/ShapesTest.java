package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        Rectangle box2 = new Square(5);
        System.out.println("Box1 perimeter is " + box1.getPerimeter());
        System.out.println("Box1 area is " + box1.getArea());
        System.out.println("Box2 perimeter is " + box2.getPerimeter());
        System.out.println("Box2 area is " + box2.getArea());
    }
}
