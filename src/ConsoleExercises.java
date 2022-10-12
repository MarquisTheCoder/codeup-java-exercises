package src;

import java.util.Scanner;




public class ConsoleExercises {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name NOW!: ");
        String nameInput = input.nextLine();
        System.out.printf("Nice to meet you %s %n", nameInput);
        input.close();

        Scanner scanner = new Scanner(System.in);
        int inputRegister = scanner.nextInt();
        scanner.close();

        Scanner threeWords = new Scanner(System.in);
        String firstWord = threeWords.next();
        String secondWord = threeWords.next();
        String thirdWord = threeWords.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        threeWords.close();

        System.out.println("This is a break string");

        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence);



        /*Getting the classroom perimeter with scanners*/
        System.out.print("x: ");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next());
        System.out.print("y: ");
        int y = Integer.parseInt(scanner.next());
        System.out.print("z: ");
        int z = Integer.parseInt(scanner.next());

        System.out.print("Class perimeter is: ");
        System.out.println(String.format("%d", y * x));
        System.out.print("Class volume is: ");
        System.out.println(String.format("%d", x * y * z));
    }
}
