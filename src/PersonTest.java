package src;

import src.*;
import src.util.Input;

public class PersonTest {
    public static void main(String [] args){

        Input input = new Input();

        Person michael = new Person("Michael");
        Person jackson = new Person("Jackson");
        Home home =  new Home(michael);
        michael.divorce(home, jackson);
        String name = input.getString("Enter a name to create a person: ");
        Person newPerson = new Person(name);
        System.out.printf("\"WAAAAAAA WAAAAAA\" A new person has been born named: %s", name);



    }
}
