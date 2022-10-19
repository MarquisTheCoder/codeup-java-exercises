package src;



public class Person {
    public static String race = "Human";
    public static boolean wasBorn = true;

    public String name;
    public int health = 100;
    public Person(){
        System.out.println("The person is being created");
    }
    public Person(String name){
        this.name = name;
        System.out.println("Their is a person named " + name + " being created!");
    }

    public String getName(){ return this.name; }

    public void setName(String newName){
        this.name = newName;
    }
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
    public int checkHealth(){
        return this.health;
    }
    public void damagePlayer(int damage){
        this.health -= damage;
    }

    public static void main(String [] args){

        Person me = new Person();
        me.name = "Marquis";
        me.sayHello();
        me.damagePlayer(10);
        System.out.println(me.checkHealth());

    }
}
