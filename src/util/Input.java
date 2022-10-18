package src.util;
import java.util.Scanner;


public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public String getString(){
        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean yesNo(){
        String userInput = scanner.nextLine();
        if(userInput.equals("y") || userInput.equals("yes") || userInput.startsWith("y")){
            return true;
        }
        return false;
    }

    public int getInt(int minInt, int maxInt) throws NumberFormatException{
        int userInput = Integer.MIN_VALUE;
        while(userInput < minInt || userInput > maxInt){
            System.out.print("find the correct integer: ");
            try{
                userInput = Integer.parseInt(scanner.next());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Enter another number");
            }
        }
        return userInput;
//        do{
//            userInput = Integer.parseInt(this.scanner.next());
//        }while(userInput < minInt || userInput > maxInt);
//        return userInput;
    }
    public double getDouble(double minDub, double maxDub) throws NumberFormatException{
        System.out.println("getting the next double");
        double userInput = Double.MIN_VALUE;
        while(userInput < minDub || userInput > maxDub){
            System.out.print("find the correct double: ");
            try{
                userInput = Double.parseDouble(scanner.next());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Enter another number");
            }
        }

        return userInput;

    }


}
