package src.messingAround;

import com.sun.jdi.IntegerType;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.regex.Matcher;


abstract class MonsterOfTheNight{

    public static String type = "Monster";
    public static boolean eatsHumans = true;
    public static boolean real = true;


    public String name;
    public String weaknesses;

    //private variables for the monster
    protected int powerLevel;
    protected int stamina;
    protected int health;

    public void Chant(){
        System.out.println("ARGGGGGGGH");
    }
    public void damage(int dmg){
        this.health -= dmg;
    }
    public void attack(MonsterOfTheNight monster){
        monster.damage(10);
    }

}

class Vampire extends MonsterOfTheNight{
    public Vampire(){

    }
    public Vampire(String name, String weaknesses){
        this.name = name;
        this.weaknesses = "fire";
        this.health = -100;
        this.stamina = 100;
        this.powerLevel = 666;
    }
    public Vampire(String name, String weaknesses, int health, int stamina, int powerLevel){
        this.name = name;
        this.weaknesses = weaknesses;
        this.health = health;
        this.stamina =  stamina;
        this.powerLevel = powerLevel;
    }

    @Override
    public void Chant() {
        System.out.println("We will have our victory! HISSSSS>.,...");
    }
}
public class MethodsExercises {

    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Carl");
        names.add("Josh");
        names.add("Timmy");
        names.add("Barney");
        names.forEach(x ->{
            x = x.toUpperCase();
            System.out.println(x);
        });

        Consumer<Integer> multiplyBy10 = x -> System.out.println(x * 10);

        HashMap<String, Integer> EmployeeAges = new HashMap<>();

        EmployeeAges.put("Carl", 65);

    }



    private static int addition(int x, int y) throws Exception{
        try{
            return x + y;
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Type collision error cannot add to type int");
        }
    }
    private static int modulus(int x, int y) throws Exception{
        try{
            return x % y;
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("Type collision error cannot add to type int");
        }
    }
}
