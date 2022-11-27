package util;

public class InputTest {
    public static void main(String[] args) {
        Input a = new Input();
        System.out.println("What is your favorite city?");
        String favTown = a.getString();
        System.out.println(favTown);

        System.out.print("Do you want to continue? Y/N");
        boolean yesNo = a.yesNo();
        System.out.println(yesNo);

        System.out.print("Please enter a whole number between 1 and 10: ");
        int intInRange = a.getInt(1, 10);
        System.out.println(intInRange);

        System.out.print("Please enter an integer: ");
        int integer = a.getInt();
        System.out.println(integer);

        System.out.print("Please enter a number between 1.00 and 10.00: ");
        double doubleInRange = a.getDouble(1.00, 10.00);
        System.out.println(doubleInRange);

    }

}

