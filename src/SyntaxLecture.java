package src;

public class SyntaxLecture {
    public static void main(String [] args){
        //declare a variable without initializing it in java

        int weight;
        int age;
        String breed;
        String built;


        // Initializing after declaration
        age = 22;
        weight = 160;
        String name = "Marquis";
        breed = "different";
        built = "Also different";

        // Initialize and declare at the same time
        String grinch = "Grinch";
        int cuteness = 10;

        //Statement: JVM, do something
        System.out.println("This is a string");
        System.out.println(name + " " + "is built" + " " + built);

        byte register = 1;
        long c = 90200000000000000L;

        // Conditional logic
        if(cuteness > 7){
            System.out.println("Too cute bro..Too cute");
        }else{
            System.out.println("Get the freak outta here!....ugly, ugly, ugly!");
        }
        System.out.println((int) Math.pow(2,3));
        System.out.println("My favorite numbeur");
        //using the semi-colon always is good practice amongst multiple domains

    }


}
