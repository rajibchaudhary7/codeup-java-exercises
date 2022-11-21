import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean run = true;
        while(run) {
            String input = s.nextLine();
            if(input.trim().endsWith("?")){
                System.out.println("Sure.");
            }else if(input.trim().endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(input.length() == 0){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever.");
                break;
            }

        }
    }
}
