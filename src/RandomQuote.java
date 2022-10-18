package src;

public class RandomQuote {
    private static String[] quotes = {"quote1","quote2","quote3","Quote4"};
    public static String get(){
        return quotes[(int)(Math.random() * quotes.length - 1 )];
    }
}
