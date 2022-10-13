package src;

import java.util.Random;

public class ServerNameGenerator {
    public static void main(String [] args){
        String[] nouns = {"Fredrich", "Einstein","Astronaut", "Cybernaut", "Developer",
                "Fighter", "Winner", "Ubermensch", "Talker", "Tasker"};
        String[] adjectives = {"Big", "Small", "Super", "Fast", "Tall",
                "Smart","Diligent", "Resourceful", "Kind", "Monstrous"};
        System.out.format("Here is your server name: %s-%s",
                randomString(adjectives), randomString(nouns));
    }
    public static String randomString(String [] stringArray){
        Random rand = new Random();
        int initRandom = rand.nextInt(stringArray.length - 1);
        return stringArray[initRandom];
    }
}
