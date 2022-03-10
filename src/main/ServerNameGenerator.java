package main;

import java.sql.Array;

public class ServerNameGenerator {
    static String[] array1 = {"angry","bitter","codependent","delicious","eager","formulaic","gritty","hungry","idolatrous","jealous"};
    static String[] array2 = {"Kuwait","Libya","Mongolia","Norway","Oman","Peru","Qatar","Russia","Switzerland","Turkey"};

    public static void main(String[] args) {
        String adjective = pickOneFromArray(array1);
        String noun = pickOneFromArray(array2);
        System.out.printf("Here is your server name:\n%s-%s",adjective,noun);
    }

    public static String pickOneFromArray(String[] thisArray) {
        int numElements = thisArray.length;
        int randomPicker = (int) (Math.random() * numElements);
        return thisArray[randomPicker];
    }
}
