package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input();
//        System.out.println("What's your name, user?");
//        String yourName = myInput.getString();
//        System.out.printf("Welcome, %s!",yourName);
//        System.out.println();
//        System.out.println("Are you enjoying your web development training?");
//        boolean enjoying = myInput.yesNo();
//        if (enjoying) {
//            System.out.println("I'm glad to know that!");
//        } else {
//            System.out.println("Maybe it will go better in the weeks to come.");
//        }
//        System.out.println();
        System.out.println();
        int yourAge = myInput.getInt("What's your age in years? (Integer only, please.)");
        System.out.println("Cool. The square root of that is " + Math.sqrt(yourAge) + ".");
        System.out.println();
        int myBinaryConversion = myInput.getBinary("Let's convert binary numbers to decimal! Enter a string of 0's and 1's:");
        System.out.println("That converts to " + myBinaryConversion + " in base 10.");
        System.out.println();
        int myHexConversion = myInput.getHex("Now we'll try hexadecimal to decimal. Enter a hexadecimal number (only characters allowed are 0 through 9 and A through F):");
        System.out.println("That converts to " + myHexConversion + " in base 10.");
        System.out.println();
        double yourRadius = myInput.getDouble("Last question: Enter any positive value for the radius of a circle.");
        System.out.println("The circumference of a circle with radius " + yourRadius + " is " + Math.PI * 2 * yourRadius + ".");
        System.out.println("The area of a circle with radius " + yourRadius + " is " + Math.PI * yourRadius * yourRadius + ".");
        System.out.println("All done! I enjoyed playing with numbers—and with you!");
        myInput.closeMe();
    }
}
