package src.util;
import src.util.Input;


public class InputTest {
    public static void main(String[] args){
        Input x = new Input();
        System.out.println(x.getString());
        System.out.println(x.yesNo());
        x.getInt(4,9);
        x.getDouble(4.333, 22.3);

    }
}
