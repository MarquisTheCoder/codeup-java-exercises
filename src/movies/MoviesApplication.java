package src.movies;

import java.util.Scanner;
import src.movies.*;
public class MoviesApplication {
    static Movie[] globalMovieArray = MoviesArray.findAll();
    public static void main(String[] args){
        System.out.println("\nWhat would you like to do?: \n");
        System.out.println("""
                0 - exit.
                1 - view all movies.
                2 - view movies in the animated category.
                3 - view movies in the drama category.
                4 - view movies in the horror category.
                5 - view movies in the scifi categoery.
                """);

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();

            switch (userChoice) {
                case "1" -> {
                    for (Movie movie : globalMovieArray) {
                        System.out.format("%s--%s\n", movie.getData()[0], movie.getData()[1]);
                    }
                }
                case "2" -> findMoviesByCategory("animated");
                case "3" -> findMoviesByCategory("drama");
                case "4" -> findMoviesByCategory("horror");
                case "5" -> findMoviesByCategory("scifi");
                default -> System.out.println("This is not an option!");

            }
        }

    public static void findMoviesByCategory(String category){
        for(Movie item: globalMovieArray){
            if(item.getData()[1].equals(category)){
                System.out.format("%s--%s \n", item.getData()[0], item.getData()[1]);
            }
        }
    }


}
