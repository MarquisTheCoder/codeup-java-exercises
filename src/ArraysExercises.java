package src;


import src.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String [] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        int[] numberss = new int[5];
        numberss[0] = 1;
        numberss[1] = 2;
        numberss[2] = 4;
        numberss[3] = 5;
        numberss[4] = 1;

        for(int number: numberss){
            System.out.println(number);
        }




//        Person[] people = new Person[3];
//        people[0] = new Person();
//        people[0].name = "Josh";
//        people[1] = new Person();
//        people[1].name = "Carly";
//        people[2] = new Person();
//        people[2].name = "Moonbop";
//        int result = 1 > 2 ? 1 : 2;
      Person john = new Person();

      ArrayList<Person> peeps = new ArrayList<>();

      peeps.add(new Person("Josh"));
      peeps.add(new Person("Sandy"));
      peeps.add(new Person("Wendy"));

      peeps.forEach(person -> System.out.println(person.name));
      peeps.forEach(person -> {
          person.damagePlayer(10);
          System.out.println(person.health);
      });


      Person[] people = new Person[4];

      people = addPerson(john, people);

//      newPeople[newPeople.length -1].name = "Marquis";
//      newPeople[newPeople.length -1].sayHello();

    }

    public static Person[] addPerson(Person newPerson, Person[] people){
        Person[] newPeople = new Person[people.length + 1];
        System.arraycopy(people, 0, newPeople, 0, newPeople.length - 1);
        newPeople[newPeople.length-1] = newPerson;
        return newPeople;
    }



}

