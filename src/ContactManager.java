package src;

import java.io.File;
import java.util.Arrays;
import java.util.List;

class Contact{
    private String name;
    private String number;

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
}

public class ContactManager {
    private static List<String> contactsList;
    public ContactManager(){
        File contactFile = new File("ContactFile.txt");
        if(contactFile.exists()){

        }
    }
}
