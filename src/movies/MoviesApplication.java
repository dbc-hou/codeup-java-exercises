package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) throws InterruptedException {
        Movie[] mArray = MoviesArray.findAll();
        Input i = new Input();
        String userChoice = null;
        while (userChoice != "0") {
            System.out.println("What would you like to do?");
            System.out.println("0 - Exit");
            System.out.println("1 - View all movies");
            System.out.println("View movies in a specific category:");
            System.out.println("2 - animated");
            System.out.println("3 - comedy");
            System.out.println("4 - drama");
            System.out.println("5 - horror");
            System.out.println("6 - musical");
            System.out.println("7 - scifi");
            System.out.println();
            System.out.println("Enter your choice:");
            userChoice = i.getString();
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
            for (Movie m : mArray) {
                if (m.getCategory().equalsIgnoreCase(categorySelected) || categorySelected.length() == 0) {
                    System.out.println(m.getName() + " -- " + m.getCategory());
                }
            }
            System.out.println();
            Thread.sleep(2000);
        }

    }
}
