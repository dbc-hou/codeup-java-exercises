package main;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Person[] everyone = {new Person("Wilma"),new Person("Betty"),new Person("Barney")};
        System.out.println(Arrays.toString(numbers));
        for (Person n : everyone) {
            System.out.println(n.getName());
        }
        Person[] extendedArray = new Person[everyone.length + 1];
        Person john = new Person("John");
        extendedArray = addPerson(everyone,john);
        for (Person q : extendedArray) {
            System.out.println(q.getName());
        }
    }

    public static Person[] addPerson(Person personArray[], Person newPerson) {
        Person[] newArray;
        int personArrayElements = personArray.length;
        newArray = new Person[personArrayElements + 1];
        for (int i = 0; i < personArrayElements; i++) {
            newArray[i] = personArray[i];
        }
        newArray[personArrayElements + 1] = newPerson;
        return newArray;
    }
}
