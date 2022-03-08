package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println("What's your name, user?");
        String yourName = myInput.getString();
        System.out.printf("Welcome, %s!",yourName);
        System.out.println();
        System.out.println("Are you enjoying your web development training?");
        boolean enjoying = myInput.yesNo();
        if (enjoying) {
            System.out.println("I'm glad to know that!");
        } else {
            System.out.println("Maybe it will go better in the weeks to come.");
        }
        System.out.println();
        System.out.println("What's your age in years? (Integer only, please.)");
        int yourAge = myInput.getInt();
        System.out.println("Cool. The square root of that is " + Math.sqrt(yourAge) + ".");
        System.out.println("Last question: Enter any positive value for the radius of a circle.");
        double yourRadius = myInput.getDouble();
        System.out.println("The circumference of a circle with radius " + yourRadius + " is " + Math.PI * 2 * yourRadius + ".");
        System.out.println("The area of a circle with radius " + yourRadius + " is " + Math.PI * yourRadius * yourRadius + ".");
        myInput.closeMe();
    }
}
