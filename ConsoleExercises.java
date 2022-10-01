
import java.util.Scanner;




public class ConsoleExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name NOW!: ");
        String nameInput = input.nextLine();
        System.out.printf("Nice to meet you %s %n", nameInput);
        input.close();




    }
}
