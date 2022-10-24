package src.messingAround;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePractice {

    public final String ROOT_DIRECTORY = "/";
    public final String CURRENT_DIRECTORY = ".";
    public final String HOME_DIRCTORY = "";


    public static void main(String[] args) throws FileNotFoundException {
    }

    private static void listFiles(File directory) throws FileNotFoundException{
        File[] files = directory.listFiles();
        for(File file: files){
            System.out.println(file.getName());
        }
    }
}
