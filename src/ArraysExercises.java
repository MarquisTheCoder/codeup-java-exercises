package src;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String [] args){
        int [][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };

        for(int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
}
