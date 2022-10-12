package src;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){
//        for(int i = 5; i < 16; i++){
//            System.out.print(String.format("%d ", i));
//        }
//
//        for(int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }
//        for(int i=100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//
//        double exp = 2;
//
//        do{
//            System.out.println(exp);
//            exp = Math.pow(exp,2);
//        }while(exp < 1000000);
//
//
//        for(int i = 0; i <= 100; i++){
//            boolean fizz = i % 3 == 0;
//            boolean buzz = i % 5 == 0;
//            boolean fizzBuzz = fizz && buzz;
//            if(fizzBuzz){
//                System.out.println("Fizz-Buzz");
//            } else if (buzz) {
//                System.out.println("Buzz");
//            }else{
//                System.out.println("Fizz");
//            }
//        }


        System.out.print("Enter an integer: ");

        Scanner scan = new Scanner(System.in);
        int iterator = Integer.parseInt(scan.next());


        System.out.print("Do you wish to continue?[y/n]: ");
        String confirm = scan.next();

        if(confirm.equals("y")){
            System.out.println("Number|  Squared|  Cubed");
            for(int i = 0; i <= iterator; i++){
                System.out.println(String.format("%d   |   %d|   %d",
                        i, i*i, (int) Math.pow(i,3)));
            }
        }

        //convert given numbers into letter
        System.out.println("Enter a grade (0-100): ");
        int numberGrade = Integer.parseInt(scan.next());
        if(numberGrade > 88 && numberGrade <= 100){
            System.out.println("A");
        } else if (numberGrade >= 80) {
            System.out.println("B");
        } else if (numberGrade >= 67) {
            System.out.println("C");
        } else if (numberGrade >= 60) {
            System.out.println("D");
        }else if( numberGrade >= 0){
            System.out.println("F");
        }else{
            System.out.println("Not a valid GRADE DUDE!");
        }

//        if(numberGrade >= 100){
//            System.out.println("A");
//        }else{
//            System.out.println("You failed!");
//        }

    }


    //FIZZBUZZ


}
