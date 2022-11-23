package util;
import java.util.Scanner;

public class Input {
    private Scanner s;

    public Input() {
        this.s = new Scanner(System.in);
    }
    public String getString(){
        return s.nextLine();
    }
    public boolean yesNo() {
        String input = s.next();
        System.out.println(input);
        if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
        return true;
        }else{
            return false;
        }
    }
    public int getInt(int min, int max){
        int userInt = s.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.println("Enter a valid integer between " + min + "and"
            + max);
            return getInt(min, max);
        }
    }
//    public int getInt(){
//        return s.nextInt();
//    }
    public int getInt(){
    try{ String a = getString();
        return Integer.valueOf(a);
    }
    catch(NumberFormatException e){
        System.out.println("something went wrong" + e.getMessage());
        System.out.println("Here is some more detail:");
        e.printStackTrace();
        return getInt();
        }

    }

    public double getDouble(double min, double max){
        double userInt = s.nextInt();
        if(userInt >= min && userInt <= max){
            return userInt;
        }else{
            System.out.println("Enter a valid integer between " + min + "and"
                    + max);
            return getDouble(min, max);
        }
    }
//    public double getDouble(){
//        return s.nextDouble();
//    }
public double getDouble(){
    try{ String a = getString();
        return Double.valueOf(a);
    }
    catch(NumberFormatException e){
        System.out.println("something went wrong" + e.getMessage());
        System.out.println("Here is some more detail:");
        e.printStackTrace();
        return getDouble();
    }

}
}

