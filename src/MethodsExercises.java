import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        addition(3.4, 4.4);
//        subtraction(4, 5);
//        multiplication(6, 7);
//        division(9, 3);
//        modulus(11, 4);
        getInteger(5, 9);
        factorial();
    }

    public static void addition(double x, double y) {

        System.out.println(x + y);

    }

    public static void subtraction(double x, double y) {
        System.out.println(x - y);
    }

    public static void multiplication(double x, double y) {
        System.out.println(x * y);
    }

    public static void division(double x, double y) {
        System.out.println(x / y);
    }

    public static void modulus(double x, double y) {
        System.out.println(x % y);
    }


    //    Create a method that validates that user input is in a certain range and returns that input as an integer
//    if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//        The method signature should look like this:
    public static int getInteger(int min, int max) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer between " + min + " and " + max + ": ");
        int input = s.nextInt();
        if (input > max || input < min) {
            System.out.println("This is an invalid entry!");
            return getInteger(min, max);
        }
            return input;
    }

    ;


    //    Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
    public static String factorial() {
        Scanner s = new Scanner(System.in);
        int userInput = getInteger(1, 10);
        String repeat = "y";
        String result = "";
        for (int i = 1; i <= userInput; i++) {
            result += factorial(i);
        }
        System.out.println(result);
        System.out.println("Would you like to continue? Enter Y or N:");
        repeat = s.nextLine();
        if (repeat.equalsIgnoreCase("Y")) {
            factorial();
        } else {
            System.out.println("Finished calculation!");
        }
        return "";
    }

    public static String factorial(int a) {
        String result = "\n" + a + "! =";
        long b = 1L;
        for (int i = 1; i <= a; i++) {
            result += " x " + i ;
            b *= i;
        }
        if (a == 10) {
            result = result.substring(0, 5) + result.substring(8) + " = "
                    + b + "\n";
        }else{
            result = result.substring(0, 5) + result.substring(7) + " = "
                    + b + "\n";
        }
        return result;
    }

//    Create an application that simulates dice rolling.
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

    public static void diceRoll(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of sides of a pair of dice: ");
        int sides = s.nextInt();
        System.out.println("Ready to roll the dice? Y or N: ");
        String userChoice = s.next();
//        If (userChoice.equalsIgnoreCase("y")){
//            System.out.println("die 1:" + (int)Math.floor(Math.random() * sides) +1);
//            System.out.println("die 2:" + (int)Math.floor(Math.random() * sides) +1);
//        }




    }
}



