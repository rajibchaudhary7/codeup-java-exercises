package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student Rajib = new Student("Rajib", new ArrayList<>());
        Rajib.addGrade(100);
        Rajib.addGrade(80);
        Rajib.addGrade(90);
        Rajib.addGrade(50);
        System.out.println(Rajib.getGradeAverage());

    }
}
