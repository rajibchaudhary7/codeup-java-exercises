package util;

public class InputTest {
    public static void main(String[] args) {
        Input a = new Input();

//        String favSentence = a.getString("Please enter your favorite sentence!");
//        System.out.println(favSentence);

        System.out.print("Do you want to continue? ");
        boolean yesNo = a.yesNo();
        System.out.println(yesNo);

        System.out.print("Please enter a whole number between 1 and 10: ");
        int numInRange = a.getInt(1, 10);
        System.out.println("You entered " + numInRange);

//        System.out.print("Please enter a whole number: ");
//        int num = in.getNum();
//        System.out.println("You entered: " + num);

        System.out.print("Please enter a whole number between 1.50 and 15.50: ");
        double dNum = (int) a.getDouble(1.50, 15.50);
        System.out.println("You entered " + dNum);

    }

}

