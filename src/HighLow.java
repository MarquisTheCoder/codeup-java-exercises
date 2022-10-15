package src;

import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static void main(String [] args){
        int randomNumber = (int)(Math.random() * 100) + 1;
        int userChoice;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Pick a number between 1-100: ");
            userChoice = Integer.parseInt(scanner.next());
            if(userChoice > randomNumber){
                System.out.println("LOWER");
            }else if(userChoice < randomNumber){
                System.out.println("HIGHER");
            }else{
                System.out.println("GOOD GUESS");
                break;
            }
        }
    }
}
