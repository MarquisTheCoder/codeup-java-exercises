package src;

import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static void main(String [] args){
        int randomNumber = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guesses = 0;

        while(true){
            System.out.print("Pick a number between 1-100: ");
            int userChoice = Integer.parseInt(scanner.next());
            guesses+=1;
            if(userChoice > randomNumber){
                System.out.println("LOWER");
            }else if(userChoice < randomNumber){
                System.out.println("HIGHER");
            }else{
                System.out.format("GOOD GUESS\nIt took (%d) attempts", guesses);
                break;
            }
        }
    }
}
