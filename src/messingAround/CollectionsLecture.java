package src.messingAround;

import src.Beast;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsLecture {
    public static void main(String [] args){

        ArrayList<Beast> aotCatalog = new ArrayList<>();
        Beast attackTitan = new Beast();
        Beast armoredTitan = new Beast();
        Beast beastTitan =  new Beast();
        Beast foundingTitan = new Beast();

    }
}
class Game{

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

    public static void levelOne(int characterChoice){

    }

}