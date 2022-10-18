package src.util;
import java.util.Scanner;


public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.print("Enter an input: ");
        String userInput = scanner.nextLine();
        return userInput;
    }
    public boolean yesNo(){
        System.out.print("Enter yes or no: ");
        String userInput = scanner.nextLine();
        if(userInput.equals("y") || userInput.equals("yes") || userInput.startsWith("y")){
            return true;
        }
        return false;
    }

    public int getInt(int minInt, int maxInt) throws NumberFormatException{
        int userInput = 0;

       do{
            System.out.print("find the correct integer: ");
            try{
                userInput = Integer.parseInt(scanner.next());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Enter another number");
            }
        } while(userInput < minInt || userInput > maxInt);
        System.out.printf("Correct int found: %d ", userInput);
        return userInput;
//        do{
//            userInput = Integer.parseInt(this.scanner.next());
//        }while(userInput < minInt || userInput > maxInt);
//        return userInput;
    }
    public double getDouble(double minDub, double maxDub) throws NumberFormatException{
        System.out.println("\ngetting the next double");
        double userInput = 0;
        do{
            System.out.print("find the correct double: ");
            try{
                userInput = Double.parseDouble(scanner.next());
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("Enter another number");
            }
        }while(userInput < minDub || userInput > maxDub);
        System.out.printf("found a correct double: %f ", userInput );
        return userInput;

    }


}
