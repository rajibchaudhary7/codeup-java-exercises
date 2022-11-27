package grades;
import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        //    Create a map for students and GitHub usernames
//    Create a class named GradesApplication with a main method. Inside the main method, create a
//    HashMap named students. It should have keys that are strings that represent github usernames, and values that are
//    Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//    Be creative! Make up GitHub usernames and grades for your student objects.

        HashMap<String, Student> students = new HashMap<String, Student>();
        Student one = new Student("Andres");
        one.getName();
        one.addGrade(80);
        one.addGrade(90);
        one.addGrade(95);

        Student two = new Student("Ethan");
        two.getName();
        two.addGrade(85);
        two.addGrade(94);
        two.addGrade(93);

        Student three = new Student("Jeffrey");
        three.getName();
        three.addGrade(82);
        three.addGrade(93);
        three.addGrade(96);

        Student four = new Student("Isaiah");
        four.getName();
        four.addGrade(87);
        four.addGrade(97);
        four.addGrade(91);

//        Map<String, Student> students = new HashMap<String, Student>();

        students.put("Andres4", one);
        students.put("Ethan5", two);
        students.put("Jeffrey6", three);
        students.put("Isaiah7", four);
        System.out.println("\n" + students.keySet() + "\n");

        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our Students:\n");

        for (Map.Entry<String, Student> student : students.entrySet()) {
            System.out.print("|" + student.getKey() + "|  ");
        }
        System.out.println("\n\nWhat student would you like to see more information on?");
//        boolean run = true;
//        while (run) {
            Input a = new Input();
            String input = a.getString();
//            if (input.equals(students.keySet())) {
                for (Map.Entry<String, Student> set : students.entrySet()) {
                    if (input.equalsIgnoreCase(set.getKey())) {
                        System.out.println("Name: " + set.getValue().getName() + " - "
                                + "Github Username: " + set.getKey() +
                                "\n" + "Current Average: " + set.getValue().getGradeAverage());
                    }

//                        System.out.println("\n Would you like to see another student? Y/N");
//                    } else if (input.equalsIgnoreCase("n")) {
//                        System.out.println("Thank you and Have a wonderful day!");
//                        break;
//                    }
                    else{
                        System.out.printf("Sorry, no student found with the Github username of %s" + "\n" +
                                "Would you like to see another student?", input);
                        break;
                    }
//
//                }


            }

        }
    }

//}


