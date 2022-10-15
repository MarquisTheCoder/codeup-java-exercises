package src.grades;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    // returns the student's name
    public String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
