package grades;

import util.Input;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        //    Create a map for students and GitHub usernames
//    Create a class named GradesApplication with a main method. Inside the main method, create a
//    HashMap named students. It should have keys that are strings that represent github usernames, and values that are
//    Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//    Be creative! Make up GitHub usernames and grades for your student objects.


        Student one = new Student("Andres", new ArrayList<>());
        one.addGrade(80);
        one.addGrade(90);
        one.addGrade(95);

        Student two = new Student("Ethan", new ArrayList<>());
        two.addGrade(85);
        two.addGrade(94);
        two.addGrade(93);

        Student three = new Student("Jeffrey", new ArrayList<>());
        three.addGrade(82);
        three.addGrade(93);
        three.addGrade(96);

        Student four = new Student("Isaiah", new ArrayList<>());
        four.addGrade(87);
        four.addGrade(97);
        four.addGrade(91);

        HashMap<String, Student> students = new HashMap<>();

        students.put("Andres4", one);
        students.put("Ethan5", two);
        students.put("Jeffrey6", three);
        students.put("Isaiah7", four);
        System.out.println(students.keySet() + "\n");

        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our Students:\n");

        for (String username : students.keySet()) {
            System.out.print("|" + username + "|" + " ");
        }
        ;
        System.out.println("\n\nWhat student would you like to see more information on?");
        Input a = new Input();
//        for (String username : students.keySet()) {
//            if (a.getString().equalsIgnoreCase(username)) {
//                System.out.println("Name: " + students.keySet());
//            }
        students.forEach((key, value) -> {
            if (a.getString().equalsIgnoreCase("key")) {
                System.out.println("Name:" + value.getName());
            }
        });


        }
    }
//}

