package src.util;
import java.util.Scanner;


public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public String getString(){
        String userInput = this.scanner.nextLine();
        return userInput;
    }
    public boolean yesNo(){
        String userInput = this.scanner.nextLine();
        if(userInput.equals("y") || userInput.equals("yes") || userInput.startsWith("y")){
            return true;
        }
        return false;
    }

    public void getInt(int minInt, int maxInt){
        System.out.println("getting the next int");
        int userInput;
        do{
            userInput = Integer.parseInt(this.scanner.next());
        }while(userInput < minInt || userInput > maxInt);

    }
    public void getDouble(double minDub, double maxDub){
        System.out.println("getting the next int");
        double userInput;
        do{
            userInput = Double.parseDouble(this.scanner.next());
        }while(userInput < minDub && userInput > maxDub);

    }


}
