package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        MoviesArray mArray = new MoviesArray();
        Input i = new Input();
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
        String categorySelected;
        String userChoice = i.getString();
        switch userChoice {
            case 0:
                i.closeMe();
                break;
            case 1:
                for (Movie m : mArray.findAll) {
                    System.out.println(m.name + " -- " + m.category);
                }
                break;
            case 2:
                categorySelected = "animated";
                break;
            case 3:
                categorySelected = "comedy";
                break;
            case 4:
                categorySelected = "drama";
                break;
            case 5:
                categorySelected = "horror";
                break;
            case 6:
                categorySelected = "musical";
                break;
            case 7:
                categorySelected = "scifi";
                break;
            default:

        }
    }
}
