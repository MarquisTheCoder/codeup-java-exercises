package src.messingAround;

import src.Beast;

import java.util.*;

public class CollectionsLecture {
    public static void main(String [] args){

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,23,5,6,23,75,93,3));
        Collections.sort(numbers);
        //Syntax for adding multiple objects to array list at once
        List<Beast> aotCatalog = new ArrayList<>(
                List.of(new Beast("Eren Jaeger",100, 20),
                        new Beast("Zeke Yaeger", 140, 0),
                        new Beast("Reiner braun", 90, 50)));


        //lowest to highest
        aotCatalog.sort(Comparator.comparing(Beast::getHitPoints));

        System.out.println("Sorting by hitpoints least to greatest");
        for(Beast titan: aotCatalog){
            System.out.println(titan.getName());
        }

        System.out.println();
        //highest to lowest
        Collections.reverse(aotCatalog);
        System.out.println("Sorting by hitpoints greatest to least");
        for(Beast titan: aotCatalog){
            System.out.println(titan.getName());
        }





//        aotCatalog.forEach(titan ->
//                System.out.println(titan.getName())
//        );
//
//        //Simpler syntax but no access to the index
//        //Enhanced for loop
//        for(Beast titan : aotCatalog){
//            System.out.println(titan.getName());
//        }
//
//
//        for(int i = 0; i < aotCatalog.size(); i++){
//            System.out.println(aotCatalog.get(i).getName());
//        }




    }
}
class Game{

    class level{
        public void nextLevel(){
        }

    }

    //initialize the game
    public static void init(){
        String initialGameMessage = "\"This is the start of the war against titans...proceed with caution.\"";
        System.out.println(initialGameMessage);
        System.out.println("Pick your beast: ");
        System.out.println("""
                1.) Attack Titan
                2.) Armored Titan
                3.) Beast Titan 
                4.) Founding Titan
                """);
    }

}