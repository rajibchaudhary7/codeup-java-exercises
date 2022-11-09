public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("");
        System.out.print("Hello, World!");

//Create an int variable named myFavoriteNumber and assign your
// favorite number to it, then print it out to the console.
        int myFavoriteNumber = 5;
        System.out.println("\n");
        System.out.println(myFavoriteNumber);

        String myString = "Billiards";
        System.out.println(myString);

        myString = "A";
        System.out.println(myString);
//        myString with a character value will be assigned the reverse cannot

//        myString = 3.14159;
//        my string will only accept a string value not number

        long myNumber;
//        System.out.println(myNumber);
//        Error appears: variable myNumber might not have been initialized

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        Error appears: incompatible types: possible lossy conversion from
//        double to long

//        long myNumber = 123L;
//        System.out.println(myNumber);

//        long myNumber = 123;
//        System.out.println(myNumber);

//        long myNumber = 3.14;
//        System.out.println(myNumber);
//        Error : incompatible types: possible lossy conversion from double to float

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

//        int x = 5;
        System.out.println(++x);
        System.out.println(x);

//        class = "Myclass";
//        System.out.println(class);
//        Error message : illegal start of expression

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
//        Error: Exception in thread "main" java.lang.ClassCastException: class java.lang.String
//        cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at HelloWorld.main(HelloWorld.java:55)


//        int three = (int) "three";
//        Error: java.lang.String cannot be converted to int


//🐰   Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y = y * x;
//        y += x;
//
//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
//        x /= y;
//        y -= x;

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        What happens if you increment a numeric variable past the type's capacity?

//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value
//        for the int type.












    }
}
