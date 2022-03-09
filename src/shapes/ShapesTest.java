package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Square(6);
//        Rectangle box1 = myShape;;
//        System.out.println("Box1 perimeter is " + box1.getPerimeter());
//        System.out.println("Box1 area is " + box1.getArea());
//        System.out.println("Box2 perimeter is " + box2.getPerimeter());
//        System.out.println("Box2 area is " + box2.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}
