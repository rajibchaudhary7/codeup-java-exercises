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


//        🐰Fizzbuzz
        for (int i = 1; i <= 100; i++) {
            System.out.print(i +" ");
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i +" ");
            }
        }
    }
}
