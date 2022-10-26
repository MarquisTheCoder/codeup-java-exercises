package src.groceries;

import src.util.Input;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static java.lang.System.exit;


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

    public void printCategories(String[] categories){
        System.out.println("Categories: ");
      for(int i = 0; i < categories.length -1; i++){
          System.out.format("%d.) %s \n", i, categories[i]);
      }
        System.out.println("All");
    }

    public void outputChoice(String choice){
        System.out.printf("\u001B[36m"+ "                   You entered %s%n" + "\u001B[0m", choice);
    }
    public void loop(String userChoice){
        Input input = new Input();
        userChoice = input.getString("What category of item would you like to enter?");
          if (groceryList.containsKey(userChoice)) {
              String categoryChoice = userChoice;
              outputChoice(userChoice);
              while (!userChoice.equalsIgnoreCase("checkout")) {
                  String item = input.getString("Enter an item: ");
                  outputChoice(item);
                  String amount = input.getString("Enter amount: ");
                  outputChoice(amount + " " + item);
                  groceryList.get(categoryChoice).put(item, Integer.parseInt(amount));
                  System.out.println(groceryList.get(categoryChoice));

                  userChoice = input.getString("Would you like to checkout(Checkout or Go back) or ignore: ");
                  
                  if (userChoice.equalsIgnoreCase("back")) {
                      printCategories(categories);
                      init();
                      
                  } else if (userChoice.equalsIgnoreCase("checkout")) {
                      printCategories(categories);
                      ArrayList<String> categoryList = new ArrayList<>(groceryList.keySet().stream().toList());
                      Collections.sort(categoryList);
                      for (String sEach : categoryList) {
                         ArrayList<String> itemList =  new ArrayList<>(groceryList.get(sEach).keySet().stream().toList());
                         Collections.sort(itemList);

                          System.out.println("\u001B[36m" + sEach + "\u001B[0m");
                          itemList.forEach(itemKey -> {
                              System.out.print("---------" + itemKey + " ");
                              System.out.print(groceryList.get(sEach).get(itemKey));
                              System.out.println();
                          });
                      }
                  }
              }
          }
    }
    //initializes the grocery list app
    public void init(){
        String userChoice;
        Input input = new Input();

         userChoice = input.getString("Would you like to start a grocery list?: ");
         if(userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("n")){
             exit(1);

         }
        //app loop
        do{

                userChoice = input.getString("Would you like to enter an item?: ");
                if(userChoice.equalsIgnoreCase("yes") || userChoice.equalsIgnoreCase("y")){
                    printCategories(categories);
                    loop("");
                }else{
                    break;
                }


        }while(!userChoice.equals("checkout"));
        List<String> itemNames = new ArrayList<>(groceryList.get("Fruits").keySet().stream().toList());
        Collections.sort(itemNames);
        System.out.println(itemNames);
//        List<String> beastNames = new ArrayList<>(beastHashMap.keySet().stream().toList());
    }



}
