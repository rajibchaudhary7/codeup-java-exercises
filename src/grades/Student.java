package grades;

import java.util.ArrayList;

public class Student {
    private String stdName;
//    private ArrayList<Integer> grades;
    protected ArrayList<Integer> grades;




    public Student(String name){
        this.stdName = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
       return this.stdName;
    };


    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(double grade: grades){
            sum += grade;
        }
        return sum/grades.toArray().length;
    };


}
