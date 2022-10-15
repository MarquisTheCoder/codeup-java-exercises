package src;

import java.util.Scanner;
import java.lang.Math;

class Dice{
    public int roll;
    public Dice(int sides){
        this.roll = (int) (Math.random() * sides) + 1;
    }

}
public class MethodsExercises {
    public static int addition(int x, int y){
        return x + y;
    }
    public static int subtraction(int x, int y){
        return x - y;
    }
    public static int multiplication(int x, int y){
        return x * y;
    }
    public static int division(int x, int y){
        return x / y;
    }
    public static int getInteger(int min, int max){
       int userInput;
       Scanner scanner  = new Scanner(System.in);
       do{
           System.out.print("enter a number: ");
           userInput = Integer.parseInt(scanner.next());

       }while(userInput < min || userInput >  max);
       return userInput;
    }

    //Thanks to trevor
    public static int factorial(int number){
        if(number == 1)return 1;
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.format("%d %d %d 5d",
                addition(3,4),
                subtraction(7,5),
                multiplication(4,4),
                division(10,2)
                );
        factorial(10);
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do{
            System.out.println("Roll a dice pick your sides: ");
            userInput = scanner.next();
            Dice dice = new Dice(Integer.parseInt(userInput));
            System.out.format("Your dice roll: %s\n", dice.roll);
        } while(!userInput.equals("no"));


    }
}
