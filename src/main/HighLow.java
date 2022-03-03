package main;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 100) + 1;
        int numGuesses = 0;
        boolean guessedRight = false;
        System.out.println("I have chosen an integer between 1 and 100.");
        System.out.println("See how many guesses it takes for you to guess it right (limit 10).");
        int userGuess = sc.nextInt();
        while (userGuess < 1 || userGuess > 100) {
            System.out.println("Sorry, that's outside the range. Try again.");
            userGuess = sc.nextInt();
        }
        do {
            String higherOrLower = guessInteger(guessNumber, userGuess);
            if (higherOrLower == "GOOD GUESS!") {
                guessedRight = true;
                System.out.println(higherOrLower);
            } else {
                guessedRight = false;
                System.out.println(higherOrLower);
                userGuess = sc.nextInt();
            }
            numGuesses++;
            if (numGuesses == 10) {
                break;
            }
        } while (!guessedRight);
        System.out.println("The correct answer is " + guessNumber + ".");
        if (numGuesses == 10) {
            System.out.println("Sorry, you ran out of guesses.");
        } else {
            System.out.println("That took you " + numGuesses + " attempts.");
        }
    }
    public static String guessInteger(int seed, int guess) {
            if (guess > seed) {
                return "LOWER";
            } else if (guess < seed) {
                return "HIGHER";
            } else {
                return "GOOD GUESS!";
            }
    }
}
