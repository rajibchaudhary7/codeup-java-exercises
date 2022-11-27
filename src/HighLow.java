import util.Input;



public class HighLow {
    public static void random() {
        int num = (int) Math.floor(Math.random() * 100 + 1);
        System.out.println("Random number is: " + num);
        System.out.println("Guess a number between 1 and 100: ");
        Input a = new Input();
        int b = a.getInt(1,100);
        if(num > b){
            System.out.println("Guess a number : Higher");
        }
        else if(num < b){
            System.out.println("Guess a number: Lower");
        }
        else{
            System.out.println("GOOD GUESS");
        }
    }

    public static void main(String[] args) {
        random();
    }
}
