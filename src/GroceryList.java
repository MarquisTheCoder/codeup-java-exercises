package src;

import src.util.Input;

import java.util.ArrayList;
import java.util.HashMap;


public class GroceryList {

    //global category hashmap for the categories
    private String[] categories = {"Fruits", "Vegetables", "Grains", "Meats", "Dairy"};
    public HashMap<String, HashMap> groceryList = new HashMap<>();

    //when a new grocery list is instantiated
    //inserts all categories into the global
    //hashmap connected to a hashmap for user input.
    public GroceryList(){
        for(String category: categories){
            groceryList.put(category, new HashMap<String, Integer>());
        }
    }
    //initializes the grocery list app
    public static void groceryInit(){
        String userChoice;
        Input input = new Input();
        //app loop
        do{
            userChoice = input.getString("Would you like to start a grocery list?");

        }while(!userChoice.equals("checkout"));

    }



}
