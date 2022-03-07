package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input myInput = new Input();
        boolean repeat = true;
        do {
            System.out.println("Please enter a radius for your circle:");
            double myRadius = myInput.getDouble();
            Circle myCircle = new Circle(1);
            double myCircumference = myCircle.getCircumference(myRadius);
            double myArea = myCircle.getArea(myRadius);
            System.out.printf("The circumference of a circle with radius %d is %d.", myRadius, myCircle);
            System.out.println();
            System.out.printf("The area of a circle with radius %d is %d.", myRadius, myArea);
            System.out.println("Would you like to do that again? (y/n)");
            repeat = myInput.yesNo();
            if (!repeat) {
                System.out.println("Thank you for your time.");
                continue;
            }
        } while (repeat);
    }
}
