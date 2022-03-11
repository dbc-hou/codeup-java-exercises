package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) throws InterruptedException {
        Movie[] mArray = MoviesArray.findAll();
        Input i = new Input();
        String userChoice = null;
        do {
            printMenu();
            System.out.println("Enter your choice:");
            userChoice = i.getString();
            doUserChoice(userChoice,mArray);
            System.out.println();
            Thread.sleep(2000);
        } while (userChoice != "0");
    }

    private static void printMenu() {
        System.out.println("What would you like to do?");
        System.out.printf("\t0 - Exit\n");
        System.out.printf("\t1 - View all movies\n");
        System.out.println("View movies in a specific category:");
        System.out.printf("\t2 - animated\n");
        System.out.printf("\t3 - comedy\n");
        System.out.printf("\t4 - drama\n");
        System.out.printf("\t5 - horror\n");
        System.out.printf("\t6 - musical\n");
        System.out.printf("\t7 - scifi\n");
        System.out.println();
    }

    private static void doUserChoice(String userChoice, Movie[] movies) {
        String categorySelected = "";
        switch (userChoice) {
            case "0":
                System.exit(0);
            case "1":
                categorySelected = "";
                break;
            case "2":
                categorySelected = "animated";
                break;
            case "3":
                categorySelected = "comedy";
                break;
            case "4":
                categorySelected = "drama";
                break;
            case "5":
                categorySelected = "horror";
                break;
            case "6":
                categorySelected = "musical";
                break;
            case "7":
                categorySelected = "scifi";
                break;
            default:
        }
        for (Movie m : movies) {
            if (m.getCategory().equalsIgnoreCase(categorySelected) || categorySelected.length() == 0) {
                System.out.println(m.getName() + " -- " + m.getCategory());
            }
        }
    }
}
