package src.messingAround;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FilePractice {

    public final String ROOT_DIRECTORY = "/";
    public final String CURRENT_DIRECTORY = ".";
    public final String HOME_DIRCTORY = "";


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> fileNames = new ArrayList<>();


        fileNames.add("index.html");
        fileNames.add("carlos.css");
        fileNames.add("jigglyWiggly.js");

        fileNames.forEach(file ->{
            if(Files.exists(Paths.get(file))){
                System.out.printf(file + " " + "exist in the file path.\n");

            }else{

                System.out.printf(file + " " + "does not exist in the file path.\n");
                 try{
                    Files.createFile(Paths.get("./" + file));
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        });

    }

    private static void listFiles(File directory) throws FileNotFoundException{
        File[] files = directory.listFiles();
        for(File file: files){
            System.out.println(file.getName());
        }
    }
}
