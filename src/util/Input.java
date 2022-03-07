package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }
    public boolean yesNo() {
        String scInput = scanner.nextLine();
        if (scInput.equalsIgnoreCase("y") || scInput.equalsIgnoreCase("yes") || scInput.equalsIgnoreCase("true")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int scIntInput = scanner.nextInt();
        if (scIntInput < min || scIntInput > max) {
            System.out.println("Please follow the instructions and enter an integer.");
            getInt(min, max);
        } else {
            return scIntInput;
        }
        return 0;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double scDblInput = scanner.nextDouble();
        if (scDblInput < min || scDblInput > max) {
            System.out.println("Please follow the instructions and enter something numeric.");
            getDouble(min,max);
        } else {
            return scDblInput;
        }
        return 0;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
