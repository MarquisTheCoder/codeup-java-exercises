

package src.messingAround;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ReadingAndWriting {
    public static void main(String [] args
    ){
        //learning to read to write to files
        //lots of control over the file system

        //File IO is important for server logs

        //Path interface represents a path in the file system
        //Paths has methods for interacting and retrieving paths
        File file = new File("./Circle.png");
        Path myPath = Paths.get(".");

//        try{
//            Files.readAllLines(Paths.get("./args.txt"));
//        }catch (NoSuchFileException e){
//            System.out.println("This file does not exist in the system");
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("This file io is done");
//        }
//

            File file1 = new File("./src");
            Path srcDirectoy = Paths.get("./src");

            System.out.println(srcDirectoy.getParent());

            if(file1.isDirectory()){
                Arrays.stream(Objects.requireNonNull(file1.listFiles())).
                        toList().forEach(System.out::println);
            }

            File highLow = new File("./src/HighLow.java");

            if(highLow.exists()){

                try{
                    Scanner read = new Scanner(highLow);
                    while(read.hasNext()){
                        System.out.println(read.nextLine());
                    }
                    read.close();
                }catch (IOException ioException){
                    ioException.printStackTrace();
                }

            }

            File newFile = new File("MyFile.txt");
            if(!newFile.exists()) {
                try {
                    newFile.createNewFile();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

                List<String> newContent = Arrays.asList("new", "Content");
                Scanner userChoice = new Scanner(System.in);
                String input;

                //Making a loop to ask for user input until exit
                //command is entered
                do {

                    System.out.print("Enter a new line to be entered('exit'-> quit): ");
                    input = userChoice.nextLine();
                    //turning user input into array so it can be entered into the Files.write method
                    List<String> inputList = Arrays.asList(input);

                    try {
                        //making sure "exit" isn't written into our practice file
                        if(!input.equalsIgnoreCase("exit"))
                            Files.write(newFile.toPath(), inputList, StandardOpenOption.APPEND);
                        //io exception for the file handling
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    //ends the loop on the exit command
                }while(!input.equalsIgnoreCase("exit"));

                userChoice.close();


//
//        if(file.exists()){
//            System.out.println("This file exist in our project!");
//        }else{
//            System.out.println("This file does not exist in our project");
//        }

    }
}
