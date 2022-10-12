package src;

public class StringExercise {
    public static void main(){

        String edu = "We don't need no education";
        String thought = "We don't need no thought control";
        String check = "Check \"This\" out, \"s inside \"s ";
        String windows = "In windows, the main drive is usually C:\\\\";
        String back = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n";

        print(edu);
        print(thought);
        print(check);
        print(windows);
        print(back);

    }

    public static void print(String string){
        System.out.println(string);
    }
}
