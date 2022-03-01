import java.util.Scanner;

public class ConsoleExercises {
    public static void main() {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);
//        String integer1 = scanner.nextInt("Enter an integer:");
        String word1 = scanner.next("Type three words into the box, please.");
        String word2 = scanner.next();
        String word3 = scanner.next();
//        System.out.printf("The value of pi is approximately %,.2f",pi);
        System.out.println("Your three words are " + word1 + ", " + word2 + ", " + word3 + ".");
    }
}
