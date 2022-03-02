package main;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
//        int j = 100;
//        long k = 2;
        while (i<=15) {
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Done!");

        System.out.println("Now counting backward by 5's:");
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j>=-10);
        for (int j = 0; j >= -10 ; j-=5) {
            System.out.println(j);
        }

        System.out.println("Anyone for square dancing?");
//        do {
//            System.out.println(k);
//            k = (long) Math.pow(k,2);
//        } while (k<=1000000L);
        for (long k = 2; k<=1000000L; k *= k) {
            System.out.println(k);
        }
    }
}
