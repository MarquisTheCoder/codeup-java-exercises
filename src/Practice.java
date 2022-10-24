package src;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static int subtractTen(int number){
        return number - 10;
    }
    public static double average(ArrayList<Double> numbers){
        double sum = 0.0;
        for(int i = 0 ; i < numbers.size() - 1; i++){
            sum += numbers.get(i);
        }
        return sum / numbers.size();
    }
    public static void main(String [] args){

    }
}
