package main;
import java.util.Scanner;
//Validation in this could be improved by calling .hasNextInt() on the Scanner object
//to make certain that the user has entered an integer.

public class MethodsExercises {
    public static void main(String[] args) {
        boolean userContinue1 = true;
        boolean userContinue2 = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's have fun with numbers! Enter an integer:");
        int firstNum = input.nextInt();
        System.out.println("Now enter a different integer, preferably a smaller one:");
        int secondNum = input.nextInt();
        System.out.printf("%d + %d = " + add(firstNum,secondNum),firstNum,secondNum);
        System.out.println();
        System.out.printf("%d - %d = " + subtract(firstNum,secondNum),firstNum,secondNum);
        System.out.println();
        System.out.printf("%d * %d = " + multiply(firstNum,secondNum),firstNum,secondNum);
        System.out.println();
        System.out.printf("%d / %d = " + divide(firstNum,secondNum),firstNum,secondNum);
        System.out.println();
        System.out.printf("%d mod %d = " + modulo(firstNum,secondNum),firstNum,secondNum);
        System.out.println();

        int userInput;
        do {
            userInput = getInteger(1,10);
            System.out.println("User Input = " + userInput);
            long myFactorial = factorial(userInput);
            System.out.printf("The factorial of %d is %d",userInput,myFactorial);
            System.out.println();
            System.out.println("Would you like to enter another? (y/n)");
            String userResponse1 = input.nextLine();
            if (!(userResponse1.equalsIgnoreCase("y"))) {
                userContinue1 = false;
            }
        } while (userContinue1);

        do {
            System.out.println("You are rolling a pair of dice. How many sides on each die (up to 20)?");
            int howManySides = input.nextInt();
            int rollTwoDice = rollThemBones(howManySides);
            System.out.println("You rolled a/an " + rollTwoDice);
            System.out.println("Care to roll again? (y/n)");
            String userResponse2 = input.next();
            if (!(userResponse2.equalsIgnoreCase("y"))) {
                userContinue2 = false;
            }
        } while (userContinue2);
        input.close();
    }

    public static double add(double addend1, double addend2) {
        return addend1 + addend2;
    }

    public static double subtract(double subtrahend, double subtractor) {
        return subtrahend - subtractor;
    }

    public static double multiply(double multiplier, double multiplicand) {
        return multiplier * multiplicand;
    }

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            System.out.println("Error: you tried to divide by zero.");
            return 0;
        } else {
            return dividend / divisor;
        }
    }

    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 10: ");
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            return getInteger(min,max);
        } else {
            return userInput;
        }
    }

    public static long factorial(int input) {
        int output = 1;
        if (input >= 1 && input <= 10) {
            for (int i = 1; i <= input; i++) {
                output *= i;
            }
            return output;
        } else {
            return factorial(input);
        }
    }

    public static int rollThemBones(int numSides) {
        if (numSides > 0 && numSides <=20) {
            int die1 = (int) (Math.random() * numSides + 1);
            int die2 = (int) (Math.random() * numSides + 1);
            int sum = die1 + die2;
            return sum;
        } else {
            return rollThemBones(numSides);
        }
    }
}
