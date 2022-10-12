package src.shapes;
import src.shapes.Circle;
import src.util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();
        // loop that constantly ask the user if they want to make a circle
        do{

            System.out.print("Enter the radius of your circle: ");
            //parses the floating number from user input and stores it in the
            //circles private radius FIELD.
            Circle circle = new Circle(Double.parseDouble(input.getString()));
            System.out.printf("Circle area is: %f\n", circle.area());
            System.out.printf("Circle circumference is: %f\n", circle.circumference());
            System.out.print("Would you like to make a circle? y/n: ");

        }while(input.yesNo());

        int[] x = {1,2,3,4,5,6,7,8,9,10};

        for(int i: x){
            System.out.println(i);
        }



    }
}
