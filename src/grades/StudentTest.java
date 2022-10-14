package src.grades;
import src.*;

public class StudentTest {
    public static void main(String [] args){
        Student carl =  new Student();
        carl.addGrade(90);
        carl.addGrade(80);
        System.out.println(carl.getGradeAverage());
    }
}
