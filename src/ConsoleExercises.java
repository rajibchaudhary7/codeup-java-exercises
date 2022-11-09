import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: \"" + userInput + "\"");

        System.out.println("Enter you three favorite cities: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.println("You entered: " + "\n" + userInput1 + "\n" + userInput2 + "\n" + userInput3 + "\n");

        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.next();
        System.out.println("Sentence you entered is: " + userSentence);

        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String userSentence1 = scanner.nextLine();
        System.out.println("Sentence you entered is: " + userSentence1);

//🐰 Calculate the perimeter and area of Codeup's classrooms
        scanner.nextLine();
        System.out.println("Enter length of your classroom: ");
        String a = scanner.nextLine();
        System.out.println("Enter width of your classroom: ");
        String b = scanner.nextLine();
        System.out.println("Area of your classroom is: " + (Integer.parseInt(a) * Integer.parseInt(b)));
        System.out.println("The perimeter of your classroom is: " + 2 * (Integer.parseInt(a) + Integer.parseInt(b)));

        System.out.println("Enter length of your classroom: ");
        double x = scanner.nextDouble();
        System.out.println("Enter width of your classroom: ");
        double y = scanner.nextDouble();
        System.out.println("Enter height of your classroom: ");
        double z = scanner.nextDouble();
        double perimeter = 2 * (x + y);
        double area = x * y;
        double volume = x * y * z;

        System.out.printf("Perimeter is 2 * (%.2f + %.2f) = %.2f %n", x, y, perimeter);
        System.out.printf("Area is %.2f * %.2f = %.2f %n", x, y, area);
        System.out.printf("Volume is %.2f * %.2f * %.2f = %.2f %n", x, y, z, volume);
        scanner.useDelimiter("\n");

        System.out.println("Enter length of your classroom: ");
        int p = scanner.nextInt();
        System.out.println("Enter width of your classroom: ");
        int q = scanner.nextInt();
        System.out.println("Area of your classroom is: " + (p * q));
        System.out.println("The perimeter of your classroom is: " + 2 * (p + q));
    }
}
