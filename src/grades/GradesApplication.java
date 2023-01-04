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

        students.put("Andres4", one);
        students.put("Ethan5", two);
        students.put("Jeffrey6", three);
        students.put("Isaiah7", four);
        System.out.println("\n" + students + "\n");

        System.out.println("Welcome!\n" + "\n" + "Here are the GitHub usernames of our Students:\n");

        Input a = new Input();
        String choice;
        do {
//            for (Map.Entry<String, Student> student : students.entrySet()) {
//                System.out.print("|" + student.getKey() + "|  ");
//            }
            for (String student: students.keySet()){
                System.out.print("|" + student + "| ");
            }
            System.out.println("\n\nWould you like to see more information any one student above or all?");
            String input = a.getString();
                if (students.containsKey(input)) {
                    System.out.println("Name: " + students.get(input).getName() + " - "
                            + "Github Username: " + input + " Current Average: " + students.get(input).getGradeAverage()
                    + " Grades: " + students.get(input).grades);

//                    Prints csv report of all the students.
                } else if (input.equalsIgnoreCase("all")) {
                    System.out.println("\nCSV report of all students:\n" +
                            "\nname,github_username, average:\n");
                    for (Map.Entry<String, Student> student : students.entrySet()) {
                        System.out.println(student.getValue().getName() + "," +
                                student.getKey() + "," + student.getValue().getGradeAverage());
                    }
                } else {
                    System.out.printf("Sorry, no student found with the Github username of %s\n", input);
                }

//            Asks the user if they want to continue?

            System.out.println("\n Would you like to see another student? Y/N");
            choice = a.getString();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Thank you and Have a wonderful day!");
    }
}



