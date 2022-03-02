package main;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        int x = 0;
        Scanner input = new Scanner(System.in);
//        int j = 100;
//        long k = 2;

        while (i <= 15) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Done!");

        System.out.println("Now counting backward by 5's:");
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j>=-10);
        for (int j = 0; j >= -10; j -= 5) {
            System.out.println(j);
        }

        System.out.println("Anyone for square dancing?");
//        do {
//            System.out.println(k);
//            k = (long) Math.pow(k,2);
//        } while (k<=1000000L);
        for (long k = 2; k <= 1000000L; k *= k) {
            System.out.println(k);
        }

        do {
            x++;
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("FIZZBUZZ");
            } else if ((x % 3 == 0) && !(x % 5 == 0)) {
                System.out.println("FIZZ");
            } else if (!(x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("BUZZ");
            } else {
                System.out.println(x);
            }
        } while (x <= 99);

//Table of squares & cubes:
        boolean doItAgain = true;
        do {
            System.out.println("Enter an integer below, please:");
            int intInput = input.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int m = 1; m <= intInput; m++) {
                System.out.printf("%-6d | %-7d | %-5d\n", m, m * m, m * m * m);
            }
            System.out.println("Would you like to do another one? (y/n)");
            String userResponse = input.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                doItAgain = false;
            }
        } while (doItAgain);

//Convert numeric grades to letters:
        String letterGrade;
        boolean wannaContinue = true;
        do {
            System.out.println("What is the student's numeric average?");
            int intGrade = input.nextInt();
            if (intGrade >= 99) {
                letterGrade = "A+";
            } else if (intGrade >= 88) {
                letterGrade = "A";
            } else if (intGrade >= 80) {
                letterGrade = "B";
            } else if (intGrade >= 67) {
                letterGrade = "C";
            } else if (intGrade >= 60) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Student's letter grade is a(n) " + letterGrade + ".");
            System.out.println("Do you have more grades to enter? (y/n)");
            String userAnswer = input.next();
            if (!userAnswer.equalsIgnoreCase("y")) {
                wannaContinue = false;
            }
        } while (wannaContinue);
        System.out.println("Thank you, all done!");
        input.close();
    }
}
