
import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        System.out.print("Say something to Bob: ");
        Scanner scanner = new Scanner(System.in);
        String dialogue = scanner.nextLine();

        if(dialogue.endsWith("?")){
            System.out.println("Sure, But I don't really know!");
        } else if (dialogue.endsWith("!")) {
            System.out.println("Whoa man calm dowwwwwn..");
        }else if(dialogue.isEmpty()){
            System.out.println("fine be that way.....");
        }else{
            System.out.println("Whateverr!");
        }
    }
}
