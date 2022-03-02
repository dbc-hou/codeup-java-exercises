package main;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %,.2f",pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("Enter an integer, please: ");
        int integer1 = scanner.nextInt();
        System.out.println("You have typed " + integer1);
        System.out.println("Type three words into the box, please.");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("Your three words are %s, %s, and %s.",word1,word2,word3);
        scanner.nextLine();
        System.out.println("Now type a sentence from Shakespeare.");
        String sentence = scanner.nextLine();
        System.out.println("Did you really type " + sentence + "? That's one of my favorite quotes!");
        System.out.println("Enter the length of your room, press Return, enter the width, press Return, and enter the height.");
        float length = scanner.nextFloat();
//        System.out.println("And what's the width in feet?");
        float width = scanner.nextFloat();
        float height = scanner.nextFloat();
        float area = length * width;
        float volume = area * height;
        float perimeter = (length * 2) + (width * 2);
        System.out.printf("So the area of your room is %.2f square feet;\n " +
                "the perimeter is %.2f feet;\n " +
                "the volume is %.2f cubic feet.",area,perimeter,volume);
        scanner.close();
    }
}
