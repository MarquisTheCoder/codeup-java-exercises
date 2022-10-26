package src.messingAround;

import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
    CODE SAMPLES...
    - Encountering Runtime Exceptions
    - Throwing Exceptions
    - Handling Checked Exceptions
        - Try-Catch
        - Throws
    - Custom exceptions
 */

class NameIsBobException extends Exception {
    public NameIsBobException(String message) {
        super(message);
    }
}

public class ExceptionsLecture {

    public static void main(String[] args) {

        // throwing exceptions

//        throw SomeException("Exception message here");
//        throw new RuntimeException("You did something wrong. Sorry...");

        // unchecked exceptions

//        int x = 1;
//        int y = 0;
//        int value = x / y; // will throw ArithmeticException at runtime
//
//        addTwoAndTwo(3, 1); // will only throw an exception at runtime


        // checked exceptions

//        makeConnection();

        // multiple catches and finally

//        try {
//            printRiskyInput();
//        } catch (PrinterException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            sc.close();
//        }

        // custom exceptions

//        soutName("Justin");
//        soutName("Bob");

        int [] numbers  = {1,2,3};
        try{
            System.out.println(numbers[444]);
        }catch(Exception e){
            System.out.println("\nhey..bro...you know that index is out of bounds....c'mon we've talked about this\n " +
                    "I expected more from you you like really? Are you serious? I've tried to warn you not to do this multiple\n" +
                    "times... this is the last.. you're fire..sadly there is nothing I can do. Have a nice life bro.\n");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        }

    }

    private static final Scanner sc = new Scanner(System.in);

    // this is a method that throws the RuntimeException, IllegalArgumentException
    private static int addTwoAndTwo(int num1, int num2) {
        if (num1 != 2 || num2 != 2) {
            throw new IllegalArgumentException("Inputs must both be the number 2");
        }
        return num1 + num2;
    }

    /**
     * THINK OF THIS METHOD NOT AS SOMETHING YOU WOULD WRITE AS A DEVELOPER, BUT USE FROM ANOTHER LIBRARY
     */
    private static void connectToDatabase() throws SQLException {
        Random r = new Random();
        if (r.nextInt(2) == 0) {
            throw new SQLException("Can't connect to database");
        } else {
            System.out.println("Connecting to database...");
        }
    }

    /**
     * THINK OF THIS METHOD AS CODE YOU WOULD WRITE AS THE APPLICATION DEVELOPER
     */
//    private static void makeConnection() {
//        // we need to handle the possible exception thrown by the connectToDatabase method
//        // we can either handle the exception with a try-catch block in this method or bump up
//        // the responsibility of adding the try-catch block to the main method using the throws keyword
//        connectToDatabase(); // what happens if the random number is 0 (can't connect to the database?)
//    }

    public static void soutName(String name) throws NameIsBobException {
        if (name.equalsIgnoreCase("bob")) {
            throw new NameIsBobException("NOOOOOOO!!!!");
        } else {
            System.out.println(name);
        }
    }

    public static void printRiskyInput() throws Exception {
        String userInput = sc.next();
        if (userInput.length() > 10) {
            throw new PrinterException("Input too long to print!!");
        }

        if (userInput.equalsIgnoreCase("hello")) {
            throw new Exception("Can't enter hello.");
        }
    }
}
