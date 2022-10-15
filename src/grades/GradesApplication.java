package src.grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String [] args){
        HashMap<String, Student> students =  new HashMap<>();
        Student leslie = new Student();
        Student jacob = new Student();
        Student mason = new Student();
        Student frances = new Student();

        leslie.setName("Leslie");
        leslie.addGrade(-20000);
        leslie.addGrade(40);
        leslie.addGrade(90);

        jacob.setName("Jacob");
        jacob.addGrade(10);
        jacob.addGrade(40);
        jacob.addGrade(90);

        mason.setName("Mason");
        mason.addGrade(-10);
        mason.addGrade(-10);
        mason.addGrade(120);

        frances.setName("Frances");
        frances.addGrade(70);
        frances.addGrade(90);
        frances.addGrade(99);

        students.put("leslieCodez", leslie);
        students.put("jacobStritzz", jacob);
        students.put("francesperez", frances);
        students.put("WoodyMas", mason);

        System.out.println("Which student would you like to checkout?: ");
        for(String username: students.keySet()){
            System.out.format("|%s| ", username);
        }

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do{

            System.out.print("\nWhat student would you like to see more information on?: ");
            userInput = scanner.nextLine();

            if (userInput.equals("All") || userInput.equals("all")) {
                double averageSum = 0;
                for(String student: students.keySet()){
                    System.out.format("Name: %s\nAverage: %s\n",
                            students.get(student).getName(),
                            students.get(student).getGradeAverage()
                            );
                    averageSum += students.get(student).getGradeAverage();
                }
                System.out.format("Average class grade: %f\n",
                        averageSum / students.size());
            }else if(!students.containsKey(userInput)) {
                if(!userInput.equals("quit")){
                    System.out.println("That student doesnt go here!");
                }
            } else{
                Student currentStudent = students.get(userInput);
                System.out.format("Name: %s\nGithub: @%s\nAverage:%s\n",
                        currentStudent.getName(),
                        userInput, currentStudent.getGradeAverage());
            }
        }while(!userInput.equals("quit"));
    }
}
