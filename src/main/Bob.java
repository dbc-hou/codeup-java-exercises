package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("YOU talk to Bob. I can't tell that kid anything");
        Scanner bobScan = new Scanner(System.in);
        String talkToBob = bobScan.nextLine();
        if (talkToBob.endsWith("?")) {
            System.out.println("Sure.");
        } else
        if (talkToBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else
        if (talkToBob.length() == 0) {
            System.out.println("Fine, be that way!");
        } else {
            System.out.println("Whatever.");
        }

    }
}
