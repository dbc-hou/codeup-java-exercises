public class HelloWorld {
    public static void main(String [] args) {
        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);
        String myString = "3.14159";
        System.out.println(myString);
        float myNumber = 3.14f;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
        int x = 4;
        x += 5;
        int y = 4;
        y *= x;
        x /= y;
        y -= x;
        System.out.println("x = " + x + " and y = " + y);
    }
}
