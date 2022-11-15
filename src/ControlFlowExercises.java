import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//       int i = 5;
//       while (i <= 15) {
//           System.out.print(i + " "); i++;
//       }
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }


//       int i = 0;
//       do {
//            System.out.println(i);
//            i += 2;
//       }while(i <= 100);
//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }



//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        } while ( i <= 1000000);
//        for (long i = 2; i <= 1000000; i *= i) {
//        System.out.println(i);
//        }


////        🐰Fizzbuzz
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(i +" ");
//            if (i % 5 == 0 && i % 3 == 0){
//                System.out.println("FizzBuzz");
//            } else if ( i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if ( i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i +" ");
//            }
//        }


        //🐰Display a table of powers.
        Scanner s = new Scanner(System.in);
        String choice = "y";
//        do {
            System.out.println("What number would you like to go up to? ");
            int userInt = s.nextInt();
            System.out.println("");
            System.out.println("Here is your table!");
            System.out.println("");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userInt; i++) {
                System.out.println(i + "      | " + (i * i) + "       |" + "  " + (i * i * i));
            }
            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            String select = s.next();
            System.out.println();

//        } while (select.equalsIgnoreCase("n"));

//
//        System.out.println("Enter the number for grade: ");
//        int grade = s.nextInt();
//        if(grade <= 49 && grade >= 0){
//            System.out.printf("Your grade is %s\n","F-");
//        }else if(grade <= 55 && grade >= 50) {
//            System.out.printf("Your grade is %s\n", "F");
//        }else if(grade <= 59 && grade >= 56) {
//            System.out.printf("Your grade is %s\n", "F+");
//        }else if(grade <= 62 && grade >= 60) {
//            System.out.printf("Your grade is %s\n", "D-");
//        }else if(grade <= 64 && grade >= 63) {
//            System.out.printf("Your grade is %s\n", "D");
//        }else if(grade <= 66 && grade >= 65) {
//            System.out.printf("Your grade is %s\n", "D+");
//        }else if(grade <= 70 && grade >= 67) {
//            System.out.printf("Your grade is %s\n", "C-");
//        }else if(grade <= 75 && grade >= 71) {
//            System.out.printf("Your grade is %s\n", "C");
//        }else if(grade <= 79 && grade >= 76) {
//            System.out.printf("Your grade is %s\n", "C+");
//        }else if(grade <= 82 && grade >= 80) {
//            System.out.printf("Your grade is %s\n", "B-");
//        }else if(grade <= 85 && grade >= 83) {
//            System.out.printf("Your grade is %s\n", "B");
//        }else if(grade <= 87 && grade >= 86) {
//            System.out.printf("Your grade is %s\n", "B+");
//        }else if(grade <= 91 && grade >= 88) {
//            System.out.printf("Your grade is %s\n", "A-");
//        }else if(grade <= 93 && grade >= 92) {
//            System.out.printf("Your grade is %s\n", "A");
//        }else if(grade <= 100 && grade >= 94) {
//            System.out.printf("Your grade is %s\n", "A+");
//        }else{
//            //This is not a valid grade between 0 and 100
//            System.out.println("Invalid grade value");
//        }
    }
}



